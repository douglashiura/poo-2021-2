package testeJOptionPane;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class ClassWindow {

	public static void main(String[] args) {
	
		JFrame frame= new JFrame("Janela");
		Janela janela = new Janela();
		frame.setSize(600, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addWindowListener(janela);
			
			
	}
	
}
