package moduloCinco.eOneSeven;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PaneOneSeven extends JFrame {

	public PaneOneSeven() {

		super("Pane Demo");

		JTabbedPane tabbedPane = new JTabbedPane();

		JLabel label1 = new JLabel("Nome", SwingConstants.CENTER);
		JLabel label1_2 = new JLabel("Endereço", SwingConstants.CENTER);
		JPanel panel1 = new JPanel();
		JTextField text1 = new JTextField(25);
		JTextField text2 = new JTextField(25);
		panel1.setBackground(Color.GREEN);
		panel1.add(label1);
		panel1.add(text1);
		panel1.add(label1_2);
		panel1.add(text2);
		tabbedPane.addTab("Dados Pessoais", null, panel1, "First Panel");

		JLabel label2 = new JLabel("Empresa", SwingConstants.CENTER);
		JLabel label2_2 = new JLabel("Função", SwingConstants.CENTER);
		JPanel panel2 = new JPanel();
		JTextField text1_1 = new JTextField(25);
		JTextField text2_2 = new JTextField(25);
		panel2.setBackground(Color.YELLOW);
		panel2.add(label2);
		panel2.add(text1_1);
		panel2.add(label2_2);
		panel2.add(text2_2);
		tabbedPane.addTab("Emprego", null, panel2, "Second Panel");

		JLabel label3 = new JLabel("Panel  Three");
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.BLUE);
		panel3.add(new JButton("Alterar Dados Pessoais"));
		panel3.add(new JButton("Alterar Dados de Emprego"));
		panel3.add(new JButton("Gerar relatório"));
		tabbedPane.addTab("Relatório", null, panel3, "Third Panel");

		add(tabbedPane);

	}
}
