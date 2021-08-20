package teste.aula02;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TestJOptionPaneDialog {
	public static void main(String[] args) {
		Object[] options = {"Sim", "Não", "Quem sabe?"};
		JFrame frame = new JFrame("TESTE DE FRAME");
		JButton button = new JButton("Clique aqui!");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showOptionDialog(frame, "Tem certeza?", "Confirmação",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null,
						options,
						options[2]);
				frame.setTitle(options[n].toString());
			}
		});
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		frame.setVisible(true);
	}
}
