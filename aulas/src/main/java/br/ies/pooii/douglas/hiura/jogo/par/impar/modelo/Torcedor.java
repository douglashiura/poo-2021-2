package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo;

public class Torcedor {

	private Especulavel recebeOResultado;

	public Torcedor(Especulavel recebeOResultado) {
		this.recebeOResultado = recebeOResultado;
	}

	public Especulavel obterSuaParteEspeculavel() {
		return recebeOResultado;
	}

}
