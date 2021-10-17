package br.ies.aula.jogo.cacaniquel.modelo.dao.fachada;


import br.ies.aula.jogo.cacaniquel.modelo.Jogador;
import br.ies.aula.jogo.cacaniquel.modelo.dao.entidade.MapJogador;

public interface JogadorDAO {
	
	

	MapJogador buscarJogadorNoBanco(Jogador jogador);

	void enviarJogadorAoBanco(Jogador jogador);

	public MapJogador converterJogadorToMapJogador(Jogador jogador);
	
	String cadastrarJogador(Jogador jogador);

	
}
