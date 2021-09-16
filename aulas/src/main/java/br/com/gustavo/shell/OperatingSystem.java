package br.com.gustavo.shell;
import java.util.Properties;


public class OperatingSystem {
	
	private Properties properties;
	
	public OperatingSystem() {
		this.properties = System.getProperties();
	}

	public String getOSName()
	{
	    return this.properties.getProperty("os.name");
	}
	
	public String getOSDistribuition()
	{
	    return this.properties.getProperty("java.vendor");
	}
	
	public String getOSGraphicInterface()
	{
	    return this.properties.getProperty("sun.desktop").replace("g", "G");
	}
	
	public String getKernelVersion()
	{
	    return this.properties.getProperty("os.version");
	}
	
	public String getOSArchitecture()
	{
	    return this.properties.getProperty("os.arch");
	}
	
	public String getOSCpu()
	{
	    return this.properties.getProperty("sun.cpu");
	}	
}

