package day0310;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingEx00 extends JFrame {

	Container cp;
	public SwingEx00(String title) {
		super(title);
		
		this.setBounds(1000, 200, 500, 600);
		cp=this.getContentPane();
		cp.setBackground(Color.cyan);
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingEx00("스윙 레이아웃 널 #0");
	}
}