package day0310;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingLayoutEx2 extends JFrame {

	Container cp;
	JButton btn1;
	//생성자
	public SwingLayoutEx2(String title) {
		super(title); //JFrame부모생성자를 통해서 창제목을 통해서 제목을 
		
		//위치,너비
		this.setBounds(1000, 100, 500, 600);//창 위치,크기
		
		
		cp=this.getContentPane();
		cp.setBackground(new Color(127,255,212));
		
		//레이아웃
		//버튼생성
		btn1=new JButton("버튼1");
		
		//프레임에 버튼 추가..기본이 BorderLayout..이경우는 추가할때 위치지정이 필수
		//this.add(btn1,BorderLayout.NORTH); //위쪽
		//this.add(btn1,BorderLayout.SOUTH); //아래쪽
		this.add("North", btn1); //첫글자가 반드시 대문자
		
		//버튼생성과 동시에 위치지정
		this.add("South",new JButton("아래쪽"));
		this.add("West",new JButton("왼쪽"));
		this.add("East",new JButton("오른쪽"));
		this.add("Center",new JButton("가운데"));
		
		//버튼1에 속성
		btn1.setBackground(Color.PINK);//배경색
		btn1.setForeground(Color.green);//글자색
		
		
		
		this.setVisible(true); //맨 마지막에 입력
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingLayoutEx2("스윙 기본 레이아웃 연습");
	}

}
