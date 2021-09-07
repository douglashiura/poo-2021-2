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
		getContentPane().setLayout(new GridLayout());
		setSize(700, 700);
		setVisible(true);
	}
	
	public static void main(String[] args) throws InterruptedException {

		TelaPrincipal panelPrincipal = new TelaPrincipal();
		TelaInicial panelInicial = new TelaInicial();
		TesteTelas frame = new TesteTelas();
		
		for(int n=0; n<10; n++) {
		
		frame.getContentPane().revalidate();
		frame.getContentPane().add(panelInicial);
		frame.getContentPane().repaint();
		Thread.sleep(1000);
		
		frame.getContentPane().remove(panelInicial);

		frame.getContentPane().revalidate();
		frame.getContentPane().add(panelPrincipal);
		frame.getContentPane().repaint();
		Thread.sleep(1000);
		
		frame.getContentPane().remove(panelPrincipal);
		Thread.sleep(1000);
		
		
		}
		
		
		
	}

}