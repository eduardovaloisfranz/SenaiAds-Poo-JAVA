package lista01;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numInicial, numFinal, somaImpares = 0;
		System.out.println("Digite o número inicial: ");
		numInicial = input.nextInt();		
		System.out.println("Digite o número Final: ");
		numFinal = input.nextInt();
		for(; numInicial <= numFinal; numInicial++) {
			if(numInicial % 2 != 0) {
				somaImpares += numInicial;
			}
		}
		System.out.println("Soma impares: " + somaImpares);
	}
}
