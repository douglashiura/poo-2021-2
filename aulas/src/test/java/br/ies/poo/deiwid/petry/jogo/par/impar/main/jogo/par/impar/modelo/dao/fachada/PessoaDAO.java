package br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar.modelo.dao.fachada;

import java.util.List;

import br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar.modelo.dao.entidade.Pessoa;


public interface PessoaDAO {
	void inserir(Pessoa pessoa);

	void deletar(Pessoa pessoa);

	List<Pessoa> listar();

}
