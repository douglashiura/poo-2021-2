package br.com.gustavo.shell.modelo;

import oshi.hardware.GlobalMemory;
import oshi.hardware.VirtualMemory;

public class Memoria extends InformacoesDoSistema implements Formatavel {
	
	private GlobalMemory memoria = super.getHardware().getMemory();
	private VirtualMemory memoriaVirtual = memoria.getVirtualMemory();
	
	@Override
	public String formataValor(Object valor) {
		Long gigaBytes = (Long) valor / 1000000000;
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
