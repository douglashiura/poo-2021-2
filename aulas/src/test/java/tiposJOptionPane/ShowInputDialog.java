package tiposJOptionPane;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShowInputDialog {
	
	public static void main(String[] args) {
		// exibe uma janela de input;
		// tem como retorno, uma String ou objeto;
		// oferece botao ok, cancel;
		// é possivel criar objeto com opcoes e o usuário é obrigado a selecionar uma delas ao invés de fazer o usuário digitar;
	
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		Object[] opcoes = {"10", "20","30", "40"};
		// argumentos: (componente onde será exibido/ conteudo da caixa/ titulo da caixa/ aparencia da caixa);
		JOptionPane.showInputDialog(frame, "Mensagem", "Titulo", JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
	}
}
