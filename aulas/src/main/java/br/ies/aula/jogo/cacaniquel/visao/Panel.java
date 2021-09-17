package br.ies.aula.jogo.cacaniquel.visao;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JPanel{
	private static final long serialVersionUID = 1L;
	private ImageIcon rocketjpg = new ImageIcon(new ImageIcon("C:\\users\\ronal\\pictures\\minhas imagens\\rocket.jpg").getImage().getScaledInstance(200, 70, Image.SCALE_DEFAULT));
	private JLabel labelrocket = new JLabel();
	private JLabel labelPowered = new JLabel("powered by");
	private JLabel labelInserirDinheiro = new JLabel("Insira dinheiro: 1, 5 ou 10 reais.");
	public JButton btnMoeda1 = new JButton("1");
	private JButton btnMoeda5 = new JButton("5");
	private JButton btnMoeda10 = new JButton("10");
	private TelaPrincipal telaPrincipal = new TelaPrincipal();
	CardLayout cardLayout = new CardLayout();

	
	public Panel() {
		configuracaoTela();
		botoes();
		labels();
		
	}
	
	public void botoes() {
		btnMoeda1.setBackground(Color.green);
		btnMoeda1.setForeground(Color.black);
		btnMoeda1.setBounds(460, 310, 150, 150);
		btnMoeda1.setFont(new Font("Comic Sans", Font.BOLD, 25));
		btnMoeda1.setVisible(true);
		
		btnMoeda1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ev) {
			}
		});
		
		
		btnMoeda5.setBackground(Color.green);
		btnMoeda5.setForeground(Color.black);
		btnMoeda5.setBounds(620, 310, 150, 150);
		btnMoeda5.setFont(new Font("Comic Sans", Font.BOLD, 25));
		btnMoeda5.setVisible(true);
		
		btnMoeda10.setBackground(Color.green);
		btnMoeda10.setForeground(Color.black);
		btnMoeda10.setBounds(780, 310, 150, 150);
		btnMoeda10.setFont(new Font("Comic Sans", Font.BOLD, 25));
		btnMoeda10.setVisible(true);
		
		add(btnMoeda1);
		add(btnMoeda5);
		add(btnMoeda10);
	
	}
	
	public void labels() {
		labelInserirDinheiro.setForeground(Color.yellow);
		labelInserirDinheiro.setFont(new Font("Verdana", Font.BOLD, 25));
		labelInserirDinheiro.setBounds(465, 150, 590, 40);
		labelInserirDinheiro.setVisible(true);
		
		labelPowered.setBounds(80, 672, 100, 30);
		labelPowered.setForeground(Color.white);
		labelPowered.setFont(new Font("Verdana", Font.BOLD, 11));
		labelPowered.setVisible(true);
		
		labelrocket.setIcon(rocketjpg);
		labelrocket.setBorder(BorderFactory.createLineBorder(Color.blue, 1));
		labelrocket.setBounds(10, 610, 200, 70);
		labelrocket.setVisible(true);
		
		add(labelrocket);
		add(labelPowered);
		add(labelInserirDinheiro);
	}
	
	public void configuracaoTela() {
		setLayout(cardLayout);
		setSize(700, 700);
		setBackground(Color.black);
		setVisible(true);
	}
}

