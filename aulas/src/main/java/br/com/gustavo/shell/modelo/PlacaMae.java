package br.com.gustavo.shell.modelo;

import oshi.hardware.Baseboard;

public class PlacaMae extends Computador {
	
	private Baseboard placaMae = super.getHardware().getComputerSystem().getBaseboard();
	
	public String getFabricante() {
		return placaMae.getManufacturer();
	}
	
	public String getVersao() {
		return placaMae.getSerialNumber();
	}

}
