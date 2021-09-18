package aulas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JanelaDeDados {

	public static void main(String arg[]) {
		JFrame janela = new JFrame();

		janela.setSize(500, 320);
		janela.setVisible(true);
		janela.setTitle("Tabela BD");

		janela.getContentPane().setLayout(null);

		JLabel cBD = new JLabel("Conectar Banco");
		JButton BotaocBD = new JButton("Conectar Banco");
		janela.getContentPane().add(cBD);
		cBD.setBounds(70, 54, 100, 50);

		JPanel painel = new JPanel();
		painel.add(BotaocBD);

		JLabel dBD = new JLabel("Desconectar Banco");
		janela.getContentPane().add(dBD);
		dBD.setBounds(250, 54, 300, 50);

	}
}
