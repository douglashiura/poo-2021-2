package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo;

import java.util.LinkedList;
import java.util.List;

import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.entidade.Rodada;

public class RodadaDoJogo {

	private List<Especulavel> espectadores;
	private EstrategiaDeAposta estadoDoJogo;
	private Rodada rodada;

	public RodadaDoJogo() {
		rodada = new Rodada("Rodada anonima");
		espectadores = new LinkedList<Especulavel>();
		estadoDoJogo = new EstrategiaDaPrimeiraJogada(this);
	}

	public void querAssistir(Torcedor torcedor) {
		rodada.getTorcedores().add(torcedor.comoPessoa());
		espectadores.add(torcedor.obterSuaParteEspeculavel());
	}

	public void querInscreverSe(Jogador jogador) {
		rodada.getJogadores().add(jogador.comoPessoa());
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

	public Rodada comoUmaEntidade() {
		return rodada;
	}

}
