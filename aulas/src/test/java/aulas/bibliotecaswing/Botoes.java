package aulas.bibliotecaswing;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Botoes {

	public static void main(String[] args) {
		
		Object[] options = {"Sim!", "Não","Quem sabe?"}; 
		JFrame frame = new JFrame("Colocar titulo da janela aqui");
		JLabel label = new JLabel("Conteudo");
		
		frame.pack();
		frame.getContentPane().add(label);
		frame.setVisible(true);
		label.setVisible(true);
		
		int n =JOptionPane.showOptionDialog(frame, "Conteúdo da caixa", "Titulo do popup", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
				options, options[2]);
		System.out.print(n);
		
	}
	
	
	
}
