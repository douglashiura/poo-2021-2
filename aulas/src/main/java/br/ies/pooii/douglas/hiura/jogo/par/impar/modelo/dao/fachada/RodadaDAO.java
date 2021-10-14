package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.fachada;

import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.entidade.Rodada;

public interface RodadaDAO {

	void inserir(Rodada rodada);

	Rodada encontar(Integer id);
}
