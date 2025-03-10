package day0310;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ArrayRndEvent9 extends JFrame {
	
	Container cp;
	JButton btnRandom;
	JLabel [] lblFood=new JLabel[9];
	
	String [] str= {"치킨","피자","햄버거","짜장면","찜닭","파스타","떡볶이","보쌈","족발"};
	
	//생성자
	public ArrayRndEvent9(String title) {
		super(title); //JFrame부모생성자를 통해서 창제목을 통해서 제목을 입력
		
		//위치,너비
		this.setBounds(1000, 100, 500, 600);//창 위치,크기
		
		
		cp=this.getContentPane();
		cp.setBackground(new Color(127,255,212));	
		
		initDesign();
		
		this.setVisible(true);		
	}
	
	public void initDesign() {
		
		//패널을 프레임의 센터에 추가
		JPanel pCenter=new JPanel(new GridLayout(3,3));
		this.add(pCenter);
		
		//프레임 하단에 버튼 추가
		btnRandom=new JButton("라벨색상변경");
		//this.add(btnRandom,BorderLayout.SOUTH);
		this.add("South",btnRandom);
		
		
		for(int i=0;i<lblFood.length;i++)
		{
			lblFood[i]=new JLabel(str[i],JLabel.CENTER);
			
			//r,g,b 랜덤색상 얻기
			int r=(int)(Math.random()*256); //0~255
			int g=(int)(Math.random()*256);
			int b=(int)(Math.random()*256);
			
			lblFood[i].setBackground(new Color(r, g, b));
			
			lblFood[i].setOpaque(true);
			
			//패널에 라벨추가
			pCenter.add(lblFood[i]);
		
		}
		
		//버튼을 누르면 라벨 부분 랜덤색상 변하기 이벤트
		
		btnRandom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				for(int i=0;i<lblFood.length;i++) {
				int r=(int)(Math.random()*256); //0~255
				int g=(int)(Math.random()*256);
				int b=(int)(Math.random()*256);
				
				lblFood[i].setBackground(new Color(r, g, b));
				}
			}
		});
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ArrayRndEvent9("배열 랜덤 이벤트 #9");
		
	}

}
