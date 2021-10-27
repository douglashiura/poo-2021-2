package test.br.ies.pooii.douglas.hiura.jogo.par.impar;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.Aposta;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.Especulavel;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.Jogador;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.ModeloDoJogoDeParEImpar;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.ResultadoDoJogo;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.RodadaDoJogo;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.TiposDeAposta;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.Torcedor;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.entidade.Rodada;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.hibernate.RodadaDAOHibernate;

public class TesteOJogoDoParEImpar {

	private Jogador brayan;
	private Aposta doBrayan;
	private Aposta doLucas;

	@Before
	public void configurarOTeste() {
		AjudanteDeTeste.limpaBancoDeDados();
	}

	@Test
	public void umaRodadaPerfeitaEntreODouglasEBrayan() throws Exception {
		Torcedor lucas = new Torcedor(new ResultadoBrayanDouglas(), "Lucas", "1234");
		Jogador douglas = new Jogador(new ResultadoBrayanDouglas(), "Douglas", "123");
		brayan = new Jogador(new ResultadoBrayanDouglas(), "Brayan", "2344");
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
	
	@Test
	public void umaRodadaComTresJogadores() throws Exception {
		Jogador lucas = new Jogador(new ResultadoBrayanDouglasELucas(), "Lucas", "1234");
		Jogador douglas = new Jogador(new ResultadoBrayanDouglasELucas(), "Douglas", "123");
		brayan = new Jogador(new ResultadoBrayanDouglasELucas(), "Brayan", "2344");
		ModeloDoJogoDeParEImpar jogo = new ModeloDoJogoDeParEImpar();
		Aposta doDouglas = new Aposta(douglas, Integer.valueOf(5), TiposDeAposta.PAR);
		doBrayan = new Aposta(brayan, Integer.valueOf(4), TiposDeAposta.IMPAR);
		doLucas = new Aposta(lucas, Integer.valueOf(4), TiposDeAposta.IMPAR);
		RodadaDoJogo umaRodada = jogo.novaRodada();
		umaRodada.querInscreverSe(lucas);
		umaRodada.querInscreverSe(douglas);
		umaRodada.querInscreverSe(brayan);
		umaRodada.aposta(doDouglas);
		umaRodada.aposta(doBrayan);
		umaRodada.aposta(doLucas);
		RodadaDAOHibernate daoRodadaHibernate = new RodadaDAOHibernate();
		List<Rodada> rodadas = daoRodadaHibernate.listar();
		assertEquals(1, rodadas.size());
		assertEquals(2, rodadas.get(0).getJogadores().size());
		assertEquals(1, rodadas.get(0).getTorcedores().size());
	}

	@Test
	public void umaRodadacomDoisJogadoresEDoisTorcedores() throws Exception {
		Torcedor lucas = new Torcedor(new ResultadoBrayanDouglas(), "Lucas", "1234");
		Torcedor larissa = new Torcedor(new ResultadoBrayanDouglas(), "Larissa", "1234");
		Jogador douglas = new Jogador(new ResultadoBrayanDouglas(), "Douglas", "123");
		brayan = new Jogador(new ResultadoBrayanDouglas(), "Brayan", "2344");
		ModeloDoJogoDeParEImpar jogo = new ModeloDoJogoDeParEImpar();
		Aposta doDouglas = new Aposta(douglas, Integer.valueOf(5), TiposDeAposta.PAR);
		doBrayan = new Aposta(brayan, Integer.valueOf(4), TiposDeAposta.IMPAR);
		RodadaDoJogo umaRodada = jogo.novaRodada();
		umaRodada.querAssistir(lucas);
		umaRodada.querAssistir(larissa);
		umaRodada.querInscreverSe(douglas);
		umaRodada.querInscreverSe(brayan);
		umaRodada.aposta(doDouglas);
		umaRodada.aposta(doBrayan);
		umaRodada.aposta(doLucas);	
		RodadaDAOHibernate daoRodadaHibernate = new RodadaDAOHibernate();
		List<Rodada> rodadas = daoRodadaHibernate.listar();
		assertEquals(1, rodadas.size());
		assertEquals(3, rodadas.get(0).getJogadores().size());
		assertEquals(0, rodadas.get(0).getTorcedores().size());
	}

	public class ResultadoBrayanDouglas implements Especulavel {
		public void obtemOResultado(ResultadoDoJogo resultado) {
			List<Aposta> apostasVencedoras = resultado.obterApostasVencedoras();
			assertEquals(Integer.valueOf(9), resultado.obterValorSomado());
			assertEquals(TiposDeAposta.IMPAR, resultado.obterTipoDaApostaVencedora());
			assertEquals(1, apostasVencedoras.size());
			assertEquals(doBrayan, apostasVencedoras.get(0));
		}
	}
	
	public class ResultadoBrayanDouglasELucas implements Especulavel {
		public void obtemOResultado(ResultadoDoJogo resultado) {
			List<Aposta> apostasVencedoras = resultado.obterApostasVencedoras();
			assertEquals(Integer.valueOf(13), resultado.obterValorSomado());
			assertEquals(TiposDeAposta.IMPAR, resultado.obterTipoDaApostaVencedora());
			assertEquals(2, apostasVencedoras.size());
			assertEquals(doBrayan, apostasVencedoras.get(0));
			assertEquals(doLucas, apostasVencedoras.get(1));
		}

	}
}
