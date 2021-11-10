package br.ies.aula.controledenotas.modelo;

public class RegistroNota {
	private Long id;
	private Usuario usuario;
	private Float notaUm;
	private Float notaUmRecuperacao;
	private Float notaDois;
	private Float notaDoisRecuperacao;
	private Double media;
	private String matricula;
	private Integer ano;
	private Integer materia;
	
	public RegistroNota() {
	}
	
	public RegistroNota(Usuario usuario) {
		this.usuario = usuario;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getAluno() {
		return usuario;
	}

	public void setAluno(Usuario usuario) {
		this.usuario = usuario;
	}

	public Float getNotaUm() {
		return notaUm;
	}

	public void setNotaUm(Float notaUm) {
		this.notaUm = notaUm;
	}

	public Float getNotaUmRecuperacao() {
		return notaUmRecuperacao;
	}

	public void setNotaUmRecuperacao(Float notaUmRecuperacao) {
		this.notaUmRecuperacao = notaUmRecuperacao;
	}

	public Float getNotaDois() {
		return notaDois;
	}

	public void setNotaDois(Float notaDois) {
		this.notaDois = notaDois;
	}

	public Float getNotaDoisRecuperacao() {
		return notaDoisRecuperacao;
	}

	public void setNotaDoisRecuperacao(Float notaDoisRecuperacao) {
		this.notaDoisRecuperacao = notaDoisRecuperacao;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getMateria() {
		return materia;
	}

	public void setMateria(Integer materia) {
		this.materia = materia;
	}


}
