package lista01;

import java.util.Random;

public class Desafio {

	public static void main(String[] args) {
		// 
		String nomeJogador1 = Teclado.lerString("Digite nome jogador 1: ");
		String nomeJogador2 = Teclado.lerString("Digite nome jogador 2: ");
		Jogador jogador1 = new Jogador();
		jogador1.setNomeJogador(nomeJogador1);
		Jogador jogador2 = new Jogador();
		jogador2.setNomeJogador(nomeJogador2);
		int contador = 0;		
		while(contador < 3) {			
			int jogadaAleatoria = jogadaAleatoria();
			jogador1.setJogada(jogadaAleatoria);
			if (jogadaAleatoria == 1 || jogadaAleatoria == 6) {				
				//contador--;
				System.out.println("Jogador: " + jogador1.getNomeJogador() +" foi: " + jogadaAleatoria + " Jogando denovo na mesma rodada!");
				jogador1.setJogada(jogadaAleatoria());
			}
			//jogador1.setJogada(jogadaAleatoria);			
			jogadaAleatoria = jogadaAleatoria();			
			jogador2.setJogada(jogadaAleatoria);
			if (jogadaAleatoria == 1 || jogadaAleatoria == 6) {				
				//contador--;
				System.out.println("Jogada: " + jogador2.getNomeJogador() + " foi: " + jogadaAleatoria + " Jogando denovo na mesma rodada!");
				jogador2.setJogada(jogadaAleatoria());
			}
			contador++;
		}	    
		if(jogador1.getPlacarJogador() == jogador2.getPlacarJogador()) {
			System.out.println("Empate!" + "\nPlacar jogador1: " + jogador1.getPlacarJogador() + "\nPlacar Jogador 2: " + jogador2.getPlacarJogador());
		}else if(jogador1.getPlacarJogador() > jogador2.getPlacarJogador()) {
			System.out.println("Jogador: " + jogador1.getNomeJogador() + "Venceu! sua pontuação foi: " + jogador1.getPlacarJogador() + "Pontuação do Jogador: " + jogador2.getPlacarJogador());
		}
		else if(jogador2.getPlacarJogador() > jogador1.getPlacarJogador()) {
			System.out.println("Jogador: " + jogador2.getNomeJogador() + " Venceu! sua pontuação foi: " + jogador2.getPlacarJogador() + "Pontuação do Jogador: " + jogador1.getPlacarJogador());
		}
	}
	private static int jogadaAleatoria() {
		Random random = new Random();
		int jogadaAleatoria = 1 + random.nextInt(6);
		return jogadaAleatoria;
		
	}
}
