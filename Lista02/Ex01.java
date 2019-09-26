package Lista02;

import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[10];		
		int index = 0, maiorNumero = 0;
		for(int i : nums) {			
			Random rand = new Random();
			int numRandom = rand.nextInt(100);
			nums[index] = numRandom;
			if(nums[index] > maiorNumero) {
				maiorNumero = nums[index];
			}
			//System.out.println(nums[index]);
			index++;			
		}
		System.out.println("Maior número: " + maiorNumero);
		

	}

}
