package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo;

public class Jogador {

	private Especulavel recebeResultado;

	public Jogador(Especulavel recebeResultado) {
		this.recebeResultado = recebeResultado;
	}

	public Especulavel obterSuaParteEspeculavel() {
		return recebeResultado;
	}

}
