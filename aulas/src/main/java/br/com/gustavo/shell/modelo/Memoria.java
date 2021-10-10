package br.com.gustavo.shell.modelo;

import oshi.hardware.GlobalMemory;
import oshi.hardware.VirtualMemory;

public class Memoria extends Computador implements Formatavel {
	
	private GlobalMemory memoria = super.getHardware().getMemory();
	private VirtualMemory memoriaVirtual = memoria.getVirtualMemory();
	
	private long calculoParaGigaBytes(Object valor) {
		return (Long) valor / 1000000000;
	}
	
	@Override
	public String formataValor(Object valor) {
		Long gigaBytes = calculoParaGigaBytes(valor);
		String valorFormatado = gigaBytes.toString() + "GB";
		return valorFormatado;
	}

	
	
	public String getMemoriaTotal() {
		return formataValor(memoria.getTotal());
	}
	
	public String getMemoriaFisicaDisponivelEmGigas() {
		return formataValor(memoria.getAvailable());
	}
	
	public String getMemoriaVirtualTotal() {
		return formataValor(memoriaVirtual.getSwapTotal());
	}
	
	public String getMemoriaVirtualMaxima() {
		return formataValor(memoriaVirtual.getVirtualMax());
	}
	
	public String getMemoriaVirtualUsada() {
		return formataValor(memoriaVirtual.getSwapUsed());
	}
	
}
