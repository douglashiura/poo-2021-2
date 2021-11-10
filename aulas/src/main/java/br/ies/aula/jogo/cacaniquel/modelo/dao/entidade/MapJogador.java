package br.ies.aula.jogo.cacaniquel.modelo.dao.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "jogador")
public class MapJogador {
	
	@Id
	private Integer id;
	@Column(nullable = true)
	private String nome;
	
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
