package br.ies.aula.jogo.cacaniquel.modelo.dao.fachada;


import br.ies.aula.jogo.cacaniquel.modelo.dao.entidade.MapJogador;

public interface JogadorDAO {
	
	
	void inserirJogador(MapJogador mapJogador);

	MapJogador buscarNoBanco(MapJogador mapJogador);


}
