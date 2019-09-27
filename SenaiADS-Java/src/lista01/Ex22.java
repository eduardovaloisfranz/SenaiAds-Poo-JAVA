package lista01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Short> idades = new ArrayList();
		ArrayList<String> nomes = new ArrayList();
		String nomeUsuario = "a";
		short idade, maiorIdade = 0;
		boolean continuar = true; 

		
		while(continuar) {			
			System.out.println("Digite o nome: ");
			nomeUsuario = input.nextLine();
		
			System.out.println("Digite a idade: ");
			idade = input.nextShort();
			input.nextLine();
			if(nomeUsuario.equals("fim")) {
				continuar = false;				
			}			
			nomes.add(nomeUsuario);
			idades.add(idade);
		}
		int i = 0, nomeAux = 0;		
		for(int idadeAux : idades) {
			if(idades.get(i) > maiorIdade) {
				maiorIdade = idades.get(i);
				nomeAux = i;
			};
			i++;
		}
		if(nomeAux != 0) {
			System.out.println("Pessoa de maior Idade: " + nomes.get(nomeAux) + "\nPossui idade: " + maiorIdade);			
		}
			

	}
}
