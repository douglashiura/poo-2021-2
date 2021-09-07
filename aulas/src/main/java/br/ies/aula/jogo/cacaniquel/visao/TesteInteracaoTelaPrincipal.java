package br.ies.aula.jogo.cacaniquel.visao;

import java.awt.CardLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class TesteInteracaoTelaPrincipal extends JFrame{
	private static final long serialVersionUID = 1L;

	public TesteInteracaoTelaPrincipal() {
		super("CAÇA-NÍQUEL GAME");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setSize(700, 700);
		setVisible(true);
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		TesteTelas frame = new TesteTelas();
		TelaPrincipal panelPrincipal = new TelaPrincipal();
		
		Thread.sleep(1000);
		frame.getContentPane().add(panelPrincipal).revalidate();
	 }

}
