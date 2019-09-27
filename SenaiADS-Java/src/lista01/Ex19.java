package lista01;

public class Ex19 {
	  
    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {        
       
    for (int i = 0; i < 30; i++) {
            System.out.print("(" + i + "):" + Ex19.fibo(i) + "\n");
        }  
    }
  
}