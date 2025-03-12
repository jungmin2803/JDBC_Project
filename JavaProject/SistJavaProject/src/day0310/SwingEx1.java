package day0310;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class SwingEx1 extends JFrame{
	
	Container cp;
	
	//생성자
	public SwingEx1(String title) {
		super(title); //JFrame부모생성자를 통해서 창제목을 통해서 제목을 
		
		//위치,너비
		this.setBounds(1000, 100, 500, 600);//창 위치,크기
		//색상
		//this.setBackground(Color.BLUE);
		//this.getContentPane().setBackground(Color.PINK); //ContentPane()을 사용해야 색깔이 바뀜 //Color클래스의 상수변수
		//this.getContentPane().setBackground(new Color(240,255,255));
		
		cp=this.getContentPane();
		
		//메인프레임 종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(new Color(127,255,212)); //창 크기 설정
		this.setVisible(true); //창을 보이게 함
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingEx1 sw1=new SwingEx1("스윙기본 #1");
	}

}
