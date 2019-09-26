package Lista02;

import java.util.Random;
import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		int nums[] = new int[10];
		
		int index = 0;
		for(int i : nums) {
			Random rand = new Random();
			int randomNumber = rand.nextInt(100);
			nums[index] = randomNumber; 
			index++;
			
		}
		System.out.println("Original: ");		
		exibirArray(nums);
		System.out.println("\nOrdem crescente: ");
		Arrays.sort(nums);
		exibirArray(nums);
	}
	private static void exibirArray(int num[]) {
		int index = 0;
		for(int i : num) {
			System.out.print(num[index] + " ");
			index++;
		}
	}

}
