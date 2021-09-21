package com.ies.poo.classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormatActionListener implements ActionListener{
	private CreateTableE18 bdTable;
	
	public FormatActionListener(CreateTableE18 bdTable) {
		this.bdTable = bdTable;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.bdTable.connectToDatabase();
	}

}
