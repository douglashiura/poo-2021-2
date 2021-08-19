package teste.aula01;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestJFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame("TESTE DE FRAME");
		JLabel label = new JLabel("JANELA ABERTA");
		frame.setSize(400, 300);
		frame.getContentPane().add(label, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
