package br.com.gustavo.shell.modelo;

import java.util.Properties;
import oshi.software.os.OperatingSystem;

public class SistemaOperacional extends InformacoesDoSistema {
	
	private OperatingSystem sistemaOperacional = super.getSistemaOperacional();
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

