package day0310;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//버튼 누르면 배경색깔 바뀌는거
public class BntEventColor6 extends JFrame  {

	Container cp;
	JButton btn1,btn2;
	
	//생성자
	public BntEventColor6(String title) {
		super(title); //JFrame부모생성자를 통해서 창제목을 통해서 제목을 입력
		
		//위치,너비
		this.setBounds(1000, 100, 700, 800);//창 위치,크기
		
		
		cp=this.getContentPane();
		cp.setBackground(new Color(127,255,212));
		
		initDesign();
		
		
		this.setVisible(true);
				
	}
	
	public void initDesign() {
		
		this.setLayout(new FlowLayout());		
		
		btn1=new JButton("배경색을 파란색으로 변경");
		this.add(btn1);
		
		//익명 내부클래스로 이벤트
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cp.setBackground(Color.blue);				
			}
		});
		
		btn2=new JButton("배경색을 노랑색로 변경");
		this.add(btn2);
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cp.setBackground(Color.yellow);
			}
		});
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BntEventColor6("버튼 이벤트 #6");
	}



}
