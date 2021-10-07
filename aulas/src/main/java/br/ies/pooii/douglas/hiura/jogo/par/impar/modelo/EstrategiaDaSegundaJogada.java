package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo;

public class EstrategiaDaSegundaJogada implements EstrategiaDeAposta {
	private Rodada rodada;
	private Aposta daPrimeiraJogada;

	public EstrategiaDaSegundaJogada(Aposta daPrimeiraJogada, Rodada rodada) {
		this.daPrimeiraJogada = daPrimeiraJogada;
		this.rodada = rodada;
	}

	@Override
	public void recebeUmaAposta(Aposta aposta) {
		ResultadoDoJogo resultado = calcular(aposta);
		avisarOEspeculadores(resultado);
	}

	private void avisarOEspeculadores(ResultadoDoJogo resultado) {
		for (Especulavel especulavel : rodada.obterEspectadores()) {
			especulavel.obtemOResultado(resultado);
		}
	}

	private ResultadoDoJogo calcular(Aposta apostaDois) {
		Integer soma = daPrimeiraJogada.obterValor() + apostaDois.obterValor();
		Boolean ehPar = soma % 2 == 0;
		Aposta vencedora = apostaDois;
		if (ehPar && TiposDeAposta.PAR.equals(daPrimeiraJogada.obterTipo())) {
			vencedora = daPrimeiraJogada;
		}
		return new ResultadoDoJogo(soma, vencedora.obterJogador(), vencedora.obterTipo());
	}

	@Override
	public Aposta obterAposta() {
		throw new RuntimeException();
	}

}