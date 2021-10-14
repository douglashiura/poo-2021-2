package br.com.gustavo.shell.modelo;

import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;

public abstract class Hardware {
	
	public HardwareAbstractionLayer getHardware() {
		return new SystemInfo().getHardware();
	}
	
}
