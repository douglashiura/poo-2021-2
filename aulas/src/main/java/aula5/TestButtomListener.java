package aula5;

import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TestButtomListener {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Window Listener");
		JButton buttom = new JButton("Clique aqui!");
		frame.setSize(200,300);
		buttom.addActionListener(null);
		frame.getContentPane().add(buttom);
		
		frame.setVisible(true);
	}
	
	public void mouseClicked(MouseEvent e) {
		System.out.print("\nClicou");
	}
}
