package Aulas;

import java.util.ArrayList;

public class Bingo {
	private ArrayList<JogadorBingo> jogadores;
	private int quantidadeJogadores;
	private int quantidadeCartelas;
	public Bingo(int quantidadeJogadores, int quantidadeCartelas) {
		this.quantidadeJogadores = quantidadeJogadores;
		this.quantidadeCartelas = quantidadeCartelas;
		jogadores = new ArrayList<>();
		for(int i = 0; i < quantidadeJogadores; i++) {
			jogadores.add(new JogadorBingo(quantidadeCartelas));
		}
		
	}
	
	public String getCartelasJogadores() { 
		for(JogadorBingo bcd : jogadores) {
			 return bcd.getCartelas();
		}
		return null;
	}
	
	
}
