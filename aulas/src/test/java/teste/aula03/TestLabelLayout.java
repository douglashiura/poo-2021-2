package teste.aula03;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestLabelLayout {
	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("TESTE DE JComponent");
		JLabel label1 = new JLabel("Menssagem 01");
		JLabel label2 = new JLabel("Menssagem 02");
		JLabel label3 = new JLabel("Menssagem 03");
		JLabel label4 = new JLabel("Menssagem 04");
		JLabel label5 = new JLabel("Menssagem 05");
		
		frame.getContentPane().setLayout(new GridLayout(2, 2));
		
		label1.setLocation(10, 20);
		label1.setSize(200, 300);
		
		label2.setLocation(200, 300);
		label2.setSize(100, 200);
		
		label3.setSize(100, 200);
		
		frame.getContentPane().add(label1);
		frame.getContentPane().add(label2);
		frame.getContentPane().add(label3);
		frame.getContentPane().add(label4);
		frame.getContentPane().add(label5);
		
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		Graphics graphics = frame.getContentPane().getGraphics();
		graphics.drawRect(0, 0, 200, 200);
		graphics.setColor(Color.RED);
		
		for (int i = 0; i < 10000; i++) {
			// label3.setLocation(10, i % 500);
			label3.setLocation(10, i);
			Thread.sleep(10);
		}
	}
}
