package lista01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		ArrayList<Double> notas = new ArrayList();
		Scanner input = new Scanner(System.in);
		double nota = 1;
		int quantidadeNotas = 0;
		while(nota >= 0) {
			System.out.println("Digite uma nota: ");
			nota = input.nextDouble();
			notas.add(nota);
			++quantidadeNotas;
		}
		double somaNotas = 0;
		for(int i = 0; i < quantidadeNotas; i++) {
			if(notas.get(i) >= 0) {
				somaNotas += notas.get(i);				
			}
		}
		somaNotas = somaNotas / (quantidadeNotas - 1);
		System.out.println("Media turma: " + somaNotas);
	}

}
