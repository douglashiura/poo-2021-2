package br.com.gustavo.shell.modelo;

import oshi.hardware.GraphicsCard;

public class PlacaGrafica extends Computador implements Formatavel {
	
	private GraphicsCard placaGrafica = super.getHardware().getGraphicsCards().get(0);
	
	@Override
	public String formataValor(Object valor) {
		Long gigaBytes = (Long) valor / 1000000000;
		String valorFormatado = gigaBytes.toString() + "GB";
		return valorFormatado;
	}
	
	public String getNome() {
		return placaGrafica.getName();
	}
	
	public String getMemoriaRam() {
		return formataValor(placaGrafica.getVRam());
	}
	
	public String getFornecedor() {
		return placaGrafica.getVendor();
	}
	
	public static void main(String[] args) {
		PlacaGrafica gpu = new PlacaGrafica();
				
		System.out.println(gpu.getNome());
		System.out.println(gpu.getMemoriaRam());

		
	}

	
}
