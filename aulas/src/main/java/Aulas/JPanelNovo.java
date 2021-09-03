package Aulas;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelNovo {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		
		JLabel nome = new JLabel("Matheus Alborghetti");
		JLabel ocupacao = new JLabel("Quase DBA");
		JLabel faculdade = new JLabel("IES");
		GridLayout gridLayout1 = new GridLayout(2, 2);
		FlowLayout flowlayout1 = new FlowLayout(1, 2, 1);
		
		frame.setSize(500,500);
		frame.getContentPane().setLayout(gridLayout1);
		frame.getContentPane().add(panel1);
		frame.getContentPane().add(panel2);
		panel1.setBackground(Color.gray);
		panel1.add(nome);
		panel1.setBorder(BorderFactory.createLineBorder(Color.red));		
		panel2.setLayout(flowlayout1);
		panel2.setBackground(Color.cyan);
		panel2.add(panel3);
		panel2.add(panel4);
		panel2.setBorder(BorderFactory.createLineBorder(Color.red));
		panel3.setBackground(Color.cyan);
		panel3.add(ocupacao);
		panel4.setBackground(Color.yellow);
		panel4.add(faculdade);
		frame.setVisible(true);
	}
}