package br.com.jswing.aulas;

import java.awt.FlowLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Aula5WindowListener {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("Events");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent arg0) {
				System.out.println("Abrindo Janela");
				
			}
			
			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.out.println("Fechando a Janela");
				
			}
			
			@Override
			public void windowClosed(WindowEvent arg0) {
				System.out.println("Janela Fechada");
				
			}
			
			@Override
			public void windowActivated(WindowEvent arg0) {
				System.out.println("Janela Ativa");
				
			}
		});
	}

}
