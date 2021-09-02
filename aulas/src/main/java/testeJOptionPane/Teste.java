package testeJOptionPane;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Teste {
	public static void main (String arg[]) {
		JFrame frame = new JFrame("Frame");
		JLabel label = new JLabel("TESTE", SwingConstants.CENTER);
		
		frame.getContentPane().add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setVisible(true);
		
		frame.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("mouse released");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("mouse pressed");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("mouse exited");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("mouse entered");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("mouse clicked");
			}
		});
	}
}
