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

public class TesteAIntegracaoDoResultadoDoJogoComoOBancoDeDados {

	private Jogador brayan;
	private Aposta doBrayan;

	@Before
	public void configurarOTeste() {
		AjudanteDeTeste.limpaBancoDeDados();
	}

	@Test
	public void umaRodadaPerfeitaEntreODouglasEBrayan() throws Exception {
		Jogador douglas = new Jogador(new ResultadoBrayanDouglas(), "Douglas", "123");
		brayan = new Jogador(new ResultadoBrayanDouglas(), "Brayan", "2344");
		ModeloDoJogoDeParEImpar jogo = new ModeloDoJogoDeParEImpar();
		Aposta doDouglas = new Aposta(douglas, Integer.valueOf(5), TiposDeAposta.PAR);
		doBrayan = new Aposta(brayan, Integer.valueOf(4), TiposDeAposta.IMPAR);
		RodadaDoJogo umaRodada = jogo.novaRodada();
		umaRodada.querInscreverSe(douglas);
		umaRodada.querInscreverSe(brayan);
		umaRodada.aposta(doDouglas);
		umaRodada.aposta(doBrayan);

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
}
