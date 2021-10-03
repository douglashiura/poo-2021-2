package br.com.gustavo.shell.modelo;

import oshi.hardware.Baseboard;

public class PlacaMae extends InformacoesDoSistema {
	
	private Baseboard placaMae = super.getPlacaMae();
	
	public String getFabricante() {
		return placaMae.getManufacturer();
	}
	
	public String getVersao() {
		return placaMae.getSerialNumber();
	}

}
