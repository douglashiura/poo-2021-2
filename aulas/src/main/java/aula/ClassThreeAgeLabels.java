package aula;
import javax.swing.Iterator;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClassThreeAgeLabels {
	
	public static void (String{} args) {
	JFrame frame = new JFrame("Age");
	frame.setSize(600, 600);

	JFrame janela = new JFrame("Titulo da janela aqui");
	JLabel label1 = new JLabel("Mensagem1");
	JLabel label2 = new JLabel("Mensagem2");
	JLabel label3 = new JLabel("Mensagem3");
	JLabel label4 = new JLabel("Mensagem4");
	JLabel label5 = new JLabel("Mensagem5");
	
	frame.getContentPane().add(label1);	
	frame.getContentPane().add(label2);	
	frame.getContentPane().add(label3);
	frame.getContentPane().add(label4);
	frame.getContentPane().add(label5);
	
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 }
}
