package Aulas;
import java.awt.Label;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestJOptionPaneDialog {
	public static void main(String[] args) {
		Object[] options = {"Sim!", "N�o", "Quem sabe?"};
		JFrame frame = new JFrame("Hello Word");
		int n = JOptionPane.showOptionDialog(
				frame, "Tem certeza?",
				"Confirma��o",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				options,
				options[2]
		);
		frame.getContentPane().add(new Label(options[n].toString()));
		frame.pack();
		frame.setVisible(true);
	}
}
