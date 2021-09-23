package tiposJOptionPane;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShowOptionDialog {

	public static void main(String[] args) {
		// exibe uma janela com opcoes de escolha;
		// tem como retorno, o índice da opcao selecionada;
		// oferece quantos botoes voce quiser;
			
		JFrame frame = new JFrame("Titulo da janela aqui");
		frame.setVisible(true);
			
		Object[] opcoes = {"10", "20","30", "40"}; // objetos criados para utilizar como opcao de botao, ao invés de usar os padrões;
			
		// argumentos: (componente onde será exibido/ conteudo da caixa/ titulo da caixa/ tipo de opcao de botao/ aparencia da caixa/ icone/ conteudo do objeto se torna botão para selecionar/ valor inicial do objeto)
		// aparencias mais usadas: ERROR_MESSAGE, INFORMATION_MESSAGE, WARNING_MESSAGE, QUESTION_MESSAGE, PLAIN_MESSAGE;
		// tipos de opcao de botão mais usados: DEFAULT_OPTION, YES_NO_OPTION, YES_NO_CANCEL_OPTION, OK_CANCEL_OPTION;

		JOptionPane.showOptionDialog(frame, "Escolha um número", "Titulo do modal", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

	}
}
