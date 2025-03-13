package day0313;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TableIpgoEx00 extends JFrame implements ActionListener {

	Container cp;
	JTable table;
	JButton btnAdd,btnDel;
	JTextField tfSang,tfSu,tfDan;
	DefaultTableModel model;	
	static final String FILENAME="C:\\sist0217\\work\\ExTable.txt";
	int selectRow=-1;
	
	//생성자
	public TableIpgoEx00(String title) {
		super(title);
		
		//위치,너비
		this.setBounds(1000, 100, 350, 500);		
		cp=this.getContentPane();
		//메인프레임 종료
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//창 색상
		cp.setBackground(new Color(245,245,245));		
		initDesign();
		
		//생성 후 불러오기
		
		//저장 후 닫기
		
		this.setVisible(true);	
	}
	
	//데이타 저장하기
	public void tableDataSave() {
		FileWriter fw=null;
		try {
			fw=new FileWriter(FILENAME);
			for(int i=0;i<table.getRowCount();i++)
			{
				String s="";
				for(int j=0;j<table.getColumnCount();j++)
				{
					s+=table.getValueAt(i, j);					
				}
				s=s.substring(0, s.length()-1);
				fw.append(s+"\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	//데이타 불러오기
	public void tableDataRead() {
		FileReader fr=null;
		BufferedReader br=null;
				
		try {
			fr=new FileReader(FILENAME);
			br=new BufferedReader(fr);
			
			while(true)
			{
			String s=br.readLine();
			if(s==null)
				break;
			String []data=s.split(":");
			model.addRow(data);
			
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	
	public void initDesign()
	{
		this.setLayout(null);
		//라벨 생성
		JLabel lbl1=new JLabel("상품명");
		lbl1.setBounds(50, 40, 80, 30);
		this.add(lbl1);
		
		JLabel lbl2=new JLabel("수량"	);
		lbl2.setBounds(150, 40, 80, 30);
		this.add(lbl2);
		
		JLabel lbl3=new JLabel("단가");
		lbl3.setBounds(250, 40, 80, 30);
		this.add(lbl3);
		
		tfSang=new JTextField();
		tfSang.setBounds(25, 80, 90, 30);
		this.add(tfSang);
		
		tfSu=new JTextField();
		tfSu.setBounds(120, 80, 90, 30);
		this.add(tfSu);
		
		tfDan=new JTextField();
		tfDan.setBounds(220, 80, 90, 30);
		this.add(tfDan);
		
		btnAdd=new JButton("추가");
		btnAdd.setBounds(80, 120, 80, 30);
		this.add(btnAdd);
		
		btnDel=new JButton("삭제");
		btnDel.setBounds(180, 120, 80, 30);
		this.add(btnDel);
		
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		
		String [] title= {"상품명","수량","단가","총금액"};
		model=new DefaultTableModel(title,0);
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		js.setBounds(15, 160, 300, 300);
		this.add(js);
		
		//행 선택시 selectRow에 저장
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				
				selectRow=table.getSelectedRow();
			}
		});
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getSource();
		if(ob==btnAdd)
		{
			
		}
		
		if(ob==btnDel)
		{
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TableIpgoEx00("연습00");
		
	}


	

}
