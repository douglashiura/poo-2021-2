package teste.aula02;

import javax.swing.*;

public class TestHerancaJFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TestHerancaJFrame() {
		super("Hello Jay");
		final JLabel label = new JLabel("JFrame");
		getContentPane().add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	public static void main (String[] args) {
		new TestHerancaJFrame();
	}
	
}
