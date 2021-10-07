package test.br.ies.pooii.douglas.hiura.jogo.par.impar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.Aposta;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.Especulavel;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.Jogador;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.ModeloDoJogoDeParEImpar;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.ResultadoDoJogo;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.Rodada;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.TiposDeAposta;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.Torcedor;

public class TesteOJogoDoParEImpar implements Especulavel {

	private Jogador brayan;

	@Test
	public void umaRodadaPerfeitaEntreODouglasEBrayan() throws Exception {
		Torcedor lucas = new Torcedor(this);
		Jogador douglas = new Jogador(Especulavel.SEM_INTERESSE);
		brayan = new Jogador(this);
		ModeloDoJogoDeParEImpar jogo = new ModeloDoJogoDeParEImpar();
		Aposta doDouglas = new Aposta(douglas, Integer.valueOf(5), TiposDeAposta.PAR);
		Aposta doBryan = new Aposta(brayan, Integer.valueOf(4), TiposDeAposta.IMPAR);
		Rodada umaRodada = jogo.novaRodada();
		umaRodada.querAssistir(lucas);
		umaRodada.querInscreverSe(douglas);
		umaRodada.querInscreverSe(brayan);
		umaRodada.aposta(doDouglas);
		umaRodada.aposta(doBryan);
	}

	public void obtemOResultado(ResultadoDoJogo resultado) {
		assertEquals(Integer.valueOf(9), resultado.obterValorSomado());
		assertEquals(TiposDeAposta.IMPAR, resultado.obterTipoDaApostaVencedora());
		assertEquals(brayan, resultado.obterVencedor());
	}

}
