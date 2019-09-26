package lista01;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero, fatorial = 0, numAux;
		System.out.println("Digite um número: ");		
		numero = input.nextInt();
		numero--;
		numAux = numero;
		if(numero > 0) {
			for(; numero >= 1; numero--) {
				fatorial += numAux * numero;
			}
			System.out.println("Fatorial: " + fatorial);
		}
		else if(numero == 0) {
			fatorial = 1;
			System.out.println("Fatorial: " + fatorial);
		}
		else {
			System.out.println("Numero invalido");

		}
		
		
		
	}

}