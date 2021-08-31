package com.github.pedrolucascorrea.poo.test.aula1e2;

import javax.swing.*;

public class HWorldTeste extends JFrame {

	public HWorldTeste() {
		super("HelloWorldSwing");
		final JLabel label = new JLabel("Hello World");
		getContentPane().add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);

	}

	public static void main (String[] args) {
		HWorldTeste frame = new HWorldTeste();
		
	}
}
