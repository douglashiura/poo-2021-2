package aulas;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Conteiner {

	public static void main(String arg[]) {
		JFrame janela = new JFrame();

		janela.setSize(300, 200);
		janela.setVisible(true);
		janela.setTitle("Conteiner");

		JLabel um = new JLabel("1");
		JLabel dois = new JLabel("2");
		JLabel tres = new JLabel("3");
		JLabel quatro = new JLabel("4");
		JLabel cinco = new JLabel("5");

		janela.getContentPane().setLayout(new FlowLayout()); // se o layout for nulo(null), pode setar as dimenções do label, label.setlocation e size

		janela.getContentPane().add(um);
		janela.getContentPane().add(dois);
		janela.getContentPane().add(tres);
		janela.getContentPane().add(quatro);
		janela.getContentPane().add(cinco);
		
		//escolher um gerenciador de laouyt https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html
		// pode ser o null

	}
}
