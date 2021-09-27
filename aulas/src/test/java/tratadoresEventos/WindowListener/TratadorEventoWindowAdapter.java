package tratadoresEventos.WindowListener;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

	public class TratadorEventoWindowAdapter extends WindowAdapter{
		// para implementar somente os métodos que você deseja, use: extends WindowAdapter;
		
		// para implementar todos os métodos, use: implements WindowListener;
		
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("Fechando a janela");
		}
		@Override
		public void windowOpened(WindowEvent e) {
			System.out.println("Abriu a janela");
			JOptionPane.showMessageDialog(null, "Programa Iniciado!", null, JOptionPane.INFORMATION_MESSAGE);
		}

}
