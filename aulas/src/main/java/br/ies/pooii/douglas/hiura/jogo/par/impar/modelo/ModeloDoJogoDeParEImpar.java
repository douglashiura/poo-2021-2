package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo;

import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.BancoDeDados;

public class ModeloDoJogoDeParEImpar {

	public RodadaDoJogo novaRodada() {
		RodadaDoJogo rodadaDoJogo = new RodadaDoJogo();
		rodadaDoJogo.querAssistir(new BancoDeDados(rodadaDoJogo));
		return rodadaDoJogo;
	}

}
