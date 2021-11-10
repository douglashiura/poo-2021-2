package com.github.pedrolucascorrea.poo.test.calculadora.DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

import com.github.pedrolucascorrea.poo.test.calculadora.model.Expressao;

public class Historico {
	private PrintStream ps;
	private Scanner sc;
	private Integer index = 1;
	private File file;

	public Historico() throws FileNotFoundException {
		this.file = new File("historico.csv");
		ps = new PrintStream(file);
	}

	public void add(Expressao exp) {
		ps.printf(Locale.US, "%d;%s;%1.2f;\n", index++, exp.getExp().getExpressionString(), exp.getResposta());
	}

	public Map<Integer,Expressao> listAll() throws FileNotFoundException {
		sc = new Scanner(file);
		Map<Integer,Expressao> map = new HashMap<>();
		if(sc.hasNext()) {
		Scanner lineReader=null;
		while (sc.hasNextLine()) {
			String atual = sc.nextLine();
			lineReader =new Scanner(atual).useDelimiter(";");
			map.put(lineReader.nextInt(), new Expressao(lineReader.next(),lineReader.next()));
		}
		lineReader.close();
		sc.close();
		}
		return map;
	}
}
