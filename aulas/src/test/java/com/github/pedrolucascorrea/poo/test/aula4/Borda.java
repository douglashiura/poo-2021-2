package com.github.pedrolucascorrea.poo.test.aula4;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Borda {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300, 300);

		JPanel panel = new JPanel();

		JLabel label = new JLabel("Pedro Lucas Cardoso Correa - Teste da borda");
		label.setBorder(BorderFactory.createTitledBorder("Testando a borda"));

		frame.getContentPane().add(panel);
		panel.add(label);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
