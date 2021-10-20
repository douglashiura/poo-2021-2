package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.entidade;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Rodada {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToMany()
	private List<Pessoa> jogadores;
	@ManyToMany()
	private List<Pessoa> torcedores;

	public Rodada() {
		jogadores = new LinkedList<Pessoa>();
		torcedores = new LinkedList<Pessoa>();
	}

	public List<Pessoa> getJogadores() {
		return jogadores;
	}

	public List<Pessoa> getTorcedores() {
		return torcedores;
	}

	public Integer getId() {
		return id;
	}
}
