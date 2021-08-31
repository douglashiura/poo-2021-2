package br.ies.aula.jogo.cacaniquel.visao;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TelaInicial extends JFrame{
	
	
	public void mostrarTela() {
		
		ImageIcon imagem = new ImageIcon(new ImageIcon("C:\\users\\ronal\\pictures\\minhas imagens\\caca.png").getImage().getScaledInstance(1400, 700, Image.SCALE_DEFAULT));
		JLabel label = new JLabel();
		label.setVisible(true);
		label.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		label.setIcon(imagem);
		
		JPanel panel = new JPanel();
		panel.setVisible(true);
		panel.setBackground(Color.black);
		panel.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		
		TelaInicial frame = new TelaInicial();
		frame.setTitle("CAÇA-NÍQUEL");
		frame.setVisible(true);
		frame.setSize(800, 400);
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.getContentPane().add(panel);
		
	}

	
	
	
}
