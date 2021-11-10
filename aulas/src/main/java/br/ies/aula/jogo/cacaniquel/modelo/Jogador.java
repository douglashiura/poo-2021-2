package br.ies.aula.jogo.cacaniquel.modelo;

public class Jogador {
	
	private Integer id;
	private String nome;
	private Integer reembolso = 0;
	private Integer fichas = 0;
	private Integer dinheiro = 0;
	
	
	public void recebeFichas(Integer fichas) {
		
		this.fichas = fichas;
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
	public void setReembolso(Integer fichas) {
		
		this.reembolso = fichas;
		setFichas(0);
	}
	
	public void setFichas(Integer fichas) {
		
		this.fichas = fichas;
	}
	public Integer getFichas() {
		return fichas;
	}
		
	public Integer getDinheiro() {

		return dinheiro;
	}	
	public void setDinheiro(Integer d) {
		this.dinheiro = d;
	}
}
