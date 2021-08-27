package testeJOptionPane;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Teste {
	public static void main (String arg[]) {
		JFrame frame = new JFrame("Frame");
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Larissa Starosky");
		
		label.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.getContentPane().add(panel);
		panel.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(400, 200);
	}
}
