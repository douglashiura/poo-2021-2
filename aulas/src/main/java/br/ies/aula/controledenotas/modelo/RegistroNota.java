package br.ies.aula.controledenotas.modelo;

public class RegistroNota {
	private Long id;
	private Usuario aluno;
	
	public RegistroNota() {
	}
	
	public RegistroNota(Usuario aluno) {
		this.aluno = aluno;
	}

	public RegistroNota(br.ies.aula.controledenotas.Aluno alunoAtual) {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getAluno() {
		return aluno;
	}

	public void setAluno(Usuario aluno) {
		this.aluno = aluno;
	}

}
