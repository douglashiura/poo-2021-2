package testecontroledenotas;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import controledenotas.Aluno;
import controledenotas.ControleDeNotas;
import controledenotas.Notas;
import controledenotas.Numeros;
import controledenotas.Resultado;

public class TesteControleDeNotas {
	private Aluno deiwid;
	private Notas notasDeiwid;
	private ControleDeNotas controleDeNotas;
	@Before
	public void configuracao() {
		deiwid = new Aluno();
		deiwid.nome = "deiwid";
	}
	@Test
	public void aprovacao() throws Exception {
		notasDeiwid = new Notas(deiwid, 8.0, 5.5);
		Resultado resultado = controleDeNotas.verificarAprovacao(notasDeiwid);
		assertEquals(Numeros.APROVADO, resultado);
	}
}
