package day0310;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BtnArrayEvent7 extends JFrame implements ActionListener {

	Container cp;
	JButton [] btn=new JButton[7]; //버튼 배열 할당
	String [] BtnLabel= {"Red","Yellow","Cyan","Blue","White","Magenta","Pink"}; //버튼 텍스트에 들어갈 배열(디자인)
	Color [] btnColor= {Color.red,Color.yellow,Color.cyan,Color.blue,Color.white,Color.magenta,Color.pink}; 
	//들어갈 색(액션)
	
	
	//생성자
	public BtnArrayEvent7(String title) {
		super(title); //JFrame부모생성자를 통해서 창제목을 통해서 제목을 입력
		
		//위치,너비
		this.setBounds(1000, 100, 700, 600);//창 위치,크기
		
		
		cp=this.getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(new Color(127,255,212));
		
		initDesign();
		
		
		this.setVisible(true);
		
		
	}
	public void initDesign() {
		//Panel 은 기본이 FlowLayout
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(7,1)); //7행 1열의 그리드레이아웃으로 변경
		
		panel.setBackground(Color.orange);
		
		//패널을 상단에 배치
		//this.add(panel, BorderLayout.NORTH);
		//this.add("North", panel);
		this.add(panel,BorderLayout.WEST); //왼쪽
		
		
		//버튼생성
		for(int i=0;i<btn.length;i++)
		{
			btn[i]=new JButton(BtnLabel[i]);
			//버튼의 색상을 각각의 색상으로 변경
			btn[i].setBackground(btnColor[i]);
			//penel에 버튼추가
			panel.add(btn[i]);
			
			//버튼에 이벤트 추가
			btn[i].addActionListener(this);
			
			
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getSource();
		
		for(int i=0; i<btn.length;i++)
		{
			if(ob==btn[i])
			{
			//프레임의 배경색 변경 / 배경색만 cp
			cp.setBackground(btnColor[i]);
			
			//창제목도 변경
			this.setTitle("Color: "+BtnLabel[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BtnArrayEvent7("배열 이벤트 #7");
	}


}
