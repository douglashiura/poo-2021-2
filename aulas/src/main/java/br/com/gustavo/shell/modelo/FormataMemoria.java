package br.com.gustavo.shell.modelo;

public class FormataMemoria implements Formatavel<Long> {
		
	private long calculoParaGigaBytes(Long valor) {
		return (Long) valor / 1000000000;
	}
	
	@Override
	public String formataValor(Long valor) {
		Long gigaBytes = calculoParaGigaBytes(valor);
		String valorFormatado = gigaBytes.toString() + "GB";
		return valorFormatado;
	}

}
