package day0310;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingIcon5 extends JFrame {

	Container cp;
	JButton btn1,btn2,btn3,btn4,btn5;
	
	//각각의 이미지 아이콘
	ImageIcon icon1=new ImageIcon("C:\\sist0217\\image\\LEFT.GIF");
	ImageIcon icon2=new ImageIcon("C:\\sist0217\\image\\chick.gif");
	ImageIcon icon3=new ImageIcon("C:\\sist0217\\image\\45-pandadog.gif");
	ImageIcon icon4=new ImageIcon("C:\\sist0217\\image\\ame9.GIF");
	
	
	//생성자
	public SwingIcon5(String title) {
		super(title); //JFrame부모생성자를 통해서 창제목을 통해서 제목을 입력
		
		//위치,너비
		this.setBounds(1000, 100, 700, 600);//창 위치,크기
		
		
		cp=this.getContentPane();
		cp.setBackground(new Color(238,130,238));
		
		initDesige();
		
		
		this.setVisible(true);
	}
	
	public void initDesige() {
		
		//버튼4개새로 생성
		this.setLayout(new GridLayout(2, 2));//2행2열
		btn1=new JButton("Hello", icon1);
		this.add(btn1); //프레임에 추가
		btn1.setHorizontalTextPosition(JButton.CENTER); //setHorizontalTextPosition 텍스트 가로위치
		btn1.setVerticalTextPosition(JButton.BOTTOM); //setVerticalTextPosition 텍스트 세로위치
		
		//마우스이벤트
		btn1.setPressedIcon(icon2); //클릭해야 이미지 수정
		btn1.setRolloverIcon(icon3); //커서를 올려만 놔도 이미지 수정
		
		
		btn2=new JButton(icon2);
		this.add(btn2);
		
		btn3=new JButton(icon3);
		this.add(btn3);
		
		btn4=new JButton("안녕 자바");
		this.add(btn4);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingIcon5("스윙아이콘#5");
	}

}
