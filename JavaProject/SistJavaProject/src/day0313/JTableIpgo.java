package day0313;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class JTableIpgo extends JFrame implements ActionListener {

	Container cp;
	JTextField tfSang,tfSu,tfDan;
	JButton btnAdd,btnDel;
	DefaultTableModel model;
	JTable table;	
	//저장후 불러올 파일명
	static final String FILENAME="C:\\sist0217\\work\\sangipgo.txt";
	int selectRow=-1; //선택하지 않은 행
	
	//생성자
	public JTableIpgo(String title) {
		super(title);
		
		//위치,너비
		this.setBounds(1000, 100, 350, 600);		
		cp=this.getContentPane();
		//메인프레임 종료
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//창 색상
		cp.setBackground(new Color(245,245,245));		
		initDesign();
		
		
		
		//종료시 테이블 데이타 저장
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				//저장 메서드 호출
				tableDataSave();
			}
		});
		
		this.setVisible(true);	
		//테이블을 생성후 파일데이터 추가
				tableDataRead();
		
	}
	
	//저장시 딸기:3:1000:3000
	public void tableDataSave()
	{
		FileWriter fw=null;
		try {
			fw=new FileWriter(FILENAME);
			for(int i=0;i<table.getRowCount();i++) //행
			{
				//누적변수
				String s="";
				for(int j=0;j<table.getColumnCount();j++) //열
				{
					s+=table.getValueAt(i, j)+":";
				}
				
				//마지막 : 제거 (항상 사용함 공식정의)
				s=s.substring(0, s.length()-1);
				fw.write(s+"\n");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
	}
	
	//처음 생성시 테이블에 불러올 메서드
	public void tableDataRead()
	{
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader(FILENAME);
			br=new BufferedReader(fr);
			while(true)
			{
				String s=br.readLine();
				if(s==null)
					break;
				
				String [] data=s.split(":");
				
				//table에 배열형 데이타 추가
				model.addRow(data);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public void initDesign()
	{
		this.setLayout(null);
		
		JLabel lbl1=new JLabel("상품명");
		JLabel lbl2=new JLabel("수량");
		JLabel lbl3=new JLabel("단가");
		
		lbl1.setBounds(50, 20, 80, 30);
		this.add(lbl1);
		lbl2.setBounds(150, 20, 80, 30);
		this.add(lbl2);
		lbl3.setBounds(250, 20, 80, 30);
		this.add(lbl3);
				
		tfSang=new JTextField();
		tfSang.setBounds(25, 60, 90, 30);
		this.add(tfSang);
		
		tfSu=new JTextField();
		tfSu.setBounds(120, 60, 90, 30);
		this.add(tfSu);
		
		tfDan=new JTextField();
		tfDan.setBounds(220, 60, 90, 30);
		this.add(tfDan);
		
		//추가, 삭제 버튼 생성
		btnAdd=new JButton("추가");
		btnAdd.setBounds(80, 130, 80, 30);
		this.add(btnAdd);
		
		btnDel=new JButton("삭제");
		btnDel.setBounds(180, 130, 80, 30);
		this.add(btnDel);
		
		//버튼2개에 이벤트 추가
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		
		//테이블 생성
		String [] title= {"상품명","입고수량","입고단가","총금액"};
		model=new DefaultTableModel(title, 0); //0은 행갯수
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		js.setBounds(20, 180, 290, 350);
		this.add(js);
		
		//테이블 클릭시 선택한 행번호를 selectRow에 저장
		table.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				
				selectRow=table.getSelectedRow(); //행번호 저장
			}
		});
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getSource();
		if(ob==btnAdd)
		{
			String sang=tfSang.getText().trim();
			String su=tfSu.getText().trim();
			String dan=tfDan.getText().trim();
			
			if(sang.length()==0||su.length()==0||dan.length()==0)
			{
				JOptionPane.showMessageDialog(this, "3개의 값을 모두 입력해주세요");
				tfSang.setText("");
				tfSu.setText("");
				tfDan.setText("");
				return;
			}
			int tot=Integer.parseInt(su)*Integer.parseInt(dan);
			
			NumberFormat nf=NumberFormat.getInstance();
			
			Vector<String> data=new Vector<String>();
			data.add(sang);
			data.add(su);
			data.add(dan);
			data.add(nf.format(tot));
			
			//테이블에 추가
			model.addRow(data);
			
			
			//입력값 지워주기(초기화)
			tfSang.setText("");
			tfSu.setText("");
			tfDan.setText("");
		}
		
		else if(ob==btnDel)
		{
			if(selectRow==-1)
				JOptionPane.showMessageDialog(this, "삭제할 행을 선택해 주세요");
			else
			{
				model.removeRow(selectRow);
				selectRow=-1;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTableIpgo("스윙테이블모델_상품입고");
	}



}
