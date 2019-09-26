package prova;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int raio;
		double diametro, circunferencia,area;
		System.out.println("Digite o raio: ");
		raio = scanner.nextInt();
		diametro = raio * 2;
		circunferencia = (2 * 3.14) * raio;
		area = 3.14 * (raio * raio);
		String circunferenciaAux = "" + circunferencia;
		System.out.println("Diametro: " + diametro + "\nCircunferencia: " + circunferenciaAux.substring(0, 8) + "\nArea: " + area);
	}

}
