package com.github.pedrolucascorrea.poo.test.aula5;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TesteMouseListener {
	public static void main(String[] args) {
		JFrame janela = new JFrame();

		JLabel label = new JLabel("Teste");
		JPanel panel = new JPanel();
		JLabel labelPanel = new JLabel("Label do Panel");

		panel.add(labelPanel);
		
		janela.getContentPane().add(label);
		janela.getContentPane().add(panel);
		janela.getContentPane().setLayout(new FlowLayout());
		janela.setSize(300, 300);
		janela.setBackground(Color.cyan);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);

		panel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("MouseReleased");
				panel.setBackground(Color.cyan);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("MousePressed");
				panel.setBackground(Color.orange);

			}

			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("MouseExited");
				panel.setBackground(Color.green);

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("MouseEntered");
				panel.setBackground(Color.yellow);

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("MouseClicked");
				panel.setBackground(Color.white);

			}
		});

		label.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("MouseReleased");
				label.setBackground(Color.cyan);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("MousePressed");
				label.setBackground(Color.orange);

			}

			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("MouseExited");
				label.setBackground(Color.green);

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("MouseEntered");
				label.setBackground(Color.yellow);

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("MouseClicked");
				label.setBackground(Color.white);

			}
		});

	}
}
