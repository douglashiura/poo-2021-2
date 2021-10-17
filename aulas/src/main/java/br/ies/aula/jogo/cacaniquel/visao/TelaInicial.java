package br.ies.aula.jogo.cacaniquel.visao;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaInicial extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private ImageIcon rocketjpg = new ImageIcon(new ImageIcon("C:\\users\\ronal\\pictures\\minhas imagens\\rocket.jpg").getImage().getScaledInstance(200, 70, Image.SCALE_DEFAULT));
	private JLabel labelrocket = new JLabel();
	private JLabel labelPowered = new JLabel("powered by");
	private JLabel labelInserirDinheiro = new JLabel("Insira dinheiro: 1, 5 ou 10 reais.");
	private JButton btnMoeda1 = new JButton("1");
	private JButton btnMoeda5 = new JButton("5");
	private JButton btnMoeda10 = new JButton("10");
	private JButton btnSair = new JButton("SAIR");
	

	public TelaInicial() {
		
		configuracaoTelaInicial();
		montarPainel();
	}
		
	public void configuracaoTelaInicial() {
		
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
		
		btnMoeda1.setBackground(Color.green);
		btnMoeda1.setForeground(Color.black);
		btnMoeda1.setBounds(460, 210, 150, 150);
		btnMoeda1.setFont(new Font("Comic Sans", Font.BOLD, 25));
		btnMoeda1.setVisible(true);
		
		btnMoeda5.setBackground(Color.green);
		btnMoeda5.setForeground(Color.black);
		btnMoeda5.setBounds(620, 210, 150, 150);
		btnMoeda5.setFont(new Font("Comic Sans", Font.BOLD, 25));
		btnMoeda5.setVisible(true);
		
		btnMoeda10.setBackground(Color.green);
		btnMoeda10.setForeground(Color.black);
		btnMoeda10.setBounds(780, 210, 150, 150);
		btnMoeda10.setFont(new Font("Comic Sans", Font.BOLD, 25));
		btnMoeda10.setVisible(true);	
		
		add(btnSair);
		add(btnMoeda1);
		add(btnMoeda5);
		add(btnMoeda10);
	}
	
	public void montarLabels() {
		
		labelInserirDinheiro.setForeground(Color.white);
		labelInserirDinheiro.setFont(new Font("Verdana", Font.BOLD, 25));
		labelInserirDinheiro.setBounds(465, 150, 590, 40);
		labelInserirDinheiro.setVisible(true);
		
		labelPowered.setBounds(80, 672, 100, 30);
		labelPowered.setForeground(Color.gray);
		labelPowered.setFont(new Font("Verdana", Font.BOLD, 11));
		labelPowered.setVisible(true);
		
		labelrocket.setIcon(rocketjpg);
		labelrocket.setBorder(BorderFactory.createLineBorder(Color.green, 1));
		labelrocket.setBounds(10, 610, 200, 70);
		labelrocket.setVisible(true);
		
		add(labelrocket);
		add(labelPowered);
		add(labelInserirDinheiro);
	}
	
	public void montarPainel() {
		montarBotoes();
		montarLabels();
	}
	
	
	
	
	
	public JButton getBtn1() {
		return this.btnMoeda1;
	}
	
	public JButton getBtn5() {
		return this.btnMoeda5;
	}
	
	public JButton getBtn10() {
		return this.btnMoeda10;
	}
	
	public JButton getBtnSair() {
		return btnSair;
	}
	
	
}