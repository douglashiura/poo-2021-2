package br.ies.aula.jogo.cacaniquel.visao;

import javax.swing.JFrame;

public class TesteTelas {

	
	public static void main(String[] args) throws InterruptedException {
		
		TelaInicial panel = new TelaInicial();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel);
		frame.setSize(700, 700);
		frame.setVisible(true);
		panel.criarLabels();
		panel.movimentarCartas();
		
		
	}
}
