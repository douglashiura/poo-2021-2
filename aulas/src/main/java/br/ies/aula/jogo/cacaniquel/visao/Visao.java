package br.ies.aula.jogo.cacaniquel.visao;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;


public class Visao extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private TelaLogin telaLogin;
	private TelaInicial telaInicial;
	private TelaPrincipal telaPrincipal;
	private TelaCartas telaCartas;

	
	public Visao() throws InterruptedException {
		
		telaLogin = new TelaLogin();
		telaInicial = new TelaInicial();
		telaPrincipal = new TelaPrincipal();
		telaCartas = new TelaCartas();

		configuracaoTelaVisao();
		addTelaLogin();
	}
	
	public void configuracaoTelaVisao() {
		
		getContentPane().setBackground(Color.magenta);
		getContentPane().setLayout(new BorderLayout());
		setSize(1420, 800);
		setVisible(true);
	}
	
	public void atualizarTelaVisao() {
		
		this.getContentPane().revalidate();
		this.getContentPane().repaint();
	}
	
	public void addTelaLogin() {
		
		this.getContentPane().removeAll();
		this.getContentPane().add(telaLogin);
		atualizarTelaVisao();
	}
	
	public void addTelaInicial() {
		
		this.getContentPane().removeAll();
		this.getContentPane().add(telaInicial);
		atualizarTelaVisao();
	}
	
	public void addTelaPrincipal() {
		
		this.getContentPane().removeAll();
		this.getContentPane().add(telaPrincipal);
		atualizarTelaVisao();
	}

	public void addTelaCartas(){
		
		this.getContentPane().removeAll();
		this.getContentPane().add(telaCartas);
		atualizarTelaVisao();
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

	public TelaLogin getTelaLogin() {
		return telaLogin;
	}

	
}
