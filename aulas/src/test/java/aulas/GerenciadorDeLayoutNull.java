package aulas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GerenciadorDeLayoutNull extends JButton {

	public static void main(String arg[]) {

		JFrame janela = new JFrame();

		janela.setSize(400, 200);
		janela.setTitle("Layout Null");
		janela.setVisible(true);

		JLabel coracao = new JLabel("<3");
		JLabel topo = new JLabel("___");
		JLabel cabeca = new JLabel("{-.-}");
		JLabel corpo = new JLabel("l)_(l");
		JLabel pes = new JLabel("-:- :-");

		topo.setBounds(180, -1, 50, 80);
		cabeca.setBounds(180, 10, 50, 80);
		corpo.setBounds(180, 21, 50, 80);
		pes.setBounds(180, 30, 50, 80);
		
		JButton btn = new JButton("OK");
		btn.setBounds(180, 76, 50, 80);
		btn.setSize(23,20);
		btn.setVisible(true);

		janela.getContentPane().setLayout(null);
		janela.getContentPane().add(topo);
		janela.getContentPane().add(cabeca);
		janela.getContentPane().add(corpo);
		janela.getContentPane().add(pes);
		janela.getContentPane().add(btn);

	}

}
