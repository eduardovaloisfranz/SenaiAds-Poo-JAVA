package Lista02;

import java.util.Random;

public class Ex06 {

	public static void main(String[] args) {
		int matriz[][] = new int[3][10];
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 10; coluna++) {
				Random random = new Random();
				matriz[linha][coluna] = random.nextInt(100);
			}
		}

	}

}
