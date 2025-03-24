package day0321;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import day0319.DbConnect;

public class Ex00SawonDBSwing extends JFrame implements ItemListener,ActionListener {

	Container cp;
	JButton btnAdd, btnDel;
	DefaultTableModel model;
	JTable table;	
	JRadioButton [] rb= new JRadioButton[6];
	DbConnect db=new DbConnect();
	
	//생성자
	public Ex00SawonDBSwing(String title) {
		super(title);
		
		//위치,너비
		this.setBounds(600, 100, 700, 600);		
		cp=this.getContentPane();
		//메인프레임 종료
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//창 색상
		cp.setBackground(new Color(245,245,245));		
		initDesign();
		
		this.sawonselect(1);
		
		this.setVisible(true);	
	}
	
	public void initDesign()
	{
		this.setLayout(null);
		
		String [] title = {"번호","ID","학생명","주소","혈액형","핸드폰번호","학년","나이","생일","입력날짜"};
		model=new DefaultTableModel(title, 0);
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		js.setBounds(5, 200, 675, 350);
		this.add(js);
		
		ButtonGroup bg=new ButtonGroup();
		String [] rb_label={"전체","남자","여자","홍보부","개발부","디자인부"};
		
		int xpos=20;
		for(int i=0; i<rb_label.length;i++)
		{
			rb[i]=new JRadioButton(rb_label[i],i==0?true:false);
			rb[i].setBounds(xpos, 150, 80, 30);
			rb[i].setOpaque(false);
			bg.add(rb[i]);
			this.add(rb[i]);
			
			xpos+=110;
		}
		
		btnAdd=new JButton("추가");
		btnAdd.setBounds(20, 30, 80, 30);
		this.add(btnAdd);
		
		btnDel=new JButton("삭제");
		btnDel.setBounds(120, 30, 80, 30);
		this.add(btnDel);
		
		btnAdd.addItemListener(this);
		btnDel.addItemListener(this);
		
		
	}
	
	public void sawonselect(int select)
	{
		String sql="";
		if(select==1)		
			sql="select ROWNUM no, num ID, name, gender, buseo to_char(pay,'L999,999,999') pay from exsawon";
		else if(select==2)
			sql="select ROWNUM no, num ID, name, gender, buseo to_char(pay,'L999,999,999') pay from exsawon where gender='남자'";
		else if(select==3)
			sql="select ROWNUM no, num ID, name, gender, buseo to_char(pay,'L999,999,999') pay from exsawon where gender='여자'";
		else if(select==4)
			sql="select ROWNUM no, num ID, name, gender, buseo to_char(pay,'L999,999,999') pay from exsawon where buseo='홍보부";
		else if(select==5)
			sql="select ROWNUM no, num ID, name, gender, buseo to_char(pay,'L999,999,999') pay from exsawon where buseo='개발부'";
		else if(select==6)
			sql="select ROWNUM no, num ID, name, gender, buseo to_char(pay,'L999,999,999') pay from exsawon where buseo='디자인부'";
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			model.setRowCount(0);
			
			while(rs.next());
			{
				Vector<String> data=new Vector<String>();
				data.add(rs.getString("no"));
				data.add(rs.getString("ID"));
				data.add(rs.getString("name"));
				data.add(rs.getString("gender"));
				data.add(rs.getString("buseo"));
				data.add(rs.getString("pay"));
				
				model.addRow(data);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}	
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object ob=e.getSource();
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		
		
		if(ob==btnAdd)
		{
			String name=JOptionPane.showInputDialog("사원명을 입력해주세요");
			String gender=JOptionPane.showInputDialog("성별을 입력해주세요");
			String buseo=JOptionPane.showInputDialog("부서명을 입력해주세요");
			String pay=JOptionPane.showInputDialog("급여를 입력해주세요");
			
			
			
		}
		
		
		else if(ob==btnDel)
		{
			
		}
		
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
		Object ob=e.getSource();
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		
		for(int i=0; i<rb.length;i++)
		{
			if(ob==rb[i])
			{
				this.sawonselect(i+1);
			}
		}
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex00SawonDBSwing("스윙 연습");
	}

	

}
