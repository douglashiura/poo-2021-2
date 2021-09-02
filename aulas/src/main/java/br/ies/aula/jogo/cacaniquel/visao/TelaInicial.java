package br.ies.aula.jogo.cacaniquel.visao;


import java.awt.Color;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TelaInicial extends JPanel{
	private static final long serialVersionUID = 1L;
	private JLabel labelrocket = new JLabel();
	private JLabel labelCarta1 = new JLabel();
	private JLabel labelCarta2 = new JLabel();
	private JLabel labelCarta3 = new JLabel();
	private ImageIcon rocketjpg = new ImageIcon(new ImageIcon("C:\\users\\ronal\\pictures\\minhas imagens\\rocket.jpg").getImage().getScaledInstance(200, 70, Image.SCALE_DEFAULT));
	private ImageIcon coringa = new ImageIcon(new ImageIcon("C:\\users\\ronal\\pictures\\minhas imagens\\coringao.jpg").getImage().getScaledInstance(200, 300, Image.SCALE_DEFAULT));

	
	public TelaInicial() throws InterruptedException {
		
		setLayout(null);
		setSize(700, 700);
		setBackground(Color.black);
		setVisible(true);
		
	}
	
	public void criarLabels() throws InterruptedException {
		
		labelrocket.setIcon(rocketjpg);
		labelrocket.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
		labelrocket.setBounds(10, 600, 200, 70);
		labelrocket.setVisible(true);
		
		add(labelrocket);	
		add(labelCarta1);
			
	}
	
	public void movimentarCartas() throws InterruptedException {
		labelCarta1.setIcon(coringa);
		labelCarta1.setBorder(BorderFactory.createLineBorder(Color.green, 3));
		labelCarta1.setBounds(400, 250, 200, 300);
		labelCarta1.setVisible(true);
		
		
		labelCarta2.setIcon(coringa);
		labelCarta2.setBorder(BorderFactory.createLineBorder(Color.green, 3));
		labelCarta2.setBounds(600, 250, 200, 300);
		labelCarta2.setVisible(true);
		
		
		labelCarta3.setIcon(coringa);
		labelCarta3.setBorder(BorderFactory.createLineBorder(Color.green, 3));
		labelCarta3.setBounds(800, 250, 200, 300);
		labelCarta3.setVisible(true);
		
		
		
		
	}
		
		
	}
	
	
	
	
	
	

