package lista01;
import java.util.ArrayList;
import java.util.Scanner;
public class Ex15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);    
	    ArrayList<Integer> numeros = new ArrayList();
	    int maiorNumero = Integer.MIN_VALUE;
	    int menorNumero = Integer.MAX_VALUE;	    
	    for(int i = 0; i < 3; i++) {
	    	int numero;
	    	System.out.println("Digite um numero: ");	    	
	    	numero = input.nextInt();
	    	numeros.add(numero);
	    	if(numeros.get(i) > maiorNumero) {
	    		maiorNumero = numero;
	    	}
	    	if(numeros.get(i) < menorNumero) {
	    		menorNumero = numero;
	    	}
	    }
	    System.out.println("Maior Numero: " + maiorNumero +  "\nMenor Número: " + menorNumero);	    
	}

}
