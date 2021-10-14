package br.com.gustavo.shell.modelo;

import oshi.hardware.GraphicsCard;

public class PlacaGrafica extends ComponentesDoComputador {
	
	private GraphicsCard placaGrafica = super.getPlacaGrafica().get(0);
	
	public String getNome() {
		return placaGrafica.getName();
	}
	
	public String getMemoriaRam() {
		return new FormataMemoria().formataValor(placaGrafica.getVRam());
	}
	
	public String getFornecedor() {
		return placaGrafica.getVendor();
	}
	
}
