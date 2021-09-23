package tiposJOptionPane;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShowInputDialog {
	
	public static void main(String[] args) {
		// exibe uma janela de input;
		// tem como retorno, uma String;
		// oferece botao ok, cancel;
	
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		// argumentos: (componente onde será exibido/ conteudo da caixa/ titulo da caixa/ aparencia da caixa);
		JOptionPane.showInputDialog(frame, "Qual seu telefone?" , null, JOptionPane.QUESTION_MESSAGE);
	
	}
}
