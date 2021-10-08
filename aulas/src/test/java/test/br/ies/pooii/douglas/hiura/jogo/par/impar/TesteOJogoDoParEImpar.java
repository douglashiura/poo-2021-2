package test.br.ies.pooii.douglas.hiura.jogo.par.impar;

import static org.junit.Assert.assertEquals;

import java.util.List;

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
	private Aposta doBrayan;

	@Test
	public void umaRodadaPerfeitaEntreODouglasEBrayan() throws Exception {
		Torcedor lucas = new Torcedor(this);
		Jogador douglas = new Jogador(this);
		brayan = new Jogador(this);
		ModeloDoJogoDeParEImpar jogo = new ModeloDoJogoDeParEImpar();
		Aposta doDouglas = new Aposta(douglas, Integer.valueOf(5), TiposDeAposta.PAR);
		doBrayan = new Aposta(brayan, Integer.valueOf(4), TiposDeAposta.IMPAR);
		Rodada umaRodada = jogo.novaRodada();
		umaRodada.querAssistir(lucas);
		umaRodada.querInscreverSe(douglas);
		umaRodada.querInscreverSe(brayan);
		umaRodada.aposta(doDouglas);
		umaRodada.aposta(doBrayan);
	}

	public void obtemOResultado(ResultadoDoJogo resultado) {
		List<Aposta> apostasVencedoras = resultado.obterApostasVencedoras();
		assertEquals(Integer.valueOf(9), resultado.obterValorSomado());
		assertEquals(TiposDeAposta.IMPAR, resultado.obterTipoDaApostaVencedora());
		assertEquals(1, apostasVencedoras.size());
		assertEquals(doBrayan, apostasVencedoras.get(0));
	}

}
