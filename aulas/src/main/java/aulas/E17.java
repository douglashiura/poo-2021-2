package aulas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class E17 extends JFrame {
	public E17() {
		super("JTabbedPane Demo");
		JTabbedPane tabbedPane = new JTabbedPane();
		
		JLabel labelNome = new JLabel("Nome:", SwingConstants.CENTER);
		JTextField textFieldNome = new JTextField();
		JLabel labelEndereco = new JLabel("Endereço:", SwingConstants.CENTER);
		JTextField textFieldEndereco = new JTextField();
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.GREEN);
		panel1.add(labelNome);
		panel1.add(textFieldNome);
		panel1.add(labelEndereco);
		panel1.add(textFieldEndereco);
		tabbedPane.addTab("Dados Pessoais", null, panel1, "Primeiro Panel");
		panel1.setLayout(new GridLayout(8, 2));
		
		JLabel labelEmpresa = new JLabel("Empresa:", SwingConstants.CENTER);
		JTextField textFieldEmpresa = new JTextField();
		JLabel labelFuncao = new JLabel("Função:", SwingConstants.CENTER);
		JTextField textFieldFuncao = new JTextField();
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.YELLOW);
		panel2.add(labelEmpresa);
		panel2.add(textFieldEmpresa);
		panel2.add(labelFuncao);
		panel2.add(textFieldFuncao);
		tabbedPane.addTab("Emprego", null, panel2, "Segundo Panel");
		panel2.setLayout(new GridLayout(8, 2));

		JLabel label3 = new JLabel("");
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.BLUE);
		panel3.setLayout(new BorderLayout());
		panel3.add(new JButton("Alterar Dados Pessoais"), BorderLayout.NORTH);
		panel3.add(new JButton("Alterar Dados de Emprego"), BorderLayout.NORTH);
		panel3.add(new JButton("Gerar Relatório"), BorderLayout.NORTH);
		panel3.add(label3, BorderLayout.CENTER);
		tabbedPane.addTab("Relatório", null, panel3, "Terceiro Panel");
		panel3.setLayout(new GridLayout(8, 2));
		add(tabbedPane);
	}

	public static void main(String args[]) {
		E17 tabbedPaneFrame = new E17();
		tabbedPaneFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tabbedPaneFrame.setSize(300, 250);
		tabbedPaneFrame.setVisible(true);
		tabbedPaneFrame.setResizable(false);
	}
}