package day0312;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GraphicImage04 extends JFrame {

	
	Container cp;
	static final String fileName1="C:\\sist0217\\logoImg\\a02.png";
	static final String fileName2="C:\\sist0217\\logoImg\\icon02.png";
	static final String fileName3="C:\\sist0217\\logoImg\\shoe02.png";
	
	//생성자
	public GraphicImage04(String title) {
		super(title);
		
		//위치,너비
		this.setBounds(1000, 100, 500, 600);
		
		
		cp=this.getContentPane();

		//메인프레임 종료
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//창 색상
		cp.setBackground(new Color(153,204,255));
				
		
		this.setVisible(true);
		
		
	}
	

	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.green);
		g.drawLine(20, 60, 300, 60); //선
		
		g.setColor(Color.magenta);
		g.drawOval(20, 80, 50, 50); //테두리만 있는원
		g.fillOval(100, 80, 50, 50); //채우기 원
		
		g.setColor(Color.blue);
		g.drawRect(180, 80, 50, 50); //테두리만 있는 네모
		g.fillRect(250, 80, 50, 50); //채우기 네모
		
		//이미지
		Image image1=new ImageIcon(fileName1).getImage();
		g.drawImage(image1, 20, 100,100,100,GraphicImage04.this);
		
		Image image2=new ImageIcon(fileName2).getImage();
		g.drawImage(image2, 250, 150,100,100,GraphicImage04.this);
		
		Image image3=new ImageIcon(fileName3).getImage();
		g.drawImage(image3, 20, 200,100,100,this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicImage04("그래픽 이미지 #04");
	}

}
