package testecontroledenotas;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import controledenotas.Aluno;
import controledenotas.ControleDeNotas;
import controledenotas.Notas;
import controledenotas.Resultado;

public class TesteControleDeNotas {
	private Aluno deiwid;
	private Notas notasDeiwid;
	private ControleDeNotas controleDeNotas = new ControleDeNotas();
	private List<Notas> lstNotas = new ArrayList<Notas>();
	
	@Test
	public void aprovacao() throws Exception {
		
		deiwid = new Aluno("deiwid", 1234, lstNotas );
		notasDeiwid = new Notas(8.5);
		deiwid.lstNotas.add(notasDeiwid);
		notasDeiwid = new Notas(7.0);
		deiwid.lstNotas.add(notasDeiwid);
		notasDeiwid = new Notas(5.5);
		deiwid.lstNotas.add(notasDeiwid);
		Resultado resultado = controleDeNotas.verificarAprovacao(deiwid);
		assertEquals(Resultado.APROVADO, resultado);
	}
}
