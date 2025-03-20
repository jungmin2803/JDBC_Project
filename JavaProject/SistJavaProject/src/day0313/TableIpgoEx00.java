package day0313;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TableIpgoEx00 extends JFrame implements ActionListener {
	
	Container ct;
	JButton btnAdd,btnDel;
	JTextField tfSang,tfSu,tfDan;
	DefaultTableModel model;
	JTable table;
	
	static final String FILENAME="C:\\sist0217\\work\\sangipgo.txt";
	
	//생성자
	public TableIpgoEx00(String title) {
		
		this.setBounds(100, 30, 300, 500);
		
		ct=this.getContentPane();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ct.setBackground(Color.white);
		initDesign();
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				tableDataSave();
			}
		});
		
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
					s+=table.getValueAt(i, j)+":";
				}
				s=s.substring(0, s.length()-1);
				fw.write(s+"\n");
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
	
		
	}
	
	
	
	public void initDesign()
	{
		this.setLayout(null);
		JLabel lblsang=new JLabel("상품명");
		JLabel lblSu=new JLabel("수량");
		JLabel lblDan=new JLabel("단가");
		
		lblsang.setBounds(35, 30, 100, 30);
		this.add(lblsang);
		
		lblSu.setBounds(130, 30, 100, 30);
		this.add(lblSu);
		
		lblDan.setBounds(230, 30, 100, 30);
		this.add(lblDan);
		
		tfSang=new JTextField();
		tfSu=new JTextField();
		tfDan=new JTextField();
		
		tfSang.setBounds(10, 60, 80, 30);
		this.add(tfSang);
		
		tfSu.setBounds(105, 60, 80, 30);
		this.add(tfSu);
		
		tfDan.setBounds(200, 60, 80, 30);
		this.add(tfDan);
		
		btnAdd=new JButton("추가");
		btnDel=new JButton("삭제"	);
		
		btnAdd.setBounds(50, 110, 80, 30);
		this.add(btnAdd);
		
		btnDel.setBounds(160, 110, 80, 30);
		this.add(btnDel);
		
		//버튼2개 이벤트 추가
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		
		//테이블 생성
		String [] title= {"상품명","수량","단가","총금액"};
		model= new DefaultTableModel(title, 0); //행의 갯수 0
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		js.setBounds(10, 150, 265, 300);
		this.add(js);
		
		
	}
	
	
		
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TableIpgoEx00("연습00");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getSource();
		if(ob==btnAdd)
		{
			
		}
		
	}


	

}
