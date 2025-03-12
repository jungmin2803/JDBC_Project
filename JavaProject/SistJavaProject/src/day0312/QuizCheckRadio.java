package day0312;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class QuizCheckRadio extends JFrame implements ActionListener{

	Container cp;
	JRadioButton [] rb1=new JRadioButton[2]; //남자 여자 선택_라디오 버튼으로
	JRadioButton [] rb2=new JRadioButton[5]; //색상5개_라디오 버튼으로
	JCheckBox [] cb=new JCheckBox[6]; //여행해본나라선택 6개국_체크박스로(버튼있게 만든후 선택)
	//시간이 남으시는 분들은 이미지 버튼 누르면 다이얼로그로 이미지 선택해서 아래에 나타나게 합니다
	Color [] color= {Color.blue,Color.pink,Color.red,Color.green,Color.yellow};
	JButton btn1;
	JLabel lblmsg;

	//출력 하는곳은 라벨
	//저는 남자입니다(색상 누르면 해당 색상으로)
	//내가 여행해본 나라는 미국 영국 입니다
	//내가 가본나라가 없습니다

	//생성자
	public QuizCheckRadio(String title) {
		super(title);

		//위치,너비
		this.setBounds(1000, 100, 600, 500);


		cp=this.getContentPane();

		//메인프레임 종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//창 색상
		cp.setBackground(new Color(153,204,255));

		initDesign();


		this.setVisible(true);


	}
	public void initDesign() {
		this.setLayout(null);
		String [] str1={"파랑","분홍","빨강","초록","노랑"};
		JPanel pTop1=new JPanel();
		pTop1.setBorder(new TitledBorder("글자색 선택"));
		pTop1.setBounds(0, 0, 600, 80);
		pTop1.setBackground(new Color(153, 255, 255));
		this.add(pTop1);
		ButtonGroup bg=new ButtonGroup();
		for(int i=0;i<rb2.length;i++)
		{
			rb2[i]=new JRadioButton(str1[i],i==1?true:false);
			rb2[i].setForeground(color[i]);	
			rb2[i].setOpaque(false);
			pTop1.add(rb2[i]);
			bg.add(rb2[i]);			
			rb2[i].addActionListener(this);
		}
		String [] str2= {"남자","여자"};
		JPanel pTop2=new JPanel();
		pTop2.setBorder(new TitledBorder("성별 선택"));
		pTop2.setBounds(0, 80, 600, 80);
		pTop2.setBackground(new Color(153, 255, 255));		
		this.add(pTop2);
		ButtonGroup bg1=new ButtonGroup();
		for(int i=0;i<rb1.length;i++)
		{
			rb1[i]=new JRadioButton(str2[i],i==0?true:false);			
			rb1[i].setOpaque(false);
			pTop2.add(rb1[i]);
			bg1.add(rb1[i]);

			rb1[i].addActionListener(this);
		}

		String [] str3= {"일본","독일","중국","캐나다","미국","베트남"};
		JPanel pTop3=new JPanel();
		pTop3.setBorder(new TitledBorder("내가 여행해본 나라 선택"));
		pTop3.setBounds(0, 160, 600, 80);
		pTop3.setBackground(new Color(153, 255, 255));
		this.add(pTop3);
		ButtonGroup bg2=new ButtonGroup();
		for(int i=0;i<cb.length;i++)
		{
			cb[i]=new JCheckBox(str3[i]);
			pTop3.add(cb[i]);
			cb[i].setOpaque(false);

		}



		//출력
		lblmsg=new JLabel();
		lblmsg.setBounds(100, 400, 400, 50);
		lblmsg.setBorder(new LineBorder(Color.cyan,3));
		this.add(lblmsg);

		btn1=new JButton("내가 여행한 나라는?");
		btn1.setBounds(100, 300, 400, 50);
		btn1.setOpaque(false);
		btn1.addActionListener(this);

		this.add(btn1);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getSource();
		
		
			for(int i=0; i<rb2.length;i++)
			{	if(ob==rb2[i])
			{
				if(rb2[i].isSelected())
				{
					lblmsg.setForeground(color[i]);

					lblmsg.setFont(new Font("궁서체", Font.BOLD, 15));

				}	
			}
			}	
		
		for(int i=0;i<rb1.length;i++)
		{
		
			 if (ob == rb1[i]) {
		            lblmsg.setText(rb1[i].getText() + "입니다"); // 남자입니다 / 여자입니다
		        }

		
	}
		//나라
		String msg="내가 여행한 나라는 ";
		int cnt=0;
		for(int i=0;i<cb.length;i++)
		{
			if(cb[i].isSelected()==true)
			{cnt++;
			msg+=cb[i].getText()+"  ";
			}
		}
		if(cnt==0)
			lblmsg.setText("내가 여행한 나라가 없어요");
		else
			msg+="입니다";
		lblmsg.setText(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new QuizCheckRadio("스윙 체크&라디오 과제");
	}	
}



