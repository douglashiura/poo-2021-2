package aulas.bibliotecaswing.exercicios;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class TesteTabbedPanel extends JFrame{
	TabbedPane abas = new TabbedPane();
	
	
	public TesteTabbedPanel() {
		configuracao();
		add(BorderLayout.CENTER, abas);
	}
	
	public void configuracao() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		TesteTabbedPanel frame = new TesteTabbedPanel();
		
		
	}

}
