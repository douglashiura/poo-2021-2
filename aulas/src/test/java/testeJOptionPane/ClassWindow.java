package testeJOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ClassWindow{

	public static void main(String[] args) {
	
		JFrame frame= new JFrame("Janela");
		Janela janela = new Janela();
		JButton botao = new JButton("Click");
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("CLICOU");
				
			}
		});

		frame.getContentPane().add(botao);
		frame.setSize(600, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addWindowListener(janela);
		frame.add(botao);
			
	}
	
}
