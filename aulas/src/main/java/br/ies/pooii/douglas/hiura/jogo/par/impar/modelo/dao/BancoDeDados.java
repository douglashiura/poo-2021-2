package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao;

import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.EnviarOResultadoAoBancoDeDados;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.Especulavel;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.RodadaDoJogo;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.Torcedor;

public class BancoDeDados extends Torcedor {

	public BancoDeDados(RodadaDoJogo rodadaDoJogo) {
		super(recebeOResultado(rodadaDoJogo), "Banco de dados", "senha");
	}

	private static Especulavel recebeOResultado(RodadaDoJogo rodadaDoJogo) {
		return new EnviarOResultadoAoBancoDeDados(rodadaDoJogo);
	}

}
