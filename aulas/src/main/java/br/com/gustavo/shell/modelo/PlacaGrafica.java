package br.com.gustavo.shell.modelo;

import oshi.hardware.GraphicsCard;

public class PlacaGrafica extends InformacoesDoSistema implements Formatavel {
	
	private GraphicsCard placaGrafica = super.getPlacaGrafica();
	
	@Override
	public String formataValor(Object valor) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getNome() {
		return placaGrafica.getName();
	}
	
	public Long getMemoriaRam() {
		return placaGrafica.getVRam();
	}
	
	public String getFornecedor() {
		return placaGrafica.getVendor();
	}
	
	public static void main(String[] args) {
		PlacaGrafica gpu = new PlacaGrafica();
				
		System.out.println(gpu.getPlacaGrafica().getName());
		System.out.println(gpu.getPlacaGrafica().getVRam());

		
	}

	
}
