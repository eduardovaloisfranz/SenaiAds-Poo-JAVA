package lista01;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numInicial, numFinal, somaPares= 0;
		System.out.println("Digite o n�mero inicial: ");
		numInicial = input.nextInt();		
		System.out.println("Digite o n�mero Final: ");
		numFinal = input.nextInt();
		for(; numInicial <= numFinal; numInicial++) {
			if(numInicial % 2 == 0) {
				somaPares+= numInicial;
			}
		}
		System.out.println("Soma Pares: " + somaPares);
	}
}
