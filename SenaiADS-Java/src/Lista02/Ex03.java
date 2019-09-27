package Lista02;

import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primeiro[] = new int[10];
		int segundo[] = new int[10];
		int terceiro[] = new int[10];	
		
		int index = 0;
		for(int i : primeiro) {
			Random rand = new Random();
			int randomNumber = rand.nextInt(100);
			primeiro[index] = randomNumber;
			randomNumber = rand.nextInt(100);
			segundo[index] = randomNumber;
			index++;
		}
		index = 0;
		for(int i : terceiro) {
			terceiro[index] = primeiro[index] + segundo[index];
			index++;
		}
		index = 0;
		System.out.println("Primeiro");
		for(int i : primeiro) {
			System.out.print(" [ " + primeiro[index] + " ] ");
			index++;
		}
		index = 0;
		System.out.println("\nSegundo");
		for(int i : primeiro) {
			System.out.print(" [ " + segundo[index] + " ] ");
			index++;
		}
		index = 0;
		System.out.println("\nTerceiro");
		for(int i : primeiro) {
			System.out.print(" [ " + terceiro[index] + " ] ");
			index++;
		}
	}

}
