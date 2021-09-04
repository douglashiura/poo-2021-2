package br.ies.aula.jogo.cacaniquel.visao;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaPrincipal extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private ImageIcon rocketjpg = new ImageIcon(new ImageIcon("C:\\users\\ronal\\pictures\\minhas imagens\\rocket.jpg").getImage().getScaledInstance(200, 70, Image.SCALE_DEFAULT));
	private JLabel labelrocket = new JLabel();
	private JLabel labelPowered = new JLabel("powered by");
	
	public TelaPrincipal() {
		setLayout(null);
		setSize(700, 700);
		setBorder(BorderFactory.createLineBorder(Color.cyan));
		setBackground(Color.black);
		setVisible(true);
	}
	
	public void criarTela() throws InterruptedException {
		
		labelPowered.setBounds(80, 672, 100, 30);
		labelPowered.setForeground(Color.GRAY);
		labelPowered.setFont(new Font("Verdana", Font.BOLD, 11));
		labelPowered.setVisible(true);
		
		labelrocket.setIcon(rocketjpg);
		labelrocket.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
		labelrocket.setBounds(10, 610, 200, 70);
		labelrocket.setVisible(true);
		add(labelrocket);
		add(labelPowered);
		
	}
		
}
	
