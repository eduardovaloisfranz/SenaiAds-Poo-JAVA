package lista01;

public class Jogador {
	private String nomeJogador;
	private int placarJogador;
	private int jogada;	 	
	
	public String getNomeJogador() {
		return this.nomeJogador;
	}
	public int getPlacarJogador(){
		return this.placarJogador;
	}
	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}
	public void setJogada(int jogada) {
		this.jogada = jogada;
		marcarPontuacaoPlacar(jogada);
	}
	
	private void marcarPontuacaoPlacar(int jogada) {
		placarJogador += jogada;
	}
	
}
