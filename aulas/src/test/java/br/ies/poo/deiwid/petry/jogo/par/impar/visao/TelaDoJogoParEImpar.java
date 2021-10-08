package br.ies.poo.deiwid.petry.jogo.par.impar.visao;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import br.ies.poo.deiwid.petry.jogo.par.impar.modelo.Aposta;
import br.ies.poo.deiwid.petry.jogo.par.impar.modelo.Especulavel;
import br.ies.poo.deiwid.petry.jogo.par.impar.modelo.Jogador;
import br.ies.poo.deiwid.petry.jogo.par.impar.modelo.ResultadoDoJogo;
import br.ies.poo.deiwid.petry.jogo.par.impar.modelo.TiposDeAposta;

public class TelaDoJogoParEImpar extends JFrame implements Especulavel {

	private static final long serialVersionUID = 1L;
	private JButton fazAposta;
	private JTextField valorJogado;
	private JRadioButton par;
	private Jogador jogador;
	private JLabel etiquetaDoResultado;

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
		etiquetaDoResultado = new JLabel("Aguardando apostas ...");
		JPanel painelDeResuldado = new JPanel();
		painelDeResuldado.add(etiquetaDoResultado);
		return painelDeResuldado;
	}

	private JPanel montarPainelDeControle() {
		fazAposta = new JButton("Apostar");
		JPanel painelDeControle = new JPanel();
		painelDeControle.add(fazAposta);
		return painelDeControle;
	}

	private JPanel montarPainelDoNumero() {
		JPanel painelDoNumero = new JPanel();
		JLabel etiquetaDoValorJogado = new JLabel("Aposte um número");
		valorJogado = new JTextField(5);
		painelDoNumero.add(etiquetaDoValorJogado);
		painelDoNumero.add(valorJogado);
		return painelDoNumero;
	}

	private JPanel montarPainelOpcoes() {
		JLabel etiquetaDoTipo = new JLabel("Escolha o tipo");
		ButtonGroup gerenciadorDeUmaEscolaApenas = new ButtonGroup();
		par = new JRadioButton("Par");

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

	public void adicionarOuvintes(ActionListener ouvinte) {
		fazAposta.addActionListener(ouvinte);
	}

	public Aposta obterAposta() {
		Integer valor = Integer.valueOf(valorJogado.getText());
		TiposDeAposta tipo = par.isSelected() ? TiposDeAposta.PAR : TiposDeAposta.IMPAR;
		Aposta umaAposta = new Aposta(jogador, valor, tipo);
		return umaAposta;
	}

	@Override
	public void obtemOResultado(ResultadoDoJogo resultado) {
		etiquetaDoResultado.setText(String.format("A aposta vencedora foi %s, com soma %s",
				resultado.obterTipoDaApostaVencedora(), resultado.obterValorSomado()));
	}

	public void fixarJogador(Jogador jogador) {
		this.jogador = jogador;

	}
}
