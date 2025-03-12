package day0312;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.FileDialog;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CanvasImage05 extends JFrame {
	
	Container cp;
	JButton btnImage;
	Image image;
	MyCanvas mycan; //캔버스를 상속받은 내부클래스
	
	//생성자
	public CanvasImage05(String title) {
		super(title);
		
		//위치,너비
		this.setBounds(1000, 100, 500, 600);
		
		
		cp=this.getContentPane();

		//메인프레임 종료
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//창 색상
		cp.setBackground(Color.white);
		
		
		initDesign();
		
		this.setVisible(true);
		
		
	}
	
	//디자인
	public void initDesign()
	{
		//처음 나타낼 초기이미지 지정
		this.setLayout(null);
		
		image=new ImageIcon("C:\\sist0217\\logoImg\\ironman.png").getImage();
		mycan=new MyCanvas(); //paint메서드 자동 호출
		mycan.setBounds(20, 200, 400, 500);
		this.add(mycan);
		
		//버튼
		btnImage=new JButton("이미지 불러오기");
		btnImage.setBounds(100,100,150,30);
		this.add(btnImage);
		
		//익명내부클래스 이벤트
		btnImage.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//취소시 메소드 종료
				FileDialog dlg=new FileDialog(CanvasImage05.this, "이미지 가져오기",FileDialog.LOAD);
				dlg.setVisible(true);
				
				if(dlg.getDirectory()==null)
					return;
				String imageFileName=dlg.getDirectory()+dlg.getFile();
				
				//이미지 생성
				image=new ImageIcon(imageFileName).getImage();
				
				//캔버스 클래스의 paint메서드 호출
				mycan.repaint();
				
			}
		});
		
	}

	//canvas를 상속받는 클래스	
	class MyCanvas extends Canvas{
		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			super.paint(g);
			
			//이미지출력
			g.drawImage(image, 30, 30, this);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CanvasImage05("스윙 캔바스 #05");
	}

}
