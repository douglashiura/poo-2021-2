package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo;

import java.util.LinkedList;
import java.util.List;

public class Rodada {

	private List<Especulavel> espectadores;
	private EstrategiaDeAposta estadoDoJogo;

	public Rodada() {
		espectadores = new LinkedList<Especulavel>();
		estadoDoJogo = new EstrategiaDaPrimeiraJogada(this);
	}

	public void querAssistir(Torcedor torcedor) {
		espectadores.add(torcedor.obterSuaParteEspeculavel());
	}

	public void querInscreverSe(Jogador jogador) {
		espectadores.add(jogador.obterSuaParteEspeculavel());
	}

	public void aposta(Aposta aposta) {
		estadoDoJogo.recebeUmaAposta(aposta);
	}

	public List<Especulavel> obterEspectadores() {
		return espectadores;
	}

	public void fiqueAlertaParaReceberASegundaAposta() {
		Aposta apostaDaPrimeiraRodada = estadoDoJogo.obterAposta();
		estadoDoJogo = new EstrategiaDaSegundaJogada(apostaDaPrimeiraRodada, this);
	}

}
