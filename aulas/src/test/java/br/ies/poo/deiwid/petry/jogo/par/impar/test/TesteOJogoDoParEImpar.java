package br.ies.poo.deiwid.petry.jogo.par.impar.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar.modelo.Aposta;
import br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar.modelo.Especulavel;
import br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar.modelo.Jogador;
import br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar.modelo.ModeloDoJogoDeParEImpar;
import br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar.modelo.ResultadoDoJogo;
import br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar.modelo.RodadaDoJogo;
import br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar.modelo.TiposDeAposta;
import br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar.modelo.Torcedor;
import br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar.modelo.dao.entidade.Rodada;
import br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar.modelo.dao.hibernate.RodadaDAOHibernate;

public class TesteOJogoDoParEImpar implements Especulavel {

	private Jogador brayan;
	private Aposta doBrayan;

	@Before
	public void configurarOTeste() {
		AjudanteDeTeste.limpaBancoDeDados();
	}

	@Test
	public void umaRodadaPerfeitaEntreODouglasEBrayan() throws Exception {
		Torcedor lucas = new Torcedor(this);
		Jogador douglas = new Jogador(this);
		brayan = new Jogador(this);
		ModeloDoJogoDeParEImpar jogo = new ModeloDoJogoDeParEImpar();
		Aposta doDouglas = new Aposta(douglas, Integer.valueOf(5), TiposDeAposta.PAR);
		doBrayan = new Aposta(brayan, Integer.valueOf(4), TiposDeAposta.IMPAR);
		RodadaDoJogo umaRodada = jogo.novaRodada();
		umaRodada.querAssistir(lucas);
		umaRodada.querInscreverSe(douglas);
		umaRodada.querInscreverSe(brayan);
		umaRodada.aposta(doDouglas);
		umaRodada.aposta(doBrayan);
		RodadaDAOHibernate daoRodadaHibernate = new RodadaDAOHibernate();
		List<Rodada> rodadas = daoRodadaHibernate.listar();
		assertEquals(1, rodadas.size());
		assertEquals(2, rodadas.get(0).getJogadores().size());
		assertEquals(1, rodadas.get(0).getTorcedores().size());
	}

	public void obtemOResultado(ResultadoDoJogo resultado) {
		List<Aposta> apostasVencedoras = resultado.obterApostasVencedoras();
		assertEquals(Integer.valueOf(9), resultado.obterValorSomado());
		assertEquals(TiposDeAposta.IMPAR, resultado.obterTipoDaApostaVencedora());
		assertEquals(1, apostasVencedoras.size());
		assertEquals(doBrayan, apostasVencedoras.get(0));
	}

}
