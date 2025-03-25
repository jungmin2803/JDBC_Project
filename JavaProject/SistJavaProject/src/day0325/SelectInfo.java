package day0325;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SelectInfo extends JFrame{


	DefaultTableModel model;
	JTable table;
	Container cp;
	JButton btn1;
	
	//생성자
	public SelectInfo(String title) {
		super(title);
		
		//위치,너비
		this.setBounds(500, 100, 800, 700);		
		cp=this.getContentPane();
		//메인프레임 종료
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//창 색상
		cp.setBackground(new Color(245,245,245));		
		initDesign();
		this.setVisible(true);	
	}
	
	public void initDesign()
	{
		this.setLayout(null);
		String [] title= {"번호", "ID","모델","색상","가격","주문자이름","주문자주소","주문자번호","주문자성별","주문자국적"};
		model=new DefaultTableModel(title, 0);
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		js.setBounds(10, 300, 770, 350);
		this.add(js);
		
	}
}
