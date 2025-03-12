package day0312;

import java.awt.Color;
import java.awt.Container;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FileDialog03 extends JFrame {
	Container cp;
	JTextArea area;
	JButton btnOpen,btnSave;
	
	//생성자
	public FileDialog03(String title) {
		super(title);
		
		//위치,너비
		this.setBounds(1000, 100, 300, 400);
		
		
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
		
		btnOpen=new JButton("파일 불러오기"); //read하는것
		btnOpen.setBounds(20, 40, 120, 30);
		this.add(btnOpen);
		
		btnSave=new JButton("파일 저장하기"); //write하는것
		btnSave.setBounds(150, 40, 120, 30);
		this.add(btnSave);
		
		//입력출력 창
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String today=sdf.format(new Date());
		area =new JTextArea(today);
		area.setFont(new Font("궁서체", Font.BOLD, 15));
		
		
		//area 스크롤이 가능한 패널에 넣어서 프레임에 추가
		JScrollPane js=new JScrollPane(area);
		js.setBounds(20, 80, 250, 200);		
		this.add(js);
		
		btnOpen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				FileDialog dlg=new FileDialog(FileDialog03.this, "파일열기", FileDialog.LOAD);
				dlg.setVisible(true);
				
				//선택한 디렉토리
				String dir=dlg.getDirectory();
				//선택한 파일명
				String file=dlg.getFile();
				System.out.println(dir+"\n"+file);
				
				//만약 취소 누르면 메서드 종료
				if(dir==null)
					return;
				FileReader fr=null;
				BufferedReader br=null;
						
				try {
					fr=new FileReader(dir+file);
					br=new BufferedReader(fr);
					
					//기존에 있던 area안의 데이타 삭제후 불러오기
					area.setText("");
					
					while(true)
					{
						String s=br.readLine();
						
						if(s==null)
							break;
						
						//읽은 데이타 area에 추가
						area.append(s+"\n");
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}catch (IOException e2) {
					// TODO: handle exception
				}finally {
					try {
						br.close();
						fr.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}
		});
		
		//파일 저장하기	
		//내부 익명 클래스 생성
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				FileDialog dlg=new FileDialog(FileDialog03.this, "저장", FileDialog.SAVE);
				dlg.setVisible(true);
				
				String dir=dlg.getDirectory();
				String file=dlg.getFile();
				
				if(dir==null)
					return;
				
				//파일저장
				FileWriter fw=null;
				
				try {
					fw=new FileWriter(dir+file);
					//area의 내용을 가져와서 파일에 저장
					fw.write(area.getText()+"\n");
					
					//area에 저장메세지
					area.setText(file+"파일로 저장됨");
					
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}finally {
					try {
						fw.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}				
			}
		});
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FileDialog03("파일 다이얼로그 #03");
	}

}
