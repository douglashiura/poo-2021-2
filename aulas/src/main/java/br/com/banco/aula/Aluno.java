package br.com.banco.aula;

public class Aluno {
	
	private Integer id;
	private String nome;
	private String curso;
	
	public Aluno(Integer id, String nome, String curso) {
		this.id = id;
		this.nome = nome;
		this.curso = curso;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
