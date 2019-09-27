package testestestesdfas;

import java.math.BigDecimal;

public class asddas {
	public static void main(String[] args) {
		double x = (0.1 + 0.1 + 0.1) * 3;
		System.out.println(x);

		BigDecimal a = new BigDecimal("0.1");
		BigDecimal b = new BigDecimal("0.2");
		System.out.println(0.1 + 0.2);
		System.out.println(a.add(b));
		
		int total = 0;
		for(int i = 0; i <= 5; i++) {
			total += i;
		}
		System.out.println(total);
		
		System.out.println(soma(5, 9));
		
	}
	public static int soma(int a, int b) {
		if(a == b) {
			return a; 
		}else {
			return b + soma(a, b-1);
		}
	}
}
