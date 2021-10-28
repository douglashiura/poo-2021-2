package teste.aula01;
import javax.swing.JOptionPane;

import org.junit.Test;

public class TestJOptionPane {

	@Test
	public void testNameInput() throws Exception {
		JOptionPane.showInputDialog("Digite seu nome:");
	}
}
