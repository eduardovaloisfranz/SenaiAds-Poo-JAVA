package lista01;

import java.util.Scanner;

public class Ex9fake {
	 
	//private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		//objeto instancia de uma classe
		//esses objetos possuem mesmos atributos que possuem valores diferentes;
		
		System.out.println("Eleiçoes: " + Eleicao.getQtdEleicoes());
		int eleitores = Teclado.lerInteiro("Digite numero de eleitores: ");
		int brancos = Teclado.lerInteiro("Digite o valor votos brancos: ");
		int nulos = Teclado.lerInteiro("Digite votos nulos: ");
		int validos = Teclado.lerInteiro("Digite votos validos: ");   

		Eleicao municipal = new Eleicao(eleitores, brancos, nulos, validos);
		System.out.println(municipal.getEleitores());
		
		double pctBrancos = municipal.getPctVotosBrancos();
		double pctNulos = municipal.getPctVotosNulos();
		double pctValidos = municipal.getPctVotosValidos();
		
		System.out.println("Votos Brancos: " + pctBrancos + "\nVotos nulos: " + pctNulos + "\nVotos Validos: " + pctValidos);
		System.out.println("Eleiçoes: " + Eleicao.getQtdEleicoes());
		eleitores = Teclado.lerInteiro("Digite numero de eleitores: ");
		brancos = Teclado.lerInteiro("Digite o valor votos brancos: ");
		nulos = Teclado.lerInteiro("Digite votos nulos: ");
		validos = Teclado.lerInteiro("Digite votos validos: ");   
		Eleicao estadual = new Eleicao(eleitores, brancos, nulos, validos);	
		
		pctBrancos = estadual.getPctVotosBrancos();
		pctNulos = estadual.getPctVotosNulos();
		pctValidos = estadual.getPctVotosValidos();		
		System.out.println("Votos Brancos: " + pctBrancos + "\nVotos nulos: " + pctNulos + "\nVotos Validos: " + pctValidos);
		
		//Eleicao estadual = new Eleicao(eleitores,brancos,nulos,validos);
		
		
	}
	
}
