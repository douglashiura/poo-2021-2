package aula;

import javax.swing.JFrame;

	public class Exercicio17 extends JFrame {

		public Exercicio17() {
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
			
			JLabel label2 = new JLabel("panel two", SwingConstants.CENTER);
			JPanel panel2 = new JPanel();
			panel2.setBackground(Color.YELLOW);
			panel2.add(label2);
			tabbedPane.addTab("Emprego", null, panel2, "Segundo Panel");

			JLabel label3 = new JLabel("panel three");
			JPanel panel3 = new JPanel();
			panel3.setBackground(Color.BLUE);
			panel3.setLayout(new BorderLayout());
			panel3.add(new JButton("Alterar Dados Pessoais"), BorderLayout.NORTH);
			panel3.add(label3, BorderLayout.CENTER);
			tabbedPane.addTab("Relatório", null, panel3, "Terceiro Panel");
			add(tabbedPane);
		}
		public static void main(String args[]) {
			Exercicio17 tabbedPaneFrame = new Exercicio17();
			tabbedPaneFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			tabbedPaneFrame.setSize(300, 250);
			tabbedPaneFrame.setVisible(true);
		}
	}