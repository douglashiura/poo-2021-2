package testeJOptionPane;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import org.junit.Test;

public class JOptionPane {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Frame teste");
		JLabel label = new JLabel("Label teste");
		frame.setSize(1000,200);
		frame.pack();
		frame.setTitle("POO 2");
		frame.getContentPane().add(label, BorderLayout.CENTER);
		frame.setVisible(true);
	}
}
