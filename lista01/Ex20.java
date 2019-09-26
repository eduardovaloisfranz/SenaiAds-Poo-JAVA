package lista01;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("Digite um numero: ");
		num = input.nextInt();
		if(num >= 0) {
			System.out.println("Parabens!");
		}
		while(num < 0) {
			System.out.println("Digite um número MAIOR que 0!\n");
			num = input.nextInt();
		}
	}

}
