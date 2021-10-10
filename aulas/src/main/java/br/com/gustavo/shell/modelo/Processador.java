package br.com.gustavo.shell.modelo;

import oshi.hardware.CentralProcessor;
import oshi.hardware.CentralProcessor.ProcessorIdentifier;

public class Processador extends Computador implements Formatavel {
	
	private CentralProcessor processador = super.getHardware().getProcessor();
	private ProcessorIdentifier informacoesDeFabrica = processador.getProcessorIdentifier();
	
	private double calculoParaGigaBytes(Object valor) {
		return (Double) valor / 1000000000.0;
	}
	
	@Override
	public String formataValor(Object valor) {
		Double gigaBytes = calculoParaGigaBytes(valor);
		String valorFormatado = gigaBytes.toString() + "GB";
		return valorFormatado;
	}

	public String getFornecedor() {
		return informacoesDeFabrica.getVendor();
	}
	
	public String getNome() {
		return informacoesDeFabrica.getName();
	}
	
	public String getId() {
		return informacoesDeFabrica.getProcessorID();
	}
	
	public String getIdentificador() {
		return informacoesDeFabrica.getIdentifier();
	}
	
	public String getMicroarquitetura() {
		return informacoesDeFabrica.getMicroarchitecture();
	}
	
	public String getFrequenciaEmGigaHertz() {
		return formataValor(informacoesDeFabrica.getVendorFreq());
	}

	

}
