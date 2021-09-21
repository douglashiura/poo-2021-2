package testeConexaoComBancoDeDado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormatActionListener implements ActionListener{
	private CriarTabelaE18 bdTable;
	
	public FormatActionListener(CriarTabelaE18 bdTable) {
		this.bdTable = bdTable;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.bdTable.conectar();
	}

}
