package testeJOptionPane;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Teste {
	public static void main (String arg[]) {
	    JLabel label = new JLabel("TESTE", JLabel.CENTER);
	    JFrame frame = new JFrame("Frame");
		frame.getContentPane().add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setVisible(true);
		
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				label.setForeground(Color.black);
				frame.getContentPane().setBackground(Color.white);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				label.setForeground(Color.white);
				frame.getContentPane().setBackground(Color.black);  
			}
		});
	}
}
