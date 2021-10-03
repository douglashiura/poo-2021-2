package br.com.gustavo.shell.modelo;

import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

public class InformacoesDoSistema {
	
	private SystemInfo informacoesSistema = new SystemInfo();
	private HardwareAbstractionLayer hardware = informacoesSistema.getHardware();
	private OperatingSystem sistemaOperacional = informacoesSistema.getOperatingSystem();

	
	public HardwareAbstractionLayer getHardware() {
		return hardware;
	}
	
	public OperatingSystem getSistemaOperacional() {
		return sistemaOperacional;
	}
		
}
