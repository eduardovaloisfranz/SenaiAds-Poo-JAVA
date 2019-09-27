package Aulas;

import java.util.ArrayList;

public class JogadorBingo {
	private int quantidadeCartelas;
	private boolean vitoria;
	private ArrayList<Cartela> cartelas;
	private ArrayList<Integer> idCartelasJogador;
	
	
	public JogadorBingo(int quantidadeCartelas) {
		this.quantidadeCartelas = quantidadeCartelas;
		cartelas = new ArrayList<>();		
		inserirCartela(quantidadeCartelas);
		
		//inserirCartelas(quantidadeCartelas);
	}/*
	
	private void inserirCartelas(int quantidadeCartelas) {
		for(int i = 0; i < quantidadeCartelas;i++) {
			cartelas.add(new Cartela());
		}
	}*/
	public void inserirCartela(int quantidadeCartelas) {
		Cartela c;
		for(int i = 0; i < quantidadeCartelas; i++) {
			int hash;
			do {
				c = new Cartela();
				//cartelas.add(c);
				hash = c.getNumeros().hashCode();
			}while(idCartelasJogador.contains(hash));
			cartelas.add(c);
			idCartelasJogador.add(hash);
			
		}		
	}
	public String getCartelas() {
		for(Cartela c : cartelas) {
			return c.getCartela().toString();
		}
		return null;
	}
	public int getQuantidadeCartelas() {
		return this.quantidadeCartelas;
	}

}
