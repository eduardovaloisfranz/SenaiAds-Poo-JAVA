package lista01;

import java.util.Scanner;

public class Teclado {// MÉTODO Estatico: comportamento sempre igual é "genérico"
	private static  Scanner teclado = new Scanner (System.in);
	public static int lerInteiro(String mensagem) {
		System.out.println(mensagem);
		int numero = teclado.nextInt();
		return numero;
	}
	public static String lerString(String mensagem) {
		System.out.println(mensagem);
		String texto = teclado.nextLine();
		return texto;
	}
	public static double lerDouble(String mensagem) {
		System.out.println(mensagem);
		double valor = teclado.nextDouble();
		return valor;
	}
}
