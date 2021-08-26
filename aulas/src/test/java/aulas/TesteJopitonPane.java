package aulas;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TesteJopitonPane {

	public static void main(String arg[]) {


		JPanel panel = new JPanel();
		JLabel label = new JLabel("Qual sua idade");
		panel.add(label);
		panel.add(new JLabel(" "));
		String[] options = new String[] { "10", "20", "30", "40" };
		int option = JOptionPane.showOptionDialog(null, panel, "Escolha", JOptionPane.NO_OPTION,
				JOptionPane.WARNING_MESSAGE, null, options, options[0]);

	}
}