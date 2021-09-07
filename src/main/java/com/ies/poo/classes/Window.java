package com.ies.poo.classes;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Window implements WindowListener {
	private JFrame frame;
	
	public Window(JFrame frame) {
		this.frame = frame;
	}
	public void windowActivated(WindowEvent arg0) {  
	    System.out.println("activated");  
	}  
	public void windowClosed(WindowEvent arg0) {  
	    System.out.println("closed");  
	}  
	public void windowClosing(WindowEvent arg0) {  
	    System.out.println("closing");
	    frame.dispose();
	}  
	public void windowDeactivated(WindowEvent arg0) {  
	    System.out.println("deactivated");  
	}  
	public void windowDeiconified(WindowEvent arg0) {  
	    System.out.println("deiconified");  
	}  
	public void windowIconified(WindowEvent arg0) {  
	    System.out.println("iconified");  
	}  
	public void windowOpened(WindowEvent arg0) {  
	    System.out.println("opened");  
	}  
}
