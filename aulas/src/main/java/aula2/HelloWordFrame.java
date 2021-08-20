package aula2;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class HelloWordFrame extends JFrame {
	public HelloWordFrame() {
		super("HelloWordFrame");
		final JLabel label = new JLabel("Hello Word");
		getContentPane().add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		HelloWordFrame frame = new HelloWordFrame();
	}

}