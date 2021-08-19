package testeJOptionPane;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Teste {
	public static void main (String arg[]) {
		//JOptionPane.showInputDialog("Teste");
		
		JFrame frame = new JFrame("Frame");
		JLabel label = new JLabel("Teste");
		//frame.setSize(400, 300);
		frame.getContentPane().add(label, BorderLayout.CENTER);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
