package Lista02;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex05 {

	public static void main(String[] args) {
		int nums[] = new int[10];
		ArrayList<Integer> numsAux = new ArrayList<>(10);		
		int index = 0;
		for(int i : nums) {
			Random rand = new Random();
			int randomNumber = rand.nextInt(100);
			nums[index] = randomNumber; 
			index++;
			
		}
		index = 0;
		for(int i : nums) {
			numsAux.add(nums[index]);
			index++;
			
		}
		System.out.println("Original: ");		
		exibirArray(nums);
		System.out.println("\nOrdem decrescente: ");
		//Arrays.sort(nums, Collections.reverseOrder());
		//Arrays.sort(numsAux, Collections.reverseOrder());
		Collections.sort(numsAux, Collections.reverseOrder());
		//Collections.sort(nums);
		//ArrayUtils.reverse(nums);
		
		exibirArrayList(numsAux);
	}
	private static void exibirArray(int num[]) {
		int index = 0;
		for(int i : num) {
			System.out.print(num[index] + " ");
			index++;
		}
	}
	private static void exibirArrayList(ArrayList<Integer> lista) {
		for(Integer i: lista) {
			System.out.print(i + " ");
		}
	}

}
