package modulo.seis.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modulo.seis.model.CreateTable;
import modulo.seis.model.DeleteTable;
import modulo.seis.model.InsertTable;
import modulo.seis.model.SelectTable;

public class Janela extends JFrame {

	public static void main(String args[]) {

		JFrame janela = new JFrame();
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400, 250);
		janela.setVisible(true);
		janela.setTitle("Wizad para criação de tabelas de DB");

		JTextField textCreate = new JTextField();
		janela.getContentPane().add(textCreate);
		janela.getContentPane().setLayout(null);
		textCreate.setBounds(20, 120, 80, 30);
		textCreate.setVisible(true);
		textCreate.setText("");

		JButton btn_C = new JButton("Create");
		janela.getContentPane().add(btn_C);
		janela.getContentPane().setLayout(null);
		btn_C.setBounds(20, 50, 80, 50);

		btn_C.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				CreateTable create = new CreateTable(textCreate.getText());
				create.setTitle("Criando Tabela");
				create.setVisible(true);
				create.setSize(50, 100);
				JLabel tb1 = new JLabel("Tabela Criada!");
				create.add(tb1);
			}
		});

		JTextField textInsert = new JTextField();
		janela.getContentPane().add(textInsert);
		janela.getContentPane().setLayout(null);
		textInsert.setBounds(110, 120, 80, 30);
		textInsert.setVisible(true);
		textInsert.setText("");

		JButton btn_I = new JButton("Insert");
		janela.getContentPane().add(btn_I);
		janela.getContentPane().setLayout(null);
		btn_I.setBounds(110, 50, 80, 50);

		btn_I.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				InsertTable insert = new InsertTable(textInsert.getText());
				insert.setTitle("Criando Insert");
				insert.setVisible(true);
				insert.setSize(50, 100);
				JLabel tb1 = new JLabel("Insert Criado!");
				insert.add(tb1);
			}
		});

		JTextField textSelect = new JTextField();
		janela.getContentPane().add(textSelect);
		janela.getContentPane().setLayout(null);
		textSelect.setBounds(200, 120, 80, 30);
		textSelect.setVisible(true);
		textSelect.setText("");

		JButton btn_S = new JButton("Select");
		janela.getContentPane().add(btn_S);
		janela.getContentPane().setLayout(null);
		btn_S.setBounds(200, 50, 80, 50);

		btn_S.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				SelectTable select = new SelectTable(textSelect.getText());
				select.setTitle("Criando Insert");
				select.setVisible(true);
				select.setSize(50, 100);
				JLabel tb1 = new JLabel("Select Criado!");
				select.add(tb1);
			}
		});

		JTextField textDelete = new JTextField();
		janela.getContentPane().add(textDelete);
		janela.getContentPane().setLayout(null);
		textDelete.setBounds(290, 120, 80, 30);
		textDelete.setVisible(true);
		textDelete.setText("");

		JButton btn_D = new JButton("Delete");
		janela.getContentPane().add(btn_D);
		janela.getContentPane().setLayout(null);
		btn_D.setBounds(290, 50, 80, 50);

		btn_D.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				DeleteTable delete = new DeleteTable(textDelete.getText());
				delete.setTitle("Criando delete");
				delete.setVisible(true);
				delete.setSize(50, 100);
				JLabel tb1 = new JLabel("Delete Criado!");
				delete.add(tb1);
			}
		});
	}
}
