package Lista02;

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		int nums[] = new int[10];		
		int index = 0, qtdPares = 0, qtdImpares = 0, somaPares = 0, somaImpares = 0;
		for(int i : nums) {			
			Random rand = new Random();
			int numRandom = rand.nextInt(100);
			nums[index] = numRandom;			
			if(nums[index] % 2 == 0) {
				qtdPares++;
				somaPares+= nums[index];
			}else {
				qtdImpares++;
				somaImpares+= nums[index];				
			}
			//System.out.println(nums[index]);
			index++;			
		}
		System.out.println("Soma pares: " + somaPares + "\nSoma impares" + somaImpares + "\nQuantidade pares " + qtdPares + "\nQuantidade Impares" + qtdImpares);
		System.out.println("Em ordem!");
		index = 0;
		for(int i : nums) {
			System.out.print(nums[index] + " ");
			index++;
		}
		System.out.println("\nOrdem Reversa!");
		for(int i = nums.length - 1; i >= 0; i--) {
			System.out.print(nums[i] + " ");
		}
		

	}

}
