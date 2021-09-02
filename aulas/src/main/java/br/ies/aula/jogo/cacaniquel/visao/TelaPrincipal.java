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
import javax.swing.JPanel;

public class TelaPrincipal {

	
	
	public void mostrarTela() throws InterruptedException {
		
		ImageIcon coringa = new ImageIcon(new ImageIcon("C:\\users\\ronal\\pictures\\minhas imagens\\coringao.jpg").getImage().getScaledInstance(200, 300, Image.SCALE_DEFAULT));
		ImageIcon rocketimg = new ImageIcon(new ImageIcon("C:\\users\\ronal\\pictures\\minhas imagens\\rocket.jpg").getImage().getScaledInstance(200, 70, Image.SCALE_DEFAULT));

		
		JLabel carta1= new JLabel();
		JLabel carta2 = new JLabel();
		JLabel carta3 = new JLabel();
		JLabel rocket = new JLabel();
		JLabel powered = new JLabel("powered by");
		
		//labels
		powered.setBounds(80, 662, 100, 30);
		powered.setFont(new Font("Gotham", Font.BOLD, 12));
		powered.setForeground(Color.WHITE);
		
		rocket.setIcon(rocketimg);
		rocket.setBounds(10, 600, 200, 70);
		rocket.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
		
		carta1.setIcon(coringa);
		carta1.setBorder(BorderFactory.createLineBorder(Color.green, 3));
		carta2.setIcon(coringa);
		carta2.setBorder(BorderFactory.createLineBorder(Color.blue, 3));
		carta3.setIcon(coringa);
		carta3.setBorder(BorderFactory.createLineBorder(Color.yellow, 3));

		
		
		JPanel panel = new JPanel();
		panel.setVisible(true);
		panel.setBackground(Color.black);
		panel.setLayout(null);
		panel.add(carta1);
		panel.add(carta2);
		panel.add(carta3);
		panel.add(powered);
		panel.add(rocket);
		
		
		JFrame frame = new JFrame("CAÇA-NÍQUEL");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(1000, 700);
		frame.getContentPane().add(panel);
		
		for (int i = 0; i < 3000; i++) {
			carta1.setBounds(400, i%550, 200, 300);
			Thread.sleep(1);
		}
		for (int i = 0; i < 3000; i++) {	
			carta2.setBounds(610, i%550, 200, 300);
			Thread.sleep(1);
		}
		for (int i = 0; i < 3000; i++) {	
			carta3.setBounds(610, i%550, 200, 300);
			Thread.sleep(1);
		}
	}
		
}
	
