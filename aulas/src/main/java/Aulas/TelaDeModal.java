package Aulas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaDeModal extends JFrame implements ActionListener{
public TelaDeModal() {
		super("HelloWorld");
		JFrame janela = new JFrame("HelloWorldSwig");
		final JLabel label = new JLabel("Hello World");
		JButton botao = new JButton("Clique aqui");
		botao.addActionListener(this);
		janela.getContentPane() .add(label);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.pack();
		janela.setVisible(true);
}
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Apertou");
		};
	
	}
		
