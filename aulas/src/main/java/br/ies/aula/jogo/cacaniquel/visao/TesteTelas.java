package br.ies.aula.jogo.cacaniquel.visao;


import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class TesteTelas extends JFrame{
	private static final long serialVersionUID = 1L;

	public TesteTelas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new CardLayout());
		setSize(700, 700);
		setVisible(true);
	}
	
	public static void main(String[] args) throws InterruptedException {

		TelaPrincipal panelInicial = new TelaPrincipal();
		TelaInicial panelPrincipal = new TelaInicial();
		TesteTelas frame = new TesteTelas();
		
		
		frame.getContentPane().add(panelInicial);
		panelInicial.criarTela();
		Thread.sleep(6000);
		
		frame.getContentPane().remove(panelInicial);
		frame.repaint();
		
		Thread.sleep(3000);
		frame.getContentPane().add(panelPrincipal);
		panelPrincipal.criarTela();
		
		
		Thread.sleep(6000);
		panelPrincipal.movimentarCartas();
		frame.repaint(); // atualiza os componentes na tela;
		frame.revalidate(); //reajustar o layout;
	 }

	

}