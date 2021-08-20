package testeJOptionPane;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.junit.Test;

public class TesteJOptionPane {

	@Test
	public void testeInput() throws Exception {
		JOptionPane.showInputDialog("Teste Deiwid");
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("JFrame de Jnela");
		

		Object[] options = {"Sim!", "Não", "Quem sabe?"};
		int n = JOptionPane.showOptionDialog(frame, "Tem certeza?", "Confirmação",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				options,
				options[2]);

		System.out.println(n);
		final JLabel label = new JLabel(options[n].toString());
		frame.getContentPane().add(label, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	
	
}
