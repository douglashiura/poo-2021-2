package br.ies.aula.jogo.cacaniquel.visao;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class TelaPrincipal extends JPanel{
	private static final long serialVersionUID = 1L;
	private JLabel labelEstorno = new JLabel("Você pode sair, e pedir estorno das fichas restantes.");
	private JLabel labelrocket = new JLabel();
	private JLabel labelPowered = new JLabel("powered by");
	private JLabel labelCarta1 = new JLabel();
	private JLabel labelCarta2 = new JLabel();
	private JLabel labelCarta3 = new JLabel();
	private JButton btnAlavanca = new JButton("JOGAR");
	private JButton btnAjuda = new JButton("Help");
	private JButton btnSair = new JButton("Sair");
	private ImageIcon rocketjpg = new ImageIcon(new ImageIcon("C:\\users\\ronal\\pictures\\minhas imagens\\rocket.jpg").getImage().getScaledInstance(200, 70, Image.SCALE_DEFAULT));
	private ImageIcon coringajpg = new ImageIcon(new ImageIcon("C:\\users\\ronal\\pictures\\minhas imagens\\coringao.jpg").getImage().getScaledInstance(200, 300, Image.SCALE_DEFAULT));

	
	public TelaPrincipal() throws InterruptedException {
		configurarTela();

		btnSair.setBounds(1165, 1, 200, 24);
		btnSair.setForeground(Color.white);
		btnSair.setBackground(Color.blue);
		btnSair.setVisible(true);
		btnSair.validate();
		
		btnAjuda.setBounds(1, 1, 200, 24);
		btnAjuda.setForeground(Color.white);
		btnAjuda.setBackground(Color.blue);
		btnAjuda.setVisible(true);
		
		btnAlavanca.setBounds(1100, 350, 120, 120);
		btnAlavanca.setFont(new Font("Comic Sans", Font.BOLD, 15));
		btnAlavanca.setBackground(Color.green);
		btnAlavanca.setForeground(Color.black);
		btnAlavanca.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		btnAlavanca.setVisible(true);
		
		labelEstorno.setBounds(450, 5, 480, 30);
		labelEstorno.setForeground(Color.white);
		labelEstorno.setFont(new Font("Courier New", Font.BOLD, 15));
		labelEstorno.setVisible(true);
		
		labelPowered.setBounds(80, 672, 100, 30);
		labelPowered.setForeground(Color.white);
		labelPowered.setFont(new Font("Verdana", Font.BOLD, 11));
		labelPowered.setVisible(true);
		
		labelrocket.setIcon(rocketjpg);
		labelrocket.setBorder(BorderFactory.createLineBorder(Color.blue, 1));
		labelrocket.setBounds(10, 610, 200, 70);
		labelrocket.setVisible(true);
		
		labelCarta1.setIcon(coringajpg);
		labelCarta1.setBorder(BorderFactory.createLineBorder(Color.yellow, 3));
		labelCarta1.setBounds(300, 250, 200, 300);
		labelCarta1.setVisible(true);
		
		labelCarta2.setIcon(coringajpg);
		labelCarta2.setBorder(BorderFactory.createLineBorder(Color.green, 3));
		labelCarta2.setBounds(515, 250, 200, 300);
		labelCarta2.setVisible(true);
		
		labelCarta3.setIcon(coringajpg);
		labelCarta3.setBorder(BorderFactory.createLineBorder(Color.blue, 3));
		labelCarta3.setBounds(730, 250, 200, 300);
		labelCarta3.setVisible(true);
		
		add(labelEstorno);
		add(labelrocket);	
		add(labelCarta1);
		add(labelCarta2);
		add(labelCarta3);
		add(labelPowered);
		add(btnAlavanca);
		add(btnSair);
		add(btnAjuda);
	}

	public void configurarTela() {
		setLayout(null);
		setSize(700, 700);
		setBackground(Color.black);
		setVisible(true);
		validate();
	}
	
	public void movimentarCartas() throws InterruptedException {

		for (int i = 0; i < 3000; i++) {
			labelCarta1.setBounds(300, i%550, 200, 300);
			Thread.sleep(1);
		}
		for (int i = 0; i < 3000; i++) {
			labelCarta2.setBounds(515, i%550, 200, 300);
			Thread.sleep(1);
		}
		for (int i = 0; i < 3000; i++) {
			labelCarta3.setBounds(730, i%550, 200, 300);
			Thread.sleep(1);
		}
		
		
		
		
		
	}
		
		
	}
	
	
	
	
	
	

