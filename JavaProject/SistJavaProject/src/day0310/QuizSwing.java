package day0310;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class QuizSwing extends JFrame implements ActionListener {
	
	Container cp;
	JLabel lblSu1,lblSu2,lblSu3,lblSu4,lblResult;
	JTextField tfSu1,tfSu2;
	JButton btn1,btn2,btn3,btn4;
	
	//생성자
	public QuizSwing(String title) {
		super(title); //JFrame부모생성자를 통해서 창제목을 통해서 제목을 입력
		
		//위치,너비
		this.setBounds(1000, 100, 300, 450);//창 위치,크기		
		
		cp=this.getContentPane();
		cp.setBackground(new Color(245, 245, 245));
				
		initDesign();
		
		this.setVisible(true);		
		
	}
	
	public void initDesign() {
		this.setLayout(null);
		lblSu1=new JLabel("숫자1");
		lblSu2=new JLabel("숫자2");
		lblSu3=new JLabel("간단한 사칙연산");	
		
		lblSu1.setBounds(30, 90, 50, 30);
		this.add(lblSu1);
		
		lblSu2.setBounds(30, 120, 50, 30);
		this.add(lblSu2);
		
		lblSu3.setBounds(100, 50, 90, 30);
		this.add(lblSu3);		
	
		
		tfSu1=new JTextField();
		tfSu2=new JTextField();
		
		tfSu1.setBounds(90, 90, 100, 30);
		this.add(tfSu1);
		
		tfSu2.setBounds(90, 120, 100, 30);
		this.add(tfSu2);		
		
		
		btn1=new JButton("더하기");
		btn2=new JButton("빼기");
		btn3=new JButton("곱하기");
		btn4=new JButton("나누기");
		
		btn1.setBounds(70, 170, 150, 30);
		btn1.setBackground(new Color(169, 169, 169));
		this.add(btn1);		
		
		btn2.setBounds(70, 210, 150, 30);
		btn2.setBackground(new Color(169, 169, 169));
		this.add(btn2);		
		
		btn3.setBounds(70, 250, 150, 30);
		btn3.setBackground(new Color(169, 169, 169));
		this.add(btn3);
		
		btn4=new JButton("나누기");
		btn4.setBounds(70, 290, 150, 30);
		btn4.setBackground(new Color(169, 169, 169));
		this.add(btn4);
		
		lblResult=new JLabel("계산결과: ");
		lblResult.setBounds(30, 350, 150, 30);
		lblResult.setForeground(Color.red);
		this.add(lblResult);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object ob=e.getSource();
		
		int su1=Integer.parseInt (tfSu1.getText().trim());
		int su2=Integer.parseInt(tfSu2.getText().trim());
		
		String sum=su1+su2+"";
		String m=su1-su2+"";
		String gob=su1*su2+"";
		String na=su1/su2+"";
		
		if(ob==btn1)
			lblResult.setText(sum);
		else if(ob==btn2)
			lblResult.setText(m);
		else if(ob==btn3)
			lblResult.setText(gob);
		else if(ob==btn4)
			lblResult.setText(na);			
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new QuizSwing("간단한 사칙연산");
	}



}
