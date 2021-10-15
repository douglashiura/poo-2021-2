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
	@Column(nullable = true)
	private Integer reembolso;
	@Column(nullable = true)
	private Integer premio;
	@Column(nullable = true)
	private Integer dinheiro;
	
	
	public Integer getDinheiro() {
		return dinheiro;
	}
	public void setDinheiro(Integer dinheiro) {
		this.dinheiro = dinheiro;
	}
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
	public Integer getReembolso() {
		return reembolso;
	}
	public void setReembolso(Integer reembolso) {
		this.reembolso = reembolso;
	}
	public Integer getPremio() {
		return premio;
	}
	public void setPremio(Integer premio) {
		this.premio = premio;
	}
	

}
