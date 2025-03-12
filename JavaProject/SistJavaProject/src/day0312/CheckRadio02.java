package day0312;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class CheckRadio02 extends JFrame implements ActionListener,ItemListener {
	
	Container cp;	
	JCheckBox cbDriverLic,cbBOld;
	JCheckBox[] cbHobby=new JCheckBox[4];
	JButton btnHobby;
	
	JLabel lblResult;
	
	//생성자
	public CheckRadio02(String title) {
		super(title);
		
		//위치,너비
		this.setBounds(1000, 100, 500, 600);		
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
		this.setLayout(null);
		cbDriverLic=new JCheckBox("운전면허");
		cbDriverLic.setBounds(50, 50, 100, 30);
		cbDriverLic.setOpaque(false);
		cbDriverLic.addItemListener(this); //아이템대상임을 표기
		this.add(cbDriverLic);
		
		//굵게 할지에 관한 체크박스
		cbBOld=new JCheckBox("라벨을 굵게");
		cbBOld.setBounds(50, 100, 100, 30);
		cbBOld.setOpaque(false);
		cbBOld.addItemListener(this);
		this.add(cbBOld);
		
		//취미체크박스
		int xpos=50;
		int gap=100;
		String [] hobby= {"운동","게임","유튜브감상","코딩"};
		for(int i=0; i< cbHobby.length;i++)
		{
			cbHobby[i]=new JCheckBox(hobby[i]);
			
			cbHobby[i].setBounds(xpos+(i*gap), 150, 100, 30);
			cbHobby[i].setOpaque(false);
			this.add(cbHobby[i]);
		}
		
		//결과라벨
		lblResult=new JLabel("안녕 체크앤 라디오 연습중이야~~",JLabel.CENTER);
		lblResult.setBounds(50, 250, 400, 60);
		lblResult.setBorder(new LineBorder(Color.pink,5));
		this.add(lblResult);
		
		btnHobby=new JButton("나의 취미 알아보기");
		btnHobby.setBounds(170, 200, 150, 30);
		this.add(btnHobby);
		btnHobby.addActionListener(this);
	}	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// 체크박스 눌렀을때 라벨에 출력
		Object ob=e.getItem();
		
		if(ob==cbDriverLic)
		{
			String s="체크상태:"+cbDriverLic.isSelected()+","+cbDriverLic.getText();
			if(cbDriverLic.isSelected())
				lblResult.setText("운전면허가 있습니다");
			else
				lblResult.setText("운전면허가 없습니다");
		}
		else if(ob==cbBOld)
		{
			if(cbBOld.isSelected())
				lblResult.setFont(new Font("", Font.BOLD, 20));
			else
				lblResult.setFont(new Font("", Font.PLAIN, 20));
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼을 눌렀을때 라벨에 출력
		String s="나의 취미는";
		int select=0;
		for(int i=0; i < cbHobby.length; i++)
		{
			if(cbHobby[i].isSelected()==true)
				{
					select++;
					s+="["+cbHobby[i].getText()+"]";
				}			
		}
		if(select==0)
			s="나는 해당하는 취미가 없어요!!";
		else
			s+=" 입니다";
		
		//라벨에 출력
		lblResult.setText(s);		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckRadio02("스윙레이아웃 #3");
	}
}
