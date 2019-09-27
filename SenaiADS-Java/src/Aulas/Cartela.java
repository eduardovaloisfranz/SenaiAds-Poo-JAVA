package Aulas;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Cartela {
	private ArrayList<Integer> cartela;
	public static ArrayList<Integer> hashCodes = new ArrayList<>();
	private int hashCode;
	public Cartela() {
		this.cartela = new ArrayList<>();
		inserirCartela();
		//for(int i = 0; i < hashCodes.size(); i++) {
			//if(hashCodes.get(i) == this.hashCode) {
				//inserirCartela();		
								
			//}
		//}
			
		
		
	}
	
	private void inserirCartela() {
		SecureRandom sr = new SecureRandom();
		int n;
		boolean continuarRegistro = false;
		for(int linha = 0; linha < 5; linha++) {
			for(int coluna = 0; coluna < 5; coluna++) {
				do {
					n = (15 * linha) + 1 + sr.nextInt(15);
		

					//}
				}while(cartela.contains(n));
				cartela.add(n);
				
				
			}
		}
		cartela.remove(12);
		hashCodes.add(cartela.hashCode());
		this.hashCode = cartela.hashCode();
	}
	public ArrayList<Integer> getNumeros(){
		return cartela;
	}
	public String getCartela() {
		return cartela.toString();
	}
}
