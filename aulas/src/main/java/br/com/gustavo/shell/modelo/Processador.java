package br.com.gustavo.shell.modelo;

import oshi.hardware.CentralProcessor;
import oshi.hardware.CentralProcessor.ProcessorIdentifier;

public class Processador extends ComponentesDoComputador {
	
	private CentralProcessor processador = super.getProcessador();
	private ProcessorIdentifier informacoesDeFabrica = processador.getProcessorIdentifier();

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
		return new FormataFrequencia().formataValor(informacoesDeFabrica.getVendorFreq());
	}

}
