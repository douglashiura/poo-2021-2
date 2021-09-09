package projeto;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;

public class Tabuleiro {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Campo Minado");
		GridLayout gridLayout = new GridLayout(5, 3);
		frame.setSize(400,400);
		frame.getContentPane().setLayout(gridLayout);
		for (int i=0; i <  20; i++) {
			Bloco panel = new Bloco();
			frame.getContentPane().add(panel);
			
		}
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setOpacity(1);
		frame.setVisible(true);
	}
}
