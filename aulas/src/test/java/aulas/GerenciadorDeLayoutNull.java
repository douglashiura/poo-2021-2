package aulas;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GerenciadorDeLayoutNull extends JButton {

	public static void main(String arg[]) {

		JFrame janela = new JFrame();
		JPanel panel = new JPanel();

		janela.setSize(400, 200);
		janela.setTitle("Layout Null");
		janela.setVisible(true);

		JLabel coracao = new JLabel("<3");
		JLabel topo = new JLabel("___");
		JLabel cabeca = new JLabel("{-.-}");
		JLabel corpo = new JLabel("l)_(l");
		JLabel pes = new JLabel("-:- :-");
		JLabel nome = new JLabel("Anatan");

		topo.setBounds(180, -1, 50, 80);
		cabeca.setBounds(180, 10, 50, 80);
		corpo.setBounds(180, 21, 50, 80);
		pes.setBounds(180, 30, 50, 80);

		JButton btn = new JButton("OK");
		btn.setBounds(180, 76, 50, 80);
		btn.setSize(23, 20);
		btn.setVisible(true);

		panel.setBounds(50, 60, 40, 50);
		panel.setBorder(BorderFactory.createLineBorder(Color.black));
		panel.add(nome);

		janela.getContentPane().setLayout(null);
		janela.getContentPane().add(topo);
		janela.getContentPane().add(cabeca);
		janela.getContentPane().add(corpo);
		janela.getContentPane().add(pes);
		janela.getContentPane().add(btn);
		janela.getContentPane().add(panel);

	}

}
