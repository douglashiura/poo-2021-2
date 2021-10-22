package br.ies.pooii.douglas.hiura.jogo.par.impar.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.Jogador;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.ModeloDoJogoDeParEImpar;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.RodadaDoJogo;
import br.ies.pooii.douglas.hiura.jogo.par.impar.visao.TelaDoJogoParEImpar;

public class ControleDoJogoParEImpar {

	private RodadaDoJogo rodada;

	public ControleDoJogoParEImpar(ModeloDoJogoDeParEImpar modelo, List<TelaDoJogoParEImpar> janelas) {
		rodada = modelo.novaRodada();
		adicionarOJogadorNasJanelas(janelas);
		adicionandoOOuvinteNasJanelas(janelas);
	}

	private void adicionarOJogadorNasJanelas(List<TelaDoJogoParEImpar> janelas) {
		for (TelaDoJogoParEImpar janela : janelas) {
			Jogador jogador = new Jogador(janela, "Se Joga", "123");
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
