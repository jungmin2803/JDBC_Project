package day0312;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class RadioCheck01 extends JFrame implements ActionListener {
	
	Container cp;
	JRadioButton [] rb=new JRadioButton[4]; //하나만 선택하고 싶을때
	JCheckBox [] cb=new JCheckBox[5]; //다중선택 가능
	JLabel lblMessage; //결과 출력할곳
	Color [] color= {Color.red,Color.yellow,Color.green,Color.blue};
	
	//생성자
	public RadioCheck01(String title) {
		super(title);
		
		//위치,너비
		this.setBounds(1000, 100, 800, 600);
		
		
		cp=this.getContentPane();
		//메인프레임 종료
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//창 색상
		cp.setBackground(new Color(153,204,255));		
		
		initdesign();
		
		this.setVisible(true);
		
		
	}
	
	public void initdesign() 
	{		
		//상단패널에 보더로 감싼 4개의 라디오버튼만들기
		String [] str1= {"빨강","노랑","초록","파랑"};
		JPanel pTot=new JPanel();
		pTot.setBorder(new TitledBorder("글자색 선택"));
		this.add("North",pTot); //프레임에 상단에 패널 추가
		
		//라디오 버튼을 하나만 선택되도록 하려면 그룹을 지어줘야함		
		ButtonGroup bg=new ButtonGroup();
		for(int i=0; i< rb.length; i++)
		{
			rb[i]=new JRadioButton(str1[i], i==1?true:false); //라디오버튼 생성
			pTot.add(rb[i]);// 탑패널에 4개의 라디오버튼추가
			bg.add(rb[i]); //버튼그룹에 4개의 버튼 추가
			
			rb[i].addActionListener(this); //버튼에 액션 추가
		}
		
		//결과출력
		ImageIcon icon=new ImageIcon("C:\\sist0217\\image\\ahiru_a001.gif");
		lblMessage=new JLabel("오늘은 즐거운 수요일!!",icon, JLabel.CENTER);
		lblMessage.setHorizontalTextPosition(JLabel.LEFT); //텍스트를 아이콘의 왼쪽에 배치
		lblMessage.setBorder(new LineBorder(Color.red,2));//라인굵기
		this.add("Center",lblMessage);
		
		//하단패널에 보더로 감싼 5개의 checkbox버튼 만들기
		JPanel pBoteeom=new JPanel();
		pBoteeom.setBorder(new TitledBorder("가능한 컴퓨터 언어는?"));
		this.add("South",pBoteeom);
		String [] str2= {"Java","Html","Jsp","Ajex","Spring"};
		
		for(int i=0; i < cb.length;i++)
		{
			cb[i]=new JCheckBox(str2[i]);
			pBoteeom.add(cb[i]);
			
			cb[i].addActionListener(this);
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object ob=e.getSource();
		
		//라디오버튼 처리,메세지 컬러별로 출력
		for(int i=0; i < rb.length; i++)
		{
			if(ob==rb[i])
			{
				lblMessage.setForeground(color[i]); //결과 출력 라벨에 글자색 추가
				//폰트
				lblMessage.setFont(new Font("궁서체", Font.BOLD, 20)); 
			}
		}
		//체크박스 호출처리,선택한 체크박스의 메세지별 출력
		String msg=" ";
		for(int i=0;i<cb.length;i++)
		{
			if(cb[i].isSelected()==true) //체크를 누르면 true
			{
				msg+=cb[i].getText()+" ";		//cb[i]의 텍스트를 가져온다		
			}
		}
		lblMessage.setText("가능한 컴퓨터 언어는 "+msg); //결과 출력 라벨에 메세지를 추가한다
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioCheck01("스윙 Radop&Check #01");
	}



}
