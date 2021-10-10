package br.com.gustavo.shell.visao;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;

import java.awt.*;

public class TelaCpu {
	
	private JFrame telaProcessador = new JFrame();
    
	private JPanel painelProcessador = new JPanel();
	
	private JLabel tituloArquitetura = new JLabel();
    private JLabel tituloFornecedor = new JLabel();
    private JLabel tituloFrequencia = new JLabel();
    private JLabel tituloId = new JLabel();
    private JLabel tituloIdentificador = new JLabel();
    private JLabel tituloNome = new JLabel();
		
    private JLabel arquitetura = new JLabel();
    private JLabel cabecalho = new JLabel();
    private JLabel fornecedor = new JLabel();
    private JLabel frequencia = new JLabel();
    private JLabel id = new JLabel();
    private JLabel identificador = new JLabel();
    private JLabel nome = new JLabel();
    
	
    public TelaCpu() {
        inicializaInterface();
    }
    
    private void agrupaLayout(JPanel painel) {
        GroupLayout painelLayout = new GroupLayout(painel);
        painel.setLayout(painelLayout);
        Alignment alinhamentoLeading = GroupLayout.Alignment.LEADING;
        painelLayout.setHorizontalGroup(painelLayout.createParallelGroup(alinhamentoLeading).addGap(0, 100, Short.MAX_VALUE));
        painelLayout.setVerticalGroup(painelLayout.createParallelGroup(alinhamentoLeading).addGap(0, 100, Short.MAX_VALUE));
	}
    
    private void executaConfiguracoesIniciais(JFrame frame) {
    	frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    	frame.setTitle("CPU");
    	frame.setBounds(new Rectangle(10, 5, 1000, 1000));
    	frame.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    	frame.setPreferredSize(new Dimension(485, 285));
    	frame.setSize(new Dimension(1000, 250));
    	frame.getContentPane().setLayout(null);
    	frame.setVisible(true);
	}
    
    private JLabel configuraComponente(JLabel componente, Font fonte, String texto, Border borda, Integer alinhamentoHorizontal) {
    	componente.setFont(fonte);
    	componente.setText(texto);
    	componente.setBorder(borda);
    	componente.setHorizontalAlignment(alinhamentoHorizontal);
    	return componente;
    }
    
    private void defineRestricoesDoComponente(JLabel componente, Integer x, Integer y, Integer largura, Integer altura) {
    	componente.setBounds(x, y, largura, altura);
    }
    
    private void adicionaComponenteNaTela(JLabel componente, JFrame frame) {
    	frame.getContentPane().add(componente);
    }
    
    private void inicializaComponentes(JFrame frame) {
    	
    	Font fonteCabecalho = new Font("DejaVu Sans", 1, 14);
    	Font fonteComponente = new Font("Calibri", 1, 14);
    	Border bordaCabecalho = new MatteBorder(null);
    	Border bordaComponente = new SoftBevelBorder(BevelBorder.RAISED, Color.lightGray, Color.lightGray, Color.lightGray, Color.lightGray);
    	
    	configuraComponente(cabecalho, fonteCabecalho, "Informações do Processador", bordaCabecalho, SwingConstants.CENTER);
        defineRestricoesDoComponente(cabecalho, 10, 11, 448, 19);
        adicionaComponenteNaTela(cabecalho, frame);
        
        configuraComponente(tituloId, fonteComponente, "ID: ", bordaComponente, SwingConstants.CENTER);
        defineRestricoesDoComponente(tituloId, 11, 41, 191, 28);
        adicionaComponenteNaTela(tituloId, frame);
        
        configuraComponente(id, fonteComponente, "--", bordaComponente, SwingConstants.CENTER);
        defineRestricoesDoComponente(id, 208, 41, 250, 28);
        adicionaComponenteNaTela(id, frame);
        
        configuraComponente(tituloNome, fonteComponente, "Nome: ", bordaComponente, SwingConstants.CENTER);
        defineRestricoesDoComponente(tituloNome, 11, 75, 191, 28);
        adicionaComponenteNaTela(tituloNome, frame);
        
        configuraComponente(nome, fonteComponente, "--", bordaComponente, SwingConstants.CENTER);
        defineRestricoesDoComponente(nome, 208, 75, 250, 28);
        adicionaComponenteNaTela(nome, frame);
        
        configuraComponente(tituloFornecedor, fonteComponente, "Fornecedor: ", bordaComponente, SwingConstants.CENTER);
        defineRestricoesDoComponente(tituloFornecedor, 11, 109, 191, 28);
        adicionaComponenteNaTela(tituloFornecedor, frame);
        
        configuraComponente(fornecedor, fonteComponente, "--", bordaComponente, SwingConstants.CENTER);
        defineRestricoesDoComponente(fornecedor, 208, 109, 250, 28);
        adicionaComponenteNaTela(fornecedor, frame);
        
        configuraComponente(tituloIdentificador, fonteComponente, "Identificador: ", bordaComponente, SwingConstants.CENTER);
        defineRestricoesDoComponente(tituloIdentificador, 11, 143, 191, 28);
        adicionaComponenteNaTela(tituloIdentificador, frame);
        
        configuraComponente(identificador, fonteComponente, "--", bordaComponente, SwingConstants.CENTER);
        defineRestricoesDoComponente(identificador, 208, 143, 250, 28);
        adicionaComponenteNaTela(identificador, frame);
        
        configuraComponente(tituloArquitetura, fonteComponente, "Arquitetura: ", bordaComponente, SwingConstants.CENTER);
        defineRestricoesDoComponente(tituloArquitetura, 11, 177, 191, 28);
        adicionaComponenteNaTela(tituloArquitetura, frame);
        
        configuraComponente(arquitetura, fonteComponente, "--", bordaComponente, SwingConstants.CENTER);
        defineRestricoesDoComponente(arquitetura, 208, 177, 250, 28);
        adicionaComponenteNaTela(arquitetura, frame);
        
        configuraComponente(tituloFrequencia, fonteComponente, "Frequência: ", bordaComponente, SwingConstants.CENTER);
        defineRestricoesDoComponente(tituloFrequencia, 11, 211, 191, 28);
        adicionaComponenteNaTela(tituloFrequencia, frame);
        
        configuraComponente(frequencia, fonteComponente, "--", bordaComponente, SwingConstants.CENTER);
        defineRestricoesDoComponente(frequencia, 208, 211, 250, 28);
        adicionaComponenteNaTela(frequencia, frame);
        frame.pack();
    }
    
    private void inicializaInterface() {
        executaConfiguracoesIniciais(telaProcessador);
        agrupaLayout(painelProcessador);
        inicializaComponentes(telaProcessador);
    }                     

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCpu();
            }
        });
    }
}
