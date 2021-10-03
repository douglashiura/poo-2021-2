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
	
	public String getModelo() {
		return placaMae.getVersion();
	}
	
	public static void main(String[] args) {
		PlacaMae placaMae = new PlacaMae();
		
		
		System.out.println(placaMae.getFabricante());
		System.out.println(placaMae.getVersao());
		System.out.println(placaMae.getModelo());


	}

}
