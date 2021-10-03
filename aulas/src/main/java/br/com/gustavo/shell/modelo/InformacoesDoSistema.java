package br.com.gustavo.shell.modelo;


import oshi.SystemInfo;
import oshi.hardware.Baseboard;
import oshi.hardware.GraphicsCard;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

public abstract class InformacoesDoSistema {
	
	private SystemInfo informacoesSistema = new SystemInfo();
	private HardwareAbstractionLayer hardware = informacoesSistema.getHardware();
	private OperatingSystem sistemaOperacional = informacoesSistema.getOperatingSystem();
	private GraphicsCard placaGrafica = hardware.getGraphicsCards().get(0);
	private Baseboard placaMae = hardware.getComputerSystem().getBaseboard();

	
	public HardwareAbstractionLayer getHardware() {
		return hardware;
	}
	
	public OperatingSystem getSistemaOperacional() {
		return sistemaOperacional;
	}
	
	public GraphicsCard getPlacaGrafica() {
		return placaGrafica;
	}

	public Baseboard getPlacaMae() {
		return placaMae;
	}
		
}
