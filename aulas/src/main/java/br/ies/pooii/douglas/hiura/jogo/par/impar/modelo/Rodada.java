package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo;

import java.util.LinkedList;
import java.util.List;

public class Rodada {

	private List<Especulavel> espectadores;
	private Aposta apostaUm;

	public Rodada() {
		espectadores = new LinkedList<Especulavel>();
	}

	public void querAssistir(Torcedor torcedor) {
		espectadores.add(torcedor.obterSuaParteEspeculavel());
	}

	public void querInscreverSe(Jogador jogador) {
		espectadores.add(jogador.obterSuaParteEspeculavel());
	}

	public void aposta(Aposta aposta) {
		if (apostaUm == null) {
			apostaUm = aposta;
		} else {
			ResultadoDoJogo resultado = calcular(apostaUm, aposta);
			avisarOEspeculadores(resultado);
		}
	}

	private void avisarOEspeculadores(ResultadoDoJogo resultado) {
		for (Especulavel especulavel : espectadores) {
			especulavel.obterOResultado(resultado);
		}
	}

	private ResultadoDoJogo calcular(Aposta apostaUm, Aposta apostaDois) {
		Integer soma = apostaUm.obterValor() + apostaDois.obterValor();
		Boolean ehPar = soma % 2 == 0;
		Aposta vencedora = apostaDois;
		if (ehPar && TiposDeAposta.PAR.equals(apostaUm.obterTipo())) {
			vencedora = apostaUm;
		}
		return new ResultadoDoJogo(soma, vencedora.obterJogador(), vencedora.obterTipo());
	}

}
