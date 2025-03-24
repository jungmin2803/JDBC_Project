package day0324;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import day0319.DbConnect;

public class updateScore extends JFrame{
	
	DbConnect db=new DbConnect();
	
	Container cp;
	JTextField tfName, tfJava, tfJsp, tfSpring;
	JComboBox<String> cbBan;
	JButton btnMod; //입력한 점수를 메인에 수정하는 버튼
	String num; //수정할 번호
	
	//생성자
	public updateScore(String title) {
		super(title);
		
		//위치,너비
		this.setBounds(1000, 100, 200, 300);		
		cp=this.getContentPane();
		//메인프레임 종료
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//창 색상
		cp.setBackground(Color.pink);		
		initDesign();
		//this.setVisible(true);	
	}
	
	public void initDesign()
	{
		this.setLayout(null);
		JLabel title1=new JLabel("학생명");
		JLabel title2=new JLabel("반");
		JLabel title3=new JLabel("Java");
		JLabel title4=new JLabel("Jsp");
		JLabel title5=new JLabel("Spring");
		
		title1.setBounds(20, 10, 60, 30);
		this.add(title1);		
		title2.setBounds(20, 40, 60, 30);
		this.add(title2);
		title3.setBounds(20, 70, 60, 30);
		this.add(title3);
		title4.setBounds(20, 110, 60, 30);
		this.add(title4);
		title5.setBounds(20, 150, 60, 30);
		this.add(title5);
		
		tfName=new JTextField();
		String [] ban= {"1강의장","2강의장","3강의장","4강의장"};
		cbBan=new JComboBox<String>(ban);
		tfJava=new JTextField();		
		tfJsp=new JTextField();
		tfSpring=new JTextField();
		
		tfName.setBounds(90, 15, 70, 20);
		this.add(tfName);		
		cbBan.setBounds(90, 45, 70, 20);
		this.add(cbBan);		
		tfJava.setBounds(90, 80, 70, 20);
		this.add(tfJava);		
		tfJsp.setBounds(90, 120, 70, 20);
		this.add(tfJsp);		
		tfSpring.setBounds(90, 160, 70, 20);
		this.add(tfSpring);
		
		//버튼
		btnMod=new JButton("수정");
		btnMod.setBounds(50, 200, 90, 30);		
		this.add(btnMod);		
		
	}

	
}
	
	

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new AddScore("성적 추가폼");
	}*/


