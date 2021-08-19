package Aulas;
import javax.swing.*;

public class HelloWorldSwing {
	public static void main(String[] args) {
		JFrame frame = new JFrame("JNela é isso!");
		final JLabel label = new JLabel("Hello World");
		frame.getContentPane() .add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		//frame.pack();
		frame.setVisible(true);
		}
	}