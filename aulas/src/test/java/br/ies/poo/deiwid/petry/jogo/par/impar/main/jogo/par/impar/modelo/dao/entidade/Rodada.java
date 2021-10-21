package br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar.modelo.dao.entidade;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Rodada {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToMany()
	@JoinTable(name = "JogadoresDaRodada")
	private List<Pessoa> jogadores;
	@ManyToMany()
	@JoinTable(name = "TorcedoresDaRodada")
	private List<Pessoa> torcedores;
	private String nome;

	public Rodada(String nome) {
		this();
		this.nome = nome;
	}
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

	public String getNome() {
		return nome;
	}
}
