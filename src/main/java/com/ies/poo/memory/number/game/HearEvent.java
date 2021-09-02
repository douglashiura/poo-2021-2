package com.ies.poo.memory.number.game;

import java.awt.event.MouseEvent;
import java.util.EventListener;


public interface HearEvent extends EventListener {

	public void mouseEntered(MouseEvent me);
	
	public void mouseExited(MouseEvent me);
}
