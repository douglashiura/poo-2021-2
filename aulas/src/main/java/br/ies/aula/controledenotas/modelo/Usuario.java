package br.ies.aula.controledenotas.modelo;

import java.util.List;

public class Usuario {
	private Integer id;
	private String nome;
	private String senha;
	private String matricula;
	private Integer tipo;
	
	public Usuario() {
	}

	public Usuario(String nome, String senha, String matricula, Integer tipo) {
		this.nome = nome;
		this.senha = senha;
		this.matricula = matricula;
		this.tipo = tipo;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
}
