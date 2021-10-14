package br.com.gustavo.shell.modelo;

import oshi.hardware.GlobalMemory;
import oshi.hardware.VirtualMemory;

public class Memoria extends ComponentesDoComputador {
	
	private GlobalMemory memoria = super.getMemoria();
	private VirtualMemory memoriaVirtual = memoria.getVirtualMemory();
		
	public String getMemoriaTotal() {
		return new FormataMemoria().formataValor(memoria.getTotal());
	}
	
	public String getMemoriaFisicaDisponivelEmGigas() {
		return new FormataMemoria().formataValor(memoria.getAvailable());
	}
	
	public String getMemoriaVirtualTotal() {
		return new FormataMemoria().formataValor(memoriaVirtual.getSwapTotal());
	}
	
	public String getMemoriaVirtualMaxima() {
		return new FormataMemoria().formataValor(memoriaVirtual.getVirtualMax());
	}
	
	public String getMemoriaVirtualUsada() {
		return new FormataMemoria().formataValor(memoriaVirtual.getSwapUsed());
	}

}
