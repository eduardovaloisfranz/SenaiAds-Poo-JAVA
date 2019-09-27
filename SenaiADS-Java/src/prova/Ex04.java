package prova;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int numero; 
		System.out.println("Digite o numero: ");
		numero = input.nextInt();
		
		double resultado = Math.sqrt(numero);
		System.out.println(resultado);
		String resultadoaux = "" + resultado; 
		
		System.out.println("A Raiz quadrada de " + numero + " é " + resultadoaux.substring(0, 2));
	}

}
