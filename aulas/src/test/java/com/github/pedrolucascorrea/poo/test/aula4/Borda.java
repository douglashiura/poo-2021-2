package com.github.pedrolucascorrea.poo.test.aula4;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Borda {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(600, 600);
		frame.getContentPane().setLayout(new GridLayout(2, 2));

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();

		JPanel panel21 = new JPanel();
		JPanel panel22 = new JPanel();

		JLabel label1 = new JLabel("Pedro Lucas Cardoso Correa");
		JLabel label2 = new JLabel("Washington");
		JLabel label3 = new JLabel("Andreia");

		label1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		label2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		label3.setBorder(BorderFactory.createLineBorder(Color.black, 2));

		frame.getContentPane().add(panel1);
		frame.getContentPane().add(panel2);

		panel1.setBackground(Color.orange);
		panel2.setBackground(Color.lightGray);
		panel21.setBackground(Color.cyan);
		panel22.setBackground(Color.green);

		panel1.setBorder(BorderFactory.createLineBorder(Color.green, 20));
		panel2.setBorder(BorderFactory.createLineBorder(Color.orange, 20));
		panel21.setBorder(BorderFactory.createLineBorder(Color.green, 20));
		panel22.setBorder(BorderFactory.createLineBorder(Color.cyan, 20));

		panel1.add(label1);
		panel21.add(label2);
		panel22.add(label3);

		panel2.add(panel21);
		panel2.add(panel22);

		frame.setTitle("Testando as bordas");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
