package aula2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Object[] options = { "Sim!", "Não", "Quem sabe?" };
		JFrame frame = new JFrame("Hello Word");
		JButton button = new JButton("Clique aqui, para abrir o modal");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showOptionDialog(frame, "Tem certeza?", "Confirmação",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
				frame.setTitle(options[n].toString());

			}
		});
		frame.getContentPane().add(button);
		frame.setSize(600, 600);
		frame.setVisible(true);
	}
}
