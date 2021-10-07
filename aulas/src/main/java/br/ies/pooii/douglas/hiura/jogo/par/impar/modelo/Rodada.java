package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo;

import java.util.LinkedList;
import java.util.List;

public class Rodada {

	private List<Especulavel> espectadores;
	private EstrategiaDeAposta estadoDoJogo;

	public Rodada() {
		espectadores = new LinkedList<Especulavel>();
		estadoDoJogo = new EstrategiaDaPrimeiraJogada();
	}

	public void querAssistir(Torcedor torcedor) {
		espectadores.add(torcedor.obterSuaParteEspeculavel());
	}

	public void querInscreverSe(Jogador jogador) {
		espectadores.add(jogador.obterSuaParteEspeculavel());
	}

	public void aposta(Aposta aposta) {
		estadoDoJogo.recebeUmaAposta(aposta);
		estadoDoJogo = new EstrategiaDaSegundaJogada(aposta, this);
	}


	public void avisarOEspeculadores(ResultadoDoJogo resultado) {
		for (Especulavel especulavel : espectadores) {
			especulavel.obtemOResultado(resultado);
		}
	}

}
