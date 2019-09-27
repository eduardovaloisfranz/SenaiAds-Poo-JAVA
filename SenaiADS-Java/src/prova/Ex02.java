package prova;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int azul = 0,verde = 0, amarelo = 0;
		int opcao = lerInteiro("Digite o numero: ");
		do {
			System.out.println("Vote em uma cor, informando o código correspondente:");
			System.out.println("1 - azul" + "\n2 - verde" + "\n3 - amarelo" + "\n0 - fim" + "\nCor: ");			
			opcao = lerInteiro("");
			switch (opcao) {
			case 0: break;
			case 1:
				azul++;				
				mensagemVotacao("azul", azul);
				break;
			case 2:
				verde++;
				mensagemVotacao("verde", verde);
				break;
			case 3:
				amarelo++;
				mensagemVotacao("amarelo", amarelo);
				break;
			default:
				System.out.println("\n*** Opção inválida! ***\n");
			}
		} while (opcao != 0);

		System.out.println("Total AZUL = " + azul);
		System.out.println("Total VERDE = " + verde);
		System.out.println("Total AMARELO = " + amarelo);

	
	}
	private static void mensagemVotacao(String cor, int quantidade) {
		System.out.println("Voce votou: " + cor.toUpperCase() + " Total: " + quantidade);
		
	}
	public static int lerInteiro(String mensagem) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(mensagem);
		int numero = teclado.nextInt();
		return numero;
	}

}
