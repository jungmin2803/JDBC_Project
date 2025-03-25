package day0321;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import day0319.DbConnect;

public class stuInfoSwing extends JFrame implements ActionListener, ItemListener {
	
	DbConnect db=new DbConnect();
	Scanner sc=new Scanner(System.in);
	
	Container cp;
	JTable table;	
	DefaultTableModel model;
	JButton btnAdd,btnDel;
	JRadioButton rb [] =new JRadioButton[6];
	
	public stuInfoSwing(String title) {
		super(title);
		
		this.setBounds(200, 30, 700, 500);
		cp=this.getContentPane();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setBackground(Color.white);
		initDesign();
		
		this.setVisible(true);
		
		
		
		
		
	}
	
	public void initDesign()
	{
		this.setLayout(null);
		String [] title= {"번호","ID","이름","주소","혈액형","핸드폰번호","학년","나이","생일","입력날짜"};		
		model=new DefaultTableModel(title, 0);
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);		
		js.setBounds(10, 150, 670, 300);		
		table.getColumnModel().getColumn(0).setPreferredWidth(30);
		this.add(js);
		
		ButtonGroup bg=new ButtonGroup();
		String []rb_label= {"전체","남자","여자","개발부","홍보부","디자인부"};
		
		int xpos=20;
		for(int i=0; i< rb_label.length;i++)
		{
			rb[i]=new JRadioButton(rb_label[i], i==0?true:false);
			rb[i].setBounds(xpos, 100, 80, 30);
			rb[i].setOpaque(false);
			xpos+=110;
			this.add(rb[i]);			
		}
		
		btnAdd=new JButton("추가");
		btnAdd.setBounds(20, 20, 80, 30);
		this.add(btnAdd);
		btnAdd.addItemListener(this);
		
		btnDel=new JButton("삭제"	);
		btnDel.setBounds(60, 20, 80, 30);
				
	}
	public void insertStu()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new stuInfoSwing("학생 정보");
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob =e.getSource();
		
		
		
	}

}
