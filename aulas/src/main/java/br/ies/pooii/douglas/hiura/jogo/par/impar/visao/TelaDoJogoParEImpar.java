package br.ies.pooii.douglas.hiura.jogo.par.impar.visao;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TelaDoJogoParEImpar extends JFrame {

	private static final long serialVersionUID = 1L;

	public TelaDoJogoParEImpar() {
		this.getContentPane().add(montarPainel());
		this.configuraOTamanho();
		this.configuraOTituloDoJogo();
	}

	private JPanel montarPainel() {
		JPanel painelDoJogo = new JPanel();
		painelDoJogo.setLayout(new FlowLayout(FlowLayout.CENTER));
		painelDoJogo.add(montarPainelOpcoes());
		painelDoJogo.add(montarPainelDoNumero());
		painelDoJogo.add(montarPainelDeControle());
		painelDoJogo.add(montarPainelDeResultado());
		return painelDoJogo;
	}

	private JPanel montarPainelDeResultado() {
		JLabel etiquetaDoResultado = new JLabel("Aguardando apostas ...");
		JPanel painelDeResuldado = new JPanel();
		painelDeResuldado.add(etiquetaDoResultado);
		return painelDeResuldado;
	}

	private JPanel montarPainelDeControle() {
		JButton fazAposta = new JButton("Apostar");
		JPanel painelDeControle = new JPanel();
		painelDeControle.add(fazAposta);
		return painelDeControle;
	}

	private JPanel montarPainelDoNumero() {
		JPanel painelDoNumero = new JPanel();
		JLabel etiquetaDoValorJogado = new JLabel("Aposte um número");
		JTextField valorJogado = new JTextField(5);
		painelDoNumero.add(etiquetaDoValorJogado);
		painelDoNumero.add(valorJogado);
		return painelDoNumero;
	}

	private JPanel montarPainelOpcoes() {
		JLabel etiquetaDoTipo = new JLabel("Escolha o tipo");
		ButtonGroup gerenciadorDeUmaEscolaApenas = new ButtonGroup();
		JRadioButton par = new JRadioButton("Par");

		JRadioButton impar = new JRadioButton("Impar");

		gerenciadorDeUmaEscolaApenas.add(impar);
		gerenciadorDeUmaEscolaApenas.add(par);
		JPanel painelDoOpcoes = new JPanel();
		painelDoOpcoes.add(etiquetaDoTipo);
		painelDoOpcoes.add(par);
		painelDoOpcoes.add(impar);
		return painelDoOpcoes;
	}

	private void configuraOTituloDoJogo() {
		this.setTitle("Jogo de par e impar");
	}

	private void configuraOTamanho() {
		setSize(300, 300);
	}
}
