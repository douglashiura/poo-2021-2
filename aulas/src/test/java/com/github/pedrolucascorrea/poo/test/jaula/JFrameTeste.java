package com.github.pedrolucascorrea.poo.test.jaula;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameTeste {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Meu primeiro frame em java");
		final JLabel label = new JLabel("Testando frame java");
		janela.getContentPane().add(label);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.pack();
		janela.setVisible(true);
	}
}
