package aula;

import  java.awt.BorderLayout ;
import  java.awt.Color ;
import  java.awt.GridLayout ;
import  javax.swing.JFrame ;
import  javax.swing.JTabbedPane ;
import  javax.swing.JTextField ;
import  javax.swing.JLabel ;
import  javax.swing.JPanel ;
import  javax.swing.JButton ;
import  javax.swing.SwingConstants ;

public  class  E17  extends  JFrame {
	public  E17 () {
		super ( " JTabbedPane Demo " );
		JTabbedPane tabbedPane =  novo  JTabbedPane ();
		
		JLabel labelNome =  new  JLabel ( " Nome: " , SwingConstants . CENTER );
		JTextField textFieldNome =  novo  JTextField ();
		JLabel labelEndereco =  novo  JLabel ( " Endereço: " , SwingConstants . CENTER );
		JTextField textFieldEndereco =  new  JTextField ();
		Painel 1 JPanel =  novo  JPanel ();
		painel1 . setBackground ( Color . GREEN );
		painel1 . adicionar (labelNome);
		painel1 . add (textFieldNome);
		painel1 . adicionar (labelEndereco);
		painel1 . add (textFieldEndereco);
		tabbedPane . addTab ( " Dados Pessoais " , null , panel1, " Primeiro Panel " );
		painel1 . setLayout ( novo  GridLayout ( 8 , 2 ));
		
		JLabel labelEmpresa =  new  JLabel ( " Empresa: " , SwingConstants . CENTER );
		JTextField textFieldEmpresa =  new  JTextField ();
		JLabel labelFuncao =  new  JLabel ( " Função: " , SwingConstants . CENTER );
		JTextField textFieldFuncao =  new  JTextField ();
		Painel 2 JPanel =  novo  JPanel ();
		painel2 . setBackground ( Color . YELLOW );
		painel2 . adicionar (labelEmpresa);
		painel2 . add (textFieldEmpresa);
		painel2 . adicionar (labelFuncao);
		painel2 . add (textFieldFuncao);
		tabbedPane . addTab ( " Emprego " , null , panel2, " Segundo Panel " );
		painel2 . setLayout ( novo  GridLayout ( 8 , 2 ));

		JLabel label3 =  novo  JLabel ( " " );
		Painel 3 JPanel =  novo  JPanel ();
		painel3 . setBackground ( Color . BLUE );
		painel3 . setLayout ( novo  BorderLayout ());
		painel3 . add ( novo  JButton ( " Alterar Dados Pessoais " ), BorderLayout . NORTE );
		painel3 . add ( novo  JButton ( " Alterar Dados de Emprego " ), BorderLayout . NORTH );
		painel3 . adicionar ( novo  JButton ( " Gerar Relatório " ), BorderLayout . NORTH );
		painel3 . adicionar (label3, BorderLayout . CENTER );
		tabbedPane . addTab ( " Relatório " , null , painel3, " Painel Terceiro " );
		painel3 . setLayout ( novo  GridLayout ( 8 , 2 ));
		adicionar (tabbedPane);
	}

	public  static  void  main ( String  args []) {
		E17 tabbedPaneFrame =  novo  E17 ();
		tabbedPaneFrame . setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE );
		tabbedPaneFrame . setSize ( 300 , 250 );
		tabbedPaneFrame . setVisible ( true );
		tabbedPaneFrame . setResizable ( false );
	}
}