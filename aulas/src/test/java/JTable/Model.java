package JTable;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class Model extends AbstractTableModel {
	
	private static final long serialVersionUID = 1L;
	private List<Pessoa> listaPessoas;
	String[] nomeColunas;

	public Model(List<Pessoa> listaPessoas, String[] colunas) {
		this.listaPessoas = listaPessoas;
		this.nomeColunas= colunas;
	}
	
	@Override
	public int getRowCount() {
		if (null == listaPessoas) {
			return 0;
		}
		return listaPessoas.size();
	}

	@Override
	public int getColumnCount() {
		return nomeColunas.length;
	}

	@Override
	public Object getValueAt(int linha, int coluna) {
		
		switch (coluna) {
			case 0: 
				return listaPessoas.get(linha).getCodigo();
			case 1: 
				return listaPessoas.get(linha).getNome();
			case 2: 
				return listaPessoas.get(linha).getEmail();
			default: 
				return 0;
		}
	}
	
	@Override
	public String getColumnName(int indice) {
		return nomeColunas[indice];
	}


}
