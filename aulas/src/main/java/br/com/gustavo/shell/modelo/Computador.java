package br.com.gustavo.shell.modelo;

import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

public abstract class Computador {
	
	private SystemInfo informacoesDoComputador = new SystemInfo();
	private HardwareAbstractionLayer hardware = informacoesDoComputador.getHardware();
	private OperatingSystem sistemaOperacional = informacoesDoComputador.getOperatingSystem();
	
	public HardwareAbstractionLayer getHardware() {
		return hardware;
	}
	
	public OperatingSystem getSistemaOperacional() {
		return sistemaOperacional;
	}
		
}
