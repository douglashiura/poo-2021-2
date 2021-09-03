package testeJOptionPane;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Label {
	
	static JLabel labelQueMudaDeCor;
	
	public static void main(String[] args) {
		JLabel label = new JLabel("TESTE", JLabel.CENTER);
	    JFrame frame = new JFrame("Frame");
		frame.getContentPane().add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setVisible(true);
		
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				label.setForeground(Color.GREEN);
				frame.getContentPane().setBackground(Color.BLUE);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				label.setForeground(Color.BLUE);
				frame.getContentPane().setBackground(Color.GREEN);  
			}
		});
	}
}
