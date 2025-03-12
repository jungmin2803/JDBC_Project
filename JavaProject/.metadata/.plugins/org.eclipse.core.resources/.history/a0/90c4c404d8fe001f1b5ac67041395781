package day0310;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;

//두개의 라벨과 텍스트필드 그리고 버튼을 만든후
//각각 숫자를 넣고 버튼을 클릭하면 라벨에 22+44=66 출력할 예쩡
public class LayoutNull8 extends JFrame {
	Container cp; //백그라운드 색상
	JButton btnAdd; //버튼 이벤트
	JLabel lblResult,lblnum1,lblnum2; //텍스트 출력창
	JTextField tfSu1,tfSu2; //입력창 
	
	
	//생성자
	public LayoutNull8(String title) {
		super(title); //JFrame부모생성자를 통해서 창제목을 통해서 제목을 입력
		
		//위치,너비
		this.setBounds(1000, 100, 500, 300);//창 위치,크기
		
		
		cp=this.getContentPane();
		cp.setBackground(new Color(127,255,212));		
		
		initDesign();
		
		this.setVisible(true);		
	}
	
	public void initDesign()
	{
		this.setLayout(null); //레이아웃 null지정
		lblnum1=new JLabel("숫자1: "); //객체생성, 값 입력
		lblnum2=new JLabel("숫자2: "); //객체생성, 값 입력
		
		//위치,크기 설정
		lblnum1.setBounds(50, 30, 80, 50);
		this.add(lblnum1); //자식클래스에 초기값 대입 //this.add를 써줘야 인터페이스에 생성
		
		lblnum2.setBounds(50, 70, 80, 50);
		this.add(lblnum2); //자식클래스에 초기값 대입
		
		//입력칸 JtextField
		tfSu1=new JTextField(); //객체생성
		tfSu1.setBounds(110, 40, 80, 30); //입력창 위치,크기 설정
		this.add(tfSu1);
		
		tfSu2=new JTextField();
		tfSu2.setBounds(110, 80, 80, 30);
		this.add(tfSu2);
		
		btnAdd=new JButton("숫자더하기"); //버튼창 객체생성 및 초기값 입력
		btnAdd.setBounds(200, 60, 100, 30); //버튼창 위치,크기 설정
		this.add(btnAdd);
		
		//결과 나오는곳
		lblResult=new JLabel("결과 나오는곳"); //결과값 생성 및 초기값 입력
		lblResult.setBounds(120, 160, 100, 50); //위치,크기 설정
		lblResult.setBorder(new TitledBorder("결과확인"));// 테두리 타이틀 생성및 초기값 입력
		lblResult.setFont(new Font("", Font.BOLD,10)); //폰트 지정 /글자/폰트/크기
		this.add(lblResult); //출력
		 
		
		//버튼이벤트_익명내부클래스
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			int su1=Integer.parseInt(tfSu1.getText().trim()); //앞뒤공백제거후 숫자로 변환 
			int su2=Integer.parseInt(tfSu2.getText().trim());
			
			int sum=su1+su2;
			String s=su1+"+"+su2+"="+sum;
			lblResult.setText(s);
			}
		});
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LayoutNull8("스윙 레이아웃 널 #8");
	}

}
