package br.ies.poo.deiwid.petry.jogo.par.impar.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import br.ies.poo.deiwid.petry.jogo.par.impar.modelo.Jogador;
import br.ies.poo.deiwid.petry.jogo.par.impar.modelo.ModeloDoJogoParEImpar;
import br.ies.poo.deiwid.petry.jogo.par.impar.modelo.Rodada;
import br.ies.poo.deiwid.petry.jogo.par.impar.visao.TelaDoJogoParEImpar;

public class ControleDoJogoParEImpar {

	private Rodada rodada;

	public ControleDoJogoParEImpar(ModeloDoJogoParEImpar modelo, List<TelaDoJogoParEImpar> janelas) {
		rodada = modelo.novaRodada();
		adicionarOJogadorNasJanelas(janelas);
		adicionandoOOuvinteNasJanelas(janelas);
	}

	private void adicionarOJogadorNasJanelas(List<TelaDoJogoParEImpar> janelas) {
		for (TelaDoJogoParEImpar janela : janelas) {
			Jogador jogador = new Jogador(janela);
			janela.fixarJogador(jogador);
			rodada.querInscreverSe(jogador);
		}
	}

	private void adicionandoOOuvinteNasJanelas(List<TelaDoJogoParEImpar> janelas) {
		for (TelaDoJogoParEImpar janela : janelas) {
			OuveOCliqueDoMouseNoBotao ouvinte = new OuveOCliqueDoMouseNoBotao(janela);
			janela.adicionarOuvintes(ouvinte);
		}
	}

	class OuveOCliqueDoMouseNoBotao implements ActionListener {

		private TelaDoJogoParEImpar janela;

		public OuveOCliqueDoMouseNoBotao(TelaDoJogoParEImpar janela) {
			this.janela = janela;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			rodada.aposta(janela.obterAposta());
		}

	}

}
