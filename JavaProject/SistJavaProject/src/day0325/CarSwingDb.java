package day0325;

import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class CarSwingDb extends JFrame{

	DefaultTableModel model;
	JTable table;
	Container cp;
	JButton btn1;
	
	//생성자
	public CarSwingDb(String title) {
		super(title);
		
		//위치,너비
		this.setBounds(200, 100, 1300, 700);		
		cp=this.getContentPane();
		//메인프레임 종료
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//창 색상
		cp.setBackground(new Color(245,245,245));		
		initDesign();
		this.setVisible(true);	
	}
	
	public void initDesign()
	{
		this.setLayout(null);
		this.carAvante();
		
	}
	
	public void carAvante()
	{
		this.setLayout(null);
		ImageIcon icon=new ImageIcon("C:\\Java\\work\\Javac\\car\\avante-25my-well-side.png"); //사진 read
		ImageIcon icon1=new ImageIcon("C:\\Java\\work\\Javac\\car\\avante-25my-45side.png");
		Image img = icon.getImage();
		Image img1= icon1.getImage();
        Image resizedImg = img.getScaledInstance(240, 160, Image.SCALE_SMOOTH); // 원하는 크기로 조절
        Image resizedImg1= img1.getScaledInstance(240, 160, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImg);
        ImageIcon resizedIcon1= new ImageIcon(resizedImg1);
		JButton btn2=new JButton("아반떼");
		btn2.setIcon(resizedIcon);
		btn2.setBounds(40, 50, 240, 220);
		btn2.setRolloverIcon(resizedIcon1);
		 // 텍스트를 아이콘 아래로 정렬
        btn2.setVerticalTextPosition(SwingConstants.BOTTOM);
        btn2.setHorizontalTextPosition(SwingConstants.CENTER);

        // 버튼 스타일 조정 (선택 사항)
        btn2.setFocusPainted(false); // 포커스 표시 제거
        btn2.setBorderPainted(false); // 테두리 제거
        btn2.setContentAreaFilled(false); // 버튼 배경 제거
        
		this.add(btn2);
	}
	
	
	public static void main(String[] args) {
		new CarSwingDb("자동차 스윙");
	}
	
}
