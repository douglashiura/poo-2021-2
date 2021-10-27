package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo;

import java.util.LinkedList;
import java.util.List;

import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.entidade.Rodada;

public class RodadaDoJogo {

	private List<Especulavel> espectadores;
	private EstrategiaDeAposta estadoDoJogo;
	private Rodada rodada;
	private List<Aposta> apostas;

	public RodadaDoJogo() {
		apostas = new LinkedList<Aposta>();
		rodada = new Rodada("Rodada anonima");
		espectadores = new LinkedList<Especulavel>();
		estadoDoJogo = new EstrategiaDaPrimeiraJogadaInserindoOsParticipantesNoBanco(this);
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
		apostas.add(aposta);
		estadoDoJogo.recebeApostas(apostas);
		if (ehPenultimaAposta()) {
			estadoDoJogo = new EstrategiaDaUltimaJogada(this);
		}
	}

	private boolean ehPenultimaAposta() {
		return apostas.size() == rodada.getJogadores().size() - 1;
	}

	public void avisarOEspeculadores(ResultadoDoJogo resultado) {
		for (Especulavel especulavel : espectadores) {
			especulavel.obtemOResultado(resultado);
		}
	}

	public Rodada comoUmaEntidade() {
		return rodada;
	}

	public void jaInserirOsJogadoresEARodadaNoBanco() {
		estadoDoJogo = new EstrategiaQueNaoInsereMaisOJogadoresNoBanco();
	}

}
