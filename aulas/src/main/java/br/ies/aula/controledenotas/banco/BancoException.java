package br.ies.aula.controledenotas.banco;

public class BancoException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public BancoException(String mensagem) {
		super(mensagem);
	}
	
}
