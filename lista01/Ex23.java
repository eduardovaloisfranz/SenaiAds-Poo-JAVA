package lista01;

public class Ex23 {
	public static void main(String[] args) {
		int areaFlorestaVerde = 20100000;
		int areaFlorestaNegra = 10650000;
		short quantidadeAnos = 0;
		while(areaFlorestaNegra < areaFlorestaVerde) {
			areaFlorestaVerde *= 0.011;
			areaFlorestaNegra *= 0.85;
			quantidadeAnos++;
		}
		System.out.println("Tempo: " + quantidadeAnos + " Anos");
	}
}
