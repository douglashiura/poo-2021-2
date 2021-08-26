package com.github.pedrolucascorrea.poo.test.jaula3;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TesteLabel {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Números dentro do container");
		
		JLabel etiqueta1 = new JLabel("1");
		JLabel etiqueta2 = new JLabel("2");
		JLabel etiqueta3 = new JLabel("3");
		JLabel etiqueta4 = new JLabel("4");
		JLabel etiqueta5 = new JLabel("5");
		
		//janela.setLayout(new FlowLayout());
		janela.getContentPane().setLayout(new FlowLayout());
		
		janela.getContentPane().add(etiqueta1);
		janela.getContentPane().add(etiqueta2);
		janela.getContentPane().add(etiqueta3);
		janela.getContentPane().add(etiqueta4);
		janela.getContentPane().add(etiqueta5);

		janela.setSize(300, 300);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
