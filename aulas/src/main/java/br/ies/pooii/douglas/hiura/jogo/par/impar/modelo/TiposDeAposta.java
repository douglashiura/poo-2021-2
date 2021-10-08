package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo;

public enum TiposDeAposta {
	PAR {
		@Override
		Boolean ehPar() {
			return Boolean.TRUE;
		}
	},
	IMPAR {
		@Override
		Boolean ehPar() {
			return Boolean.FALSE;
		}
	};

	abstract Boolean ehPar();
}
