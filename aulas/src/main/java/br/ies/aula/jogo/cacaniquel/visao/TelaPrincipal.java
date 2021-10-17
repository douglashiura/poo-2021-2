package br.ies.aula.jogo.cacaniquel.visao;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaPrincipal extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JLabel labelrocket = new JLabel();
	private JLabel labelPowered = new JLabel("powered by");
	private JLabel labelEstorno = new JLabel("Você pode sair, e será reembolsado.");
	private JLabel labelFichas = new JLabel("Você possui 0 fichas");
	private JLabel carta1 = new JLabel();
	private JLabel carta2 = new JLabel();
	private JLabel carta3 = new JLabel();
	private JButton btnAlavanca = new JButton("JOGAR");
	private JButton btnSair = new JButton("SAIR");
	private ImageIcon rocketjpg = new ImageIcon(new ImageIcon("C:\\users\\ronal\\pictures\\minhas imagens\\rocket.jpg").getImage().getScaledInstance(200, 70, Image.SCALE_DEFAULT));
	private ImageIcon coringajpg = new ImageIcon(new ImageIcon("C:\\users\\ronal\\pictures\\minhas imagens\\coringa.jpg").getImage().getScaledInstance(200, 300, Image.SCALE_DEFAULT));

	public TelaPrincipal() {
		
		configuracaoTelaPrincipal();
		montarTela();
	}

	
	public void configuracaoTelaPrincipal() {
		
		setBorder(BorderFactory.createLineBorder(Color.green, 1));
		setBackground(Color.black);
		setLayout(null);
		setVisible(true);
	}
	
	public void montarBotoes() {
		
		btnSair.setBounds(1165, 1, 200, 24);
		btnSair.setForeground(Color.black);
		btnSair.setBackground(Color.green);
		btnSair.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		btnSair.setVisible(true);
		
		btnAlavanca.setBounds(1100, 350, 120, 120);
		btnAlavanca.setFont(new Font("Comic Sans", Font.BOLD, 15));
		btnAlavanca.setBackground(Color.green);
		btnAlavanca.setForeground(Color.black);
		btnAlavanca.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		btnAlavanca.setVisible(true);
		
		add(btnSair);
		add(btnAlavanca);
	}
	
	public void montarLabels() {
		
		labelFichas.setBounds(430, 150, 480, 40);
		labelFichas.setForeground(Color.white);
		labelFichas.setFont(new Font("Courier New", Font.BOLD, 30));
		labelFichas.setVisible(true);
		
		labelEstorno.setBounds(1080, 40, 480, 30);
		labelEstorno.setForeground(Color.white);
		labelEstorno.setFont(new Font("Verdana", Font.PLAIN, 15));
		labelEstorno.setVisible(true);
		
		labelPowered.setBounds(80, 672, 100, 30);
		labelPowered.setForeground(Color.gray);
		labelPowered.setFont(new Font("Verdana", Font.BOLD, 11));
		labelPowered.setVisible(true);
		
		labelrocket.setIcon(rocketjpg);
		labelrocket.setBorder(BorderFactory.createLineBorder(Color.green, 1));
		labelrocket.setBounds(10, 610, 200, 70);
		labelrocket.setVisible(true);
		
		carta1.setIcon(coringajpg);
		carta1.setBorder(BorderFactory.createLineBorder(Color.yellow, 3));
		carta1.setBounds(300, 250, 200, 300);
		carta1.setVisible(true);
		
		carta2.setIcon(coringajpg);
		carta2.setBorder(BorderFactory.createLineBorder(Color.green, 3));
		carta2.setBounds(515, 250, 200, 300);
		carta2.setVisible(true);
		
		carta3.setIcon(coringajpg);
		carta3.setBorder(BorderFactory.createLineBorder(Color.blue, 3));
		carta3.setBounds(730, 250, 200, 300);
		carta3.setVisible(true);
		
		add(labelEstorno);
		add(labelrocket);	
		add(carta1);
		add(carta2);
		add(carta3);
		add(labelPowered);
		add(labelFichas);
	}
	
	public void montarTela() {
		
		montarBotoes();
		montarLabels();
	}
	
	public void atualizarTela() {
		
		repaint();
		revalidate();
	}
	
	public JButton getBtnAlavanca() {
		
		return this.btnAlavanca;
	}
	
	public JLabel getLabelFichas() {
		return labelFichas;
	}
	
	public JButton getBtnSair() {
		
		return this.btnSair;
	}
}
