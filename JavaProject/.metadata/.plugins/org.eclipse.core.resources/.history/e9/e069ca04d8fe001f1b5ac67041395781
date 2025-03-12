package day0310;

import java.awt.ActiveEvent;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingBtnEvent4 extends JFrame implements ActionListener {

	Container cp;
	JButton btn1,btn2;
	
	//생성자
	public SwingBtnEvent4(String title) {
		super(title);
		
		//위치,너비
		this.setBounds(1000, 100, 500, 300);//창 위치,크기
		
		//contentpane을 써야 바뀐게 보임
		cp=this.getContentPane();
		//백 그라운드 색 변경
		cp.setBackground(new Color(127,255,212));
		
		//디자인을 불러옴
		initDesign();
		
		//얘를 써야 창이 생성
		this.setVisible(true);		
	}
	
	public void initDesign() {
		this.setLayout(new FlowLayout());
		
		//버튼 생성과 동시에 값 입력
		btn1=new JButton("◀");
		btn2=new JButton("▶");
		
		
		btn1.setBackground(Color.LIGHT_GRAY);
		btn2.setBackground(Color.yellow);
		
		
		
		this.add(btn1);
		this.add(btn2);
		
		btn1.addActionListener(this); 
		btn2.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object ob =e.getSource();
		if(ob==btn1)
			JOptionPane.showMessageDialog(this, "왼쪽버튼클릭!!");
		else if(ob==btn2)
			JOptionPane.showMessageDialog(this, "오른쪽버튼클릭!!");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingBtnEvent4("스윙 버튼이벤트 #4");
	}



}
