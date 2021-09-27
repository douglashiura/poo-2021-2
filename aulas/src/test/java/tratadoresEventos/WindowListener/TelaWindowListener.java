package tratadoresEventos.WindowListener;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaWindowListener extends JFrame {
	
	public TelaWindowListener() {
		setVisible(true);
		setSize(500, 600);
		getContentPane().setBackground(Color.black);
		addWindowListener(new TratadorEventoWindowAdapter());
	}
}

	









