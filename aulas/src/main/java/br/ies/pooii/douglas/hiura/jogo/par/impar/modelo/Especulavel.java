package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo;

public interface Especulavel {

	Especulavel SEM_INTERESSE = new Especulavel() {

		@Override
		public void obtemOResultado(ResultadoDoJogo resultado) {
		}
	};

	void obtemOResultado(ResultadoDoJogo resultado);

}
