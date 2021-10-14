package br.com.gustavo.shell.modelo;

import java.util.List;

import oshi.hardware.Baseboard;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.GraphicsCard;

public abstract class ComponentesDoComputador extends Hardware {
	
	private CentralProcessor processador = super.getHardware().getProcessor();
	private GlobalMemory memoria = super.getHardware().getMemory();
	private List<GraphicsCard> placaGrafica = super.getHardware().getGraphicsCards();
	private Baseboard placaMae = super.getHardware().getComputerSystem().getBaseboard();

	public CentralProcessor getProcessador() {
		return processador;
	}

	public GlobalMemory getMemoria() {
		return memoria;
	}

	public List<GraphicsCard> getPlacaGrafica() {
		return placaGrafica;
	}

	public Baseboard getPlacaMae() {
		return placaMae;
	}
	
}
