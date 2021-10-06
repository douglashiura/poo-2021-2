package br.ies.pooii.douglas.hiura.jogo.par.impar.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.ModeloDoJogoDeParEImpar;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.Rodada;
import br.ies.pooii.douglas.hiura.jogo.par.impar.visao.TelaDoJogoParEImpar;

public class ControleDoJogoParEImpar {

	private Rodada rodada;

	public ControleDoJogoParEImpar(ModeloDoJogoDeParEImpar modelo, List<TelaDoJogoParEImpar> janelas) {
		rodada = modelo.novaRodada();
		OuveOCliqueDoMouseNoBotao ouvinte = new OuveOCliqueDoMouseNoBotao();
		for (TelaDoJogoParEImpar janela : janelas) {
			janela.adicionarOuvintes(ouvinte);
		}

	}

	class OuveOCliqueDoMouseNoBotao implements ActionListener {

		private TelaDoJogoParEImpar janela;

		@Override
		public void actionPerformed(ActionEvent e) {
			rodada.aposta(janela.obterAposta());

		}

	}

}
