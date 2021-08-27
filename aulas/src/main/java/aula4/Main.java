package aula4;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400,400);
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Carlos Eduardo Fernandes Davila");
		label.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.getContentPane().add(panel);
		panel.add(label);
		frame.setVisible(true);
	}

}
