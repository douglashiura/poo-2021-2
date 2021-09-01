package br.ies.aula.jogo.advinhacao.visao;
//
public enum ViewMode{
	TUI(0), GUI1(1), GUI2(2);
	
	private int value;
	
	private ViewMode(int v){
		value = v;
	}
	
	public int getValue(){
		return value;
	}
}
