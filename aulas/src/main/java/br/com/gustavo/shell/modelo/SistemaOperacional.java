package br.com.gustavo.shell.modelo;

import java.util.Properties;

import oshi.SystemInfo;
import oshi.software.os.OperatingSystem;

public class SistemaOperacional {
	
	private OperatingSystem sistemaOperacional = new SystemInfo().getOperatingSystem();
	private Properties propriedadesJvm = System.getProperties();
	
	public String getNome()
	{
	    return propriedadesJvm.getProperty("os.name");
	}
	
	public String getFamilia()
	{
	    return sistemaOperacional.getFamily();
	}
	
	public String getFabricante()
	{
	    return sistemaOperacional.getManufacturer();
	}
	
	public Integer getQuantidadeDeThreadsAtivas()
	{
	    return sistemaOperacional.getThreadCount();
	}
	
	public Long getTempoDeInicializacaoDoSistema()
	{
	    return sistemaOperacional.getSystemBootTime();
	}
	
}

