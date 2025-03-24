package day0324;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MulticastSocket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import day0319.DbConnect;

public class SwingScoreDB extends JFrame implements ActionListener{
	
	AddScore addScore=new AddScore("성적추가 폼");	
	updateScore uScore=new updateScore("성적수정폼");
	
	Container cp;
	DbConnect db=new DbConnect();
	DefaultTableModel model;
	JTable table;
	JButton btnAdd, btnUpdate, btnDel;
	
	
	
	//생성자
	public SwingScoreDB(String title) {
		super(title);
		
		//위치,너비
		this.setBounds(1000, 100, 500, 600);		
		cp=this.getContentPane();
		//메인프레임 종료
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//창 색상
		cp.setBackground(new Color(245,245,245));		
		initDesign();
		
		this.setVisible(true);	
	}
	
	//디자인
	public void initDesign()
	{
		
		String [] title= {"번호","이름","반","Java","Jsp","Spring","총점","평균"};
		JPanel ptop=new JPanel();
		this.add("North",ptop);
		
		model=new DefaultTableModel(title, 0);
		table=new JTable(model);
		this.add("Center", new JScrollPane(table));
		
		//테이블에 db데이타 출력
		selectTableWrite();
		
		btnAdd=new JButton("성적추가");
		btnAdd.addActionListener(this);
		ptop.add(btnAdd);
		
		btnDel=new JButton("성적삭제");
		btnDel.addActionListener(this);
		ptop.add(btnDel);
		
		btnUpdate=new JButton("성적수정");
		btnUpdate.addActionListener(this);
		ptop.add(btnUpdate);	
		
		//addscore에 있는 추가버튼에 이벤트를 추가
		
		addScore.btnAdd.addActionListener(this);
		
		//updatescore에 있는 추가버튼에 이벤트를 추가
		uScore.btnMod.addActionListener(this);
		
		
		
		
	}
	
	///////////////////////////////////테이블 출력하는 메서드
	public void selectTableWrite()
	{
		//테이블 초기화
		model.setRowCount(0);
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from stuscore order by num";
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				Vector<String> data=new Vector<String>();
				data.add(rs.getString("num"));
				data.add(rs.getString("name"));
				data.add(rs.getString("ban"));
				data.add(rs.getString("java"));
				data.add(rs.getString("jsp"));
				data.add(rs.getString("spring"));
				data.add(rs.getString("total"));
				data.add(rs.getString("average"));
				
				//테이블 추가
				model.addRow(data);							
			}
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		
	}
	
	//insert메서드 추가
	public void insertScoreData()
	{
		String name=addScore.tfName.getText();
		String java=addScore.tfJava.getText();
		String jsp=addScore.tfJsp.getText();
		String spring=addScore.tfSpring.getText();
		String ban=(String)addScore.cbBan.getSelectedItem();
		
		int tot=Integer.parseInt(java)+Integer.parseInt(jsp)+Integer.parseInt(spring);
		double avg=tot/3.0;
		
		String sql="insert into stuscore values(seq_sungjuk.nextval,?,?,?,?,?,?,?)";
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			pstmt.setString(2, java);
			pstmt.setString(3, jsp);
			pstmt.setString(4, spring);
			pstmt.setInt(5, tot);
			pstmt.setDouble(6, avg);
			pstmt.setString(7, ban);
			
			pstmt.execute();			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
		
		//addScore.dispose();
		
	}
	
	//삭제 메서드
	public void deleteScore(String num)
	{		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		System.out.println(num);
		
		
		String sql="delete from stuscore where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, num);
			
			 int n=pstmt.executeUpdate();	
			
			if(n==0)
				JOptionPane.showMessageDialog(this,"삭제할 행이 없습니다" );			
			else
				this.selectTableWrite();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}				
		
	}	
	
	public void isoneStuData(String num)
	{
		String sql="select * from stuscore where num=?";
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, num);
			
			rs=pstmt.executeQuery();
			
			if(rs.next())
			{
				uScore.num=num;
				uScore.tfName.setText(rs.getString("name"));
				uScore.tfJava.setText(rs.getString("java"));
				uScore.tfJsp.setText(rs.getString("jsp"));
				uScore.tfSpring.setText(rs.getString("spring"));
				uScore.cbBan.setSelectedItem(rs.getString("ban"));
				
				//데이타를 읽어온 수정폼이 보이게
				uScore.setVisible(true);				
			}
			else 
				JOptionPane.showMessageDialog(this, "해당번호는 없는 시퀀스 입니다");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		
	}
	
	public void updateScore()
	{
		String num=uScore.num;		
		String name=uScore.tfName.getText();
		String java=uScore.tfJava.getText();
		String jsp=uScore.tfJsp.getText();
		String spring=uScore.tfSpring.getText();
		String ban=(String)uScore.cbBan.getSelectedItem();
		
		int tot=Integer.parseInt(java)+Integer.parseInt(jsp)+Integer.parseInt(spring);
		double avg=tot/3.0;
		
			
		String sql="update stuscore set name=?,java=?,jsp=?,spring=?,ban=?,total="+tot+", average="+avg+" where num=?";
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			pstmt.setString(2, java);
			pstmt.setString(3, jsp);
			pstmt.setString(4, spring);
			pstmt.setString(5, ban);
			pstmt.setString(6, num);
			
			pstmt.execute();				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
		
		
	}
	
	
	//이벤트
	@Override
	public void actionPerformed(ActionEvent e) {
		// 각 버튼에 대한 이벤트
		Object ob=e.getSource();
		
		if(ob==btnAdd)
		{
			addScore.setVisible(true); //추가폼이 보인다
		}
		
		else if(ob==btnDel)
		{			
			String num=JOptionPane.showInputDialog("삭제할 번호를 입력해주세요");
			deleteScore(num);
			
			
		}
		
		else if(ob==btnUpdate)
		{
			String num=JOptionPane.showInputDialog("수정할 번호를 입력하세요");	
			this.isoneStuData(num);					
		}
		
		else if(ob==addScore.btnAdd)
		{
			//입력폼을 읽어와서 db에 추가
			insertScoreData();
			
			//테이블 다시 출력
			this.selectTableWrite();
			
			//초기화
			addScore.tfName.setText("");
			addScore.tfJava.setText("");
			addScore.tfJsp.setText("");
			addScore.tfSpring.setText("");
			
			
			//프레임사라지게
			addScore.setVisible(false);
			
		}
		else if(ob==uScore.btnMod)
		{
			updateScore();
			
			//테이블 다시 출력
			this.selectTableWrite();	
			
			//초기화
			uScore.tfName.setText("");
			uScore.tfJava.setText("");
			uScore.tfJsp.setText("");
			uScore.tfSpring.setText("");
			
			uScore.setVisible(false);
		}
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingScoreDB("스윙 스코어 디비");
	}

	

}
