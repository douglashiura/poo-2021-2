package br.ies.aula.controledenotas.modelo;

public class EntidadeAluno {
	
	private Long id;
	private String nome;
	private String senha;
	private String matricula;
	
	public EntidadeAluno() {
	}

	public EntidadeAluno(String nome, String senha, String matricula) {
		super();
		this.nome = nome;
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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
