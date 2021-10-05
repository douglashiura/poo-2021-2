package br.ies.aula.jogo.cacaniquel.visao;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;


public class Visao extends JFrame{
	private static final long serialVersionUID = 1L;
	private TelaPrincipal telaPrincipal = new TelaPrincipal();
	private TelaInicial telaInicial = new TelaInicial();
	private TelaCartas telaCartas = new TelaCartas();

	
	public Visao() throws InterruptedException {
		configuracaoTelaDoJogo();
		
		getContentPane().add(telaInicial);
	}
	
	public void configuracaoTelaDoJogo() {
		
		getContentPane().setBackground(Color.darkGray);
		getContentPane().setLayout(new BorderLayout());
		setSize(1420, 800);
		setVisible(true);
	}
	
	public void addTelaPrincipal() {
		
		this.getContentPane().removeAll();
		this.getContentPane().add(telaPrincipal);
		atualizarFrame();
	}

	
	public void addTelaCartas() {
		
		this.getContentPane().removeAll();
		this.getContentPane().add(telaCartas);
		atualizarFrame();
	}
	
	public void atualizarFrame() {
		
		this.getContentPane().revalidate();
		this.getContentPane().repaint();
	}

	
	public TelaInicial getTelaInicial() {
		
		return this.telaInicial;
	}
	
	public TelaPrincipal getTelaPrincipal() {
		
		return this.telaPrincipal;
	}

	public TelaCartas getTelaCartas() {
		
		return this.telaCartas;
	}


}
