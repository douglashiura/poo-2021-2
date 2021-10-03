package br.com.gustavo.shell.modelo;

import oshi.hardware.GlobalMemory;
import oshi.hardware.VirtualMemory;

public class Memoria extends InformacoesDoSistema {
	
	private GlobalMemory memoria = super.getHardware().getMemory();
	private VirtualMemory memoriaVirtual = memoria.getVirtualMemory();
	
	private String formataBytesParaGigaBytes(Long valorEmBytes) {
		Long gigaBytes = valorEmBytes / 1000000000;
		String valorFormatado = gigaBytes.toString() + "GB";
		return valorFormatado;
	}
	
	public String getMemoriaTotal() {
		return formataBytesParaGigaBytes(memoria.getTotal());
	}
	
	public String getMemoriaFisicaDisponivelEmGigas() {
		return formataBytesParaGigaBytes(memoria.getAvailable());
	}
	
	public String getMemoriaVirtualTotal() {
		return formataBytesParaGigaBytes(memoriaVirtual.getSwapTotal());
	}
	
	public String getMemoriaVirtualMaxima() {
		return formataBytesParaGigaBytes(memoriaVirtual.getVirtualMax());
	}
	
	public String getMemoriaVirtualUsada() {
		return formataBytesParaGigaBytes(memoriaVirtual.getSwapUsed());
	}
	
}
