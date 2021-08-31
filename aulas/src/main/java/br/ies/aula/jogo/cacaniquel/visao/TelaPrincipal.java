package br.ies.aula.jogo.cacaniquel.visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaPrincipal {

	
	
	public void mostrarTela() throws InterruptedException {
		
		
		ImageIcon coringa = new ImageIcon(new ImageIcon("C:\\users\\ronal\\pictures\\minhas imagens\\coringao.jpg").getImage().getScaledInstance(200, 300, Image.SCALE_DEFAULT));
		ImageIcon rocketimg = new ImageIcon(new ImageIcon("C:\\users\\ronal\\pictures\\minhas imagens\\rocket.jpg").getImage().getScaledInstance(300, 70, Image.SCALE_DEFAULT));

		
		JLabel carta1= new JLabel();
		JLabel carta2 = new JLabel();
		JLabel carta3 = new JLabel();
		JLabel rocket = new JLabel();
		JLabel powered = new JLabel("powered by");
		
		
		powered.setBounds(130, 665, 100, 30);
		powered.setFont(new Font("Gotham", Font.BOLD, 12));
		powered.setForeground(Color.WHITE);
		
		rocket.setIcon(rocketimg);
		rocket.setBounds(10, 600, 300, 70);
		rocket.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
		
		carta1.setIcon(coringa);
		carta2.setIcon(coringa);
		carta3.setIcon(coringa);
		
		
		
		JFrame frame = new JFrame("CAÇA-NÍQUEL");
		frame.setVisible(true);
		frame.setSize(1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.black);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(carta1);
		frame.getContentPane().add(carta2);
		frame.getContentPane().add(carta3);
		frame.getContentPane().add(rocket);
		frame.getContentPane().add(powered);
		
		
		for (int i = 0; i < 3000; i++) {
			carta1.setBounds(400, i%550, 200, 300);
			Thread.sleep(1);
		}
		
		for (int i = 0; i < 3000; i++) {
			carta2.setBounds(610, i%550, 200, 300);
			Thread.sleep(1);
		}
		
		for (int i = 0; i < 3000; i++) {
			carta3.setBounds(820, i%550, 200, 300);
			Thread.sleep(1);
		}
		
	}
	
}
