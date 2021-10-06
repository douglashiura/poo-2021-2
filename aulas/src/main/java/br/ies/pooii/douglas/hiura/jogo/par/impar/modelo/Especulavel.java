package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo;

public interface Especulavel {

	Especulavel SEM_INTERESSE = new Especulavel() {

		@Override
		public void obterOResultado(ResultadoDoJogo resultado) {
			// TODO Auto-generated method stub
			
		}
	};

	void obterOResultado(ResultadoDoJogo resultado);

}
