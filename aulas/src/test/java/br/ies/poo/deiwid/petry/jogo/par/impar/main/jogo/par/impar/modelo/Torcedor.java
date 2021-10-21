package br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar.modelo;

public class Torcedor {

	private Especulavel recebeOResultado;

	public Torcedor(Especulavel recebeOResultado) {
		this.recebeOResultado = recebeOResultado;
	}

	public Especulavel obterSuaParteEspeculavel() {
		return recebeOResultado;
	}

}
