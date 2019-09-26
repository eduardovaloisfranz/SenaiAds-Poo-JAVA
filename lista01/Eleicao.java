package lista01;

public class Eleicao {
	
	private int eleitores;
	private int votosBrancos;
	private int votosNulos;	
	private int votosValidos;
	private static int qtdEleicoes = 0;
	
	public static int getQtdEleicoes() {
		return qtdEleicoes;
	}
	public Eleicao(int eleitores, int votosBrancos, int votosNulos,int votosValidos) {
		this.eleitores = eleitores;
		this.votosBrancos = votosBrancos;
		this.votosNulos = votosNulos;
		this.votosValidos = votosValidos;
		qtdEleicoes++;
	}
	
	public int getEleitores() {
		return this.eleitores;
	}	
	public int getVotosBrancos() {
		return this.votosBrancos;		
	}	
	public int getVotosNulos(){
		return this.votosNulos;
	}	
	public int getVotosValidos() {
		return this.votosValidos;		
	}
	public double getPctVotosBrancos(){
		double pct = calcularPercentual(votosBrancos);
		return pct;
	}
	public double getPctVotosNulos() {
		double pct = calcularPercentual(votosNulos);
		return pct;
	}
	public double getPctVotosValidos() {
		double pct = calcularPercentual(votosValidos);
		return pct;
	}
	
	
	private double calcularPercentual(double parte) {// privado pois nao interessa ao usuario, so para auxiliar programador
		double percentual = parte / this.eleitores * 100;
		return percentual;	
}
}
	
