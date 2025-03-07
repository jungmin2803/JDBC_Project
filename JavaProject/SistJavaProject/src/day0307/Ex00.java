package day0307;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class Ex00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SwingUtilities.invokeLater(()->{
			JFrame frame= new JFrame("Swing 기본 예제");
			frame.setSize(400, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JLabel lable=new JLabel("Hello, Swing!",SwingConstants.CENTER);
			frame.add(lable);
			frame.setVisible(true);
			
			
		}
				
				
				);
	}

}
