package br.ies.aula.controledenotas.modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import com.sun.jdi.connect.spi.Connection;

import br.ies.aula.controledenotas.Nota;
import br.ies.aula.controledenotas.banco.BancoException;
import br.ies.aula.controledenotas.banco.BancoJdbc;
import br.ies.aula.controledenotas.entidade.EntidadeAluno;

public class Aluno {
	private Long id;
	private String nome;
	private String login;
	private String senha;
	private String matricula;
	private List<Nota> lstNotas;
	
	public Aluno() {
	}

	public Aluno(String nome, String login, String senha, String matricula) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.matricula = matricula;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public  List<Nota> getLstNotas() {
		return lstNotas;
	}

	public void setLstNotas(List<Nota> lstNotas) {
		this.lstNotas = lstNotas;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
