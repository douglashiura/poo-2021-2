package br.com.jswing.aulas;

import javax.swing.*;

public class Aula1JSwing {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello World Swing");
		final JLabel label = new JLabel("Hello World");
		frame.getContentPane().add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}

}
