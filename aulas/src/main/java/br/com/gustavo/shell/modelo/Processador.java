package br.com.gustavo.shell.modelo;

import oshi.hardware.CentralProcessor;
import oshi.hardware.CentralProcessor.ProcessorIdentifier;

public class Processador extends InformacoesDoSistema {
	
	private CentralProcessor processador = super.getHardware().getProcessor();
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
	
	public Double getFrequenciaEmGigaHertz() {
		return informacoesDeFabrica.getVendorFreq() / 1000000000.0;
	}
	
}
