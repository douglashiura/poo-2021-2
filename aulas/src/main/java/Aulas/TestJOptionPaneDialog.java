package Aulas;
import java.awt.BorderLayout;

import javax.swing.*;

public class TestJOptionPaneDialog {
	public static void main(String[] args) {
		JFrame frame = new JFrame("JFrame de Jnela");
		final JLabel label = new JLabel("Jnela é isso!");
		frame.getContentPane().add(label, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

		Object[] options = {"Sim!", "Não", "Quem sabe?"};
		int n = JOptionPane.showOptionDialog(frame, "Tem certeza?", "Confirmação",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				options,
				options[2]);

		System.out.println(n);
	}
}
