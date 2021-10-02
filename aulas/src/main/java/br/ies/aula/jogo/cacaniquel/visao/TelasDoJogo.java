package br.ies.aula.jogo.cacaniquel.visao;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelasDoJogo extends JFrame{
	private static final long serialVersionUID = 1L;
	// componentes painelInicial
	private ImageIcon rocketjpg = new ImageIcon(new ImageIcon("C:\\users\\ronal\\pictures\\minhas imagens\\rocket.jpg").getImage().getScaledInstance(200, 70, Image.SCALE_DEFAULT));
	private JLabel labelrocket = new JLabel();
	private JLabel labelPowered = new JLabel("powered by");
	private JLabel labelInserirDinheiro = new JLabel("Insira dinheiro: 1, 5 ou 10 reais.");
	private JButton btnMoeda1 = new JButton("1");
	private JButton btnMoeda5 = new JButton("5");
	private JButton btnMoeda10 = new JButton("10");
	private JPanel painelInicial = new JPanel();
	// componentes painelPrincipal
	private JLabel labelEstorno = new JLabel("Você pode sair, e pedir estorno das fichas restantes.");
	private JLabel labelCarta1 = new JLabel();
	JLabel carta1QueMovimenta = new JLabel();
	private JLabel labelCarta2 = new JLabel();
	private JLabel labelCarta3 = new JLabel();
	private JButton btnAlavanca = new JButton("JOGAR");
	private JButton btnAjuda = new JButton("Help");
	private JButton btnSair = new JButton("Sair");
	private ImageIcon coringajpg = new ImageIcon(new ImageIcon("C:\\users\\ronal\\pictures\\minhas imagens\\coringao.jpg").getImage().getScaledInstance(200, 300, Image.SCALE_DEFAULT));
	private JPanel painelPrincipal = new JPanel();
	
	public TelasDoJogo() throws InterruptedException {
		configuracaoTelaDoJogo();
		montarPainelPrincipal();
	}
	
	// painel inicial
	public void configuracaoPainelInicial() {
		
		painelInicial.setLayout(null);
		painelInicial.setBackground(Color.black);
		painelInicial.setVisible(true);
	}
	
	public void montarBotoesPainelInicial() {
		
		btnMoeda1.setBackground(Color.green);
		btnMoeda1.setForeground(Color.black);
		btnMoeda1.setBounds(460, 310, 150, 150);
		btnMoeda1.setFont(new Font("Comic Sans", Font.BOLD, 25));
		btnMoeda1.setVisible(true);
		
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
		
		painelInicial.add(btnMoeda1);
		painelInicial.add(btnMoeda5);
		painelInicial.add(btnMoeda10);
	}
	
	public void montarLabelsPainelInicial() {
		
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
		
		painelInicial.add(labelrocket);
		painelInicial.add(labelPowered);
		painelInicial.add(labelInserirDinheiro);
	}
	
	public void montarPainelInicial() {
		configuracaoPainelInicial();
		montarBotoesPainelInicial();
		montarLabelsPainelInicial();
		painelInicial.revalidate();
		getContentPane().add(painelInicial);
	}
	
	// painel principal
	public void configuracaoPainelPrincipal() {
		painelPrincipal.setLayout(null);
		painelPrincipal.setBackground(Color.black);
		painelPrincipal.setVisible(true);
	}
	
	public void montarBotoesPainelPrincipal() {
		
		btnSair.setBounds(1165, 1, 200, 24);
		btnSair.setForeground(Color.white);
		btnSair.setBackground(Color.blue);
		btnSair.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		btnSair.setVisible(true);
			
		btnAjuda.setBounds(1, 1, 200, 24);
		btnAjuda.setForeground(Color.white);
		btnAjuda.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		btnAjuda.setBackground(Color.blue);
		btnAjuda.setVisible(true);
		
		btnAlavanca.setBounds(1100, 350, 120, 120);
		btnAlavanca.setFont(new Font("Comic Sans", Font.BOLD, 15));
		btnAlavanca.setBackground(Color.green);
		btnAlavanca.setForeground(Color.black);
		btnAlavanca.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		btnAlavanca.setVisible(true);
		btnAlavanca.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				labelCarta1.setVisible(false);
				labelCarta2.setVisible(false);
				labelCarta3.setVisible(false);
				
			}
					
			
		});
		
		painelPrincipal.add(btnAlavanca);
		painelPrincipal.add(btnSair);
		painelPrincipal.add(btnAjuda);
	}
	

	public void montarLabelsPainelPrincipal() {
		
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
		getContentPane().add(painelPrincipal);
	}
	
	
	public void montarPainelPrincipal() {
		
		configuracaoPainelPrincipal();
		montarBotoesPainelPrincipal();
		montarLabelsPainelPrincipal();
		painelPrincipal.revalidate();
		getContentPane().add(painelPrincipal);
	}

	
	public void movimentarCartas() throws InterruptedException{

		
	}
	
	// JFrame
	public void configuracaoTelaDoJogo() {
		setSize(1420, 800);
		getContentPane().setBackground(Color.black);
		setVisible(true);
	}

}
