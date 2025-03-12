package day0312;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex00 extends JFrame {

	Container cp;
	JLabel [] lblPost;
	JButton [] btn1;
	ImageIcon icons[];
	
	
	
	//생성자
	public Ex00(String title) {
		super(title);
		
		//위치,너비
		this.setBounds(1000, 100, 1000, 600);	
		
		cp=this.getContentPane();
		//메인프레임 종료
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//창 색상
		cp.setBackground(new Color(153,204,255));			
		initDesign();		
		this.setVisible(true);		
	}
	
	public void initDesign()
	{
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex00("영화 포스터");
	}

}
