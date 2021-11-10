package com.github.pedrolucascorrea.poo.test.calculadora.view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.github.pedrolucascorrea.poo.test.calculadora.controller.ExpressaoController;
import com.github.pedrolucascorrea.poo.test.calculadora.controller.HistoricoController;
import com.github.pedrolucascorrea.poo.test.calculadora.model.Expressao;

public class CalcGUI implements ActionListener {

	private ExpressaoController expController;
	private HistoricoController histController;

	private Dimension frameSize = Toolkit.getDefaultToolkit().getScreenSize();
	private Integer screenWidth = (int) frameSize.getWidth(), screenHeight = (int) frameSize.getHeight();
	private Integer frameWidth = screenWidth / 6, frameHeight = screenHeight / 2;
	private Integer buttonWidth = (((frameWidth) / 4) - 8), buttonHeight = ((frameHeight - 10) / 8) - 1;

	private static JFrame frame;
	private JTextField txtfield;
	private JButton[] numbers = new JButton[10];
	private JButton[] mainFunctions = new JButton[5];
	private String[] mainFunctionsString = { "+", "-", "x", "/", "=" };
	private JButton[] otherFunctions = new JButton[5];
	private String[] otherFunctionsString = { "^2", "<<", "C", "()", "." };
	private JButton historico = new JButton("Histórico");

	private Font myFont = new Font("Times-New-Roman", Font.BOLD, 20);

	private Integer openParenthesis = 0;

	public CalcGUI() {
		expController = new ExpressaoController();
		histController = new HistoricoController();

		frame = new JFrame("Calculadora");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(frameWidth, frameHeight);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocation(screenWidth / 2 - (frameWidth / 2), screenHeight / 2 - (frameHeight / 2));
		frame.setAutoRequestFocus(false);

		historico.setBounds(17, 5, frameWidth - 50, (frameHeight / 10) - 10);
		historico.addActionListener(this);
		historico.setFont(myFont);
		historico.setFocusable(false);
		frame.add(historico);

		txtfield = new JTextField();
		txtfield.setBounds(5, frameHeight / 10, (frameWidth - 25), (frameHeight / 5) - 10);
		txtfield.setFont(myFont);
		frame.add(txtfield);

		/* Botões */

		// Principais Funções
		int mainFunctionsX = (txtfield.getWidth() + txtfield.getX()) - buttonWidth - 1,
				mainFunctionsY = txtfield.getY() + txtfield.getHeight() + 5;
		for (int i = 0; i < mainFunctions.length; i++) {
			mainFunctions[i] = new JButton(mainFunctionsString[i]);
			mainFunctions[i].setBounds(mainFunctionsX, mainFunctionsY, buttonWidth, buttonHeight);
			mainFunctions[i].addActionListener(this);
			mainFunctions[i].setFont(myFont);
			mainFunctions[i].setFocusable(false);
			frame.add(mainFunctions[i]);
			mainFunctionsY += buttonHeight + 2;
		}

		// Outras Funções
		int otherFunctionsX = 5, otherFunctionsY = txtfield.getY() + txtfield.getHeight() + 5;
		for (int i = 0; i < otherFunctions.length; i++) {
			if (i == 3) {
				otherFunctionsX = otherFunctions[0].getX();
				otherFunctionsY = mainFunctions[4].getY();
			}
			if (i == 4) {
				otherFunctionsX = otherFunctions[2].getX();
				otherFunctionsY = mainFunctions[4].getY();
			}
			otherFunctions[i] = new JButton(otherFunctionsString[i]);
			otherFunctions[i].setBounds(otherFunctionsX, otherFunctionsY, buttonWidth, buttonHeight);
			otherFunctions[i].addActionListener(this);
			otherFunctions[i].setFont(myFont);
			otherFunctions[i].setFocusable(false);
			frame.add(otherFunctions[i]);
			otherFunctionsX += buttonWidth + 2;
		}

		// Números
		int numberX = 0, numberY = 0;
		for (Integer i = numbers.length - 1; i >= 0; i--) {
			if (i >= 7) {
				numberY = mainFunctions[1].getY();
			} else if (i >= 4) {
				numberY = mainFunctions[2].getY();
			} else if (i >= 1) {
				numberY = mainFunctions[3].getY();
			} else {
				numberY = mainFunctions[4].getY();
			}

			if (i == 9 || i == 6 || i == 3) {
				numberX = otherFunctions[otherFunctions.length - 3].getX();
			} else if (i == 2 || i == 5 || i == 8 || i == 0) {
				numberX = otherFunctions[otherFunctions.length - 4].getX();
			} else {
				numberX = otherFunctions[otherFunctions.length - 5].getX();
			}

			numbers[i] = new JButton(i.toString());
			numbers[i].setBounds(numberX, numberY, buttonWidth, buttonHeight);
			numbers[i].addActionListener(this);
			numbers[i].setFont(myFont);
			numbers[i].setFocusable(false);
			frame.add(numbers[i]);
		}

		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		String textoAtual = txtfield.getText();

		if (comando.equals("=")) {
			Expressao expressao = new Expressao(textoAtual);
			if(expressao.getExp().checkSyntax()) {
				this.histController.add(expressao);
				txtfield.setText(expController.requestAnswer(expressao));
			} else {
				JOptionPane.showMessageDialog(frame, "Expressão Inválida");
			}
		}
		else if (comando.equals("Histórico")) {
			new HistoricoGUI(this.histController);
			frame.setVisible(false);
		}

		else if (comando.equals("C")) {
			txtfield.setText("");
		}

		else if (comando.equals("<<")) {
			if (!textoAtual.isBlank()) {
				txtfield.setText(textoAtual.substring(0, textoAtual.length() - 1));
			}
		}

		else if (comando.matches("\\d")) {
			if (textoAtual.isBlank() || !isParenthesis(textoAtual.charAt(textoAtual.length() - 1))) {
				txtfield.setText(textoAtual.concat(comando));
			} else {
				txtfield.setText(textoAtual.concat("*" + comando));
			}
		}

		else if (isMainFunction(comando.charAt(0)) || comando.equals("^2")) {
			if (!textoAtual.isBlank() && (Character.isDigit(textoAtual.charAt(textoAtual.length() - 1))
					|| isParenthesis(textoAtual.charAt(textoAtual.length() - 1)))) {

				comando = (comando.equals("x")) ? "*" : comando;

				txtfield.setText(textoAtual.concat(comando));
			}
		}

		else if (comando.equals(".")) {
			if (!textoAtual.isBlank() && Character.isDigit(textoAtual.charAt(textoAtual.length() - 1))
					&& !haveVirgula(textoAtual)) {
				txtfield.setText(textoAtual.concat("."));
			}
		}

		else if (comando.equals("()")) {
			if (textoAtual.isBlank() || isMainFunction(textoAtual.charAt(textoAtual.length() - 1))
					|| isOpenParenthesis(textoAtual.charAt(textoAtual.length() - 1))) {
				openParenthesis++;
				txtfield.setText(textoAtual.concat("("));
			} else if (Character.isDigit(textoAtual.charAt(textoAtual.length() - 1))) {
				if (openParenthesis > 0) {
					openParenthesis--;
					txtfield.setText(textoAtual.concat(")"));
				} else {
					openParenthesis++;
					txtfield.setText(textoAtual.concat("*("));
				}
			}
		}

	}

	private boolean haveVirgula(String s) {
		Integer sinalPosicao = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (isMainFunction(s.charAt(i))) {
				sinalPosicao = i;
			} else if (s.charAt(i) == '^') {
				sinalPosicao = i + 1;
			}
		}
		for (int i = s.length() - 1; i > sinalPosicao; i--) {
			if (s.charAt(i) == '.') {
				return true;
			}
		}
		return false;
	}

	private boolean isMainFunction(Character c) {
		return c.equals('+') || c.equals('-') || c.equals('x') || c.equals('/');
	}

	private boolean isOpenParenthesis(Character c) {
		return c.equals('(');
	}

	private boolean isParenthesis(Character c) {
		return c.equals(')');
	}

	public static void setVisible() {
		frame.setVisible(true);
		frame.requestFocus();
	}
}