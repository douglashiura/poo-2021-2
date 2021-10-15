package hibernate.classedao;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Rodada {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToMany()
	private List<MapPessoa> jogadores;
	@ManyToMany
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private List<MapPessoa> torcedores;

	public Rodada() {
		jogadores = new LinkedList<MapPessoa>();
	}

	public List<MapPessoa> getJogadores() {
		return jogadores;
	}

	public List<MapPessoa> getTorcedores() {
		return torcedores;
	}

	public Integer getId() {
		return id;
	}
}