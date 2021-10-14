package br.com.gustavo.shell.modelo;

import java.util.Properties;

import oshi.SystemInfo;
import oshi.software.os.OperatingSystem;

public abstract class Software {
	
	private OperatingSystem sistemaOperacional = new SystemInfo().getOperatingSystem();
	private Properties propriedades = System.getProperties();
	
	public OperatingSystem getSistemaOperacional() {
		return sistemaOperacional;
	}

	public Properties getPropriedades() {
		return propriedades;
	}
	
	
}
