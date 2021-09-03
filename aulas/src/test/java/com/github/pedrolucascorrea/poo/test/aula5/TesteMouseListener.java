package com.github.pedrolucascorrea.poo.test.aula5;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TesteMouseListener {
	public static void main(String[] args) {
		JFrame janela = new JFrame();

		JLabel label = new JLabel("Balada do mouse");

		label.setOpaque(true);
		janela.getContentPane().add(label);
		janela.getContentPane().setLayout(new FlowLayout());
		janela.setSize(300, 300);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);

		label.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("MouseReleased");
				label.setForeground(Color.cyan);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("MousePressed");
				label.setForeground(Color.orange);

			}

			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("MouseExited");
				label.setForeground(Color.green);

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("MouseEntered");
				label.setForeground(Color.yellow);

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("MouseClicked");
				label.setForeground(Color.white);

			}
		});

	}
}
