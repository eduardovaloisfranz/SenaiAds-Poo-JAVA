package Aulas;

public class Array{

	public static void main(String[] args) {

		// decalara��o completa em uma linha
		int[] x = new int[12];

		for (int i = 0; i < x.length; i++) {
			x[i] = (int) (Math.random() * 100);
		}
		System.out.printf("%6s%8s%n", "�ndice", "Valor");
		for (int i = 0; i < x.length; i++) {
			System.out.printf("%6d%8d%n", i, x[i]);
		}

		final int TAMANHO_VETOR = 8;

		// declara��o em duas etapas
		int[] y;
		y = new int[TAMANHO_VETOR];

		for (int i = 0; i < TAMANHO_VETOR; i++) {
			y[i] = (int) (Math.random() * 100);
		}
		System.out.printf("%6s%8s%n", "�ndice", "Valor");
		for (int i = 0; i < TAMANHO_VETOR; i++) {
			System.out.printf("%6d%8d%n", i, y[i]);
		}

		// declara��o e inicializa��o com uma lista
		int[] z = { 99, 66, 75, 44, 21 };

		int total = 0;
		System.out.printf("%6s%8s%n", "�ndice", "Valor");
		for (int i = 0; i < z.length; i++) {
			System.out.printf("%6d%8d%n", i, z[i]);
			total += z[i];
		}
		System.out.printf("Total: %8d%n", total);

		total = 0;

		// la�o for otimizado para uso em arrays.
		// s� pode ser usado para obter valores, n�o para modificar.
		for (int n : z) {
			total += n;
		}
		System.out.printf("Total: %8d%n", total);

		try {
			System.out.println(z[99]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: " + e.getMessage());
			System.out.println("Erro: " + e);
		}

		mostrarVetorTabela(z);

		// declara��o de uma matrix 3x4
		int[][] m = new int[3][4];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) (Math.random() * 100);
			}
		}
		mostrarMatrizTabela(m);

		// declara��o de uma matrix 2x2
		int[][] b = { { 1, 2 }, { 3, 4 } };
		mostrarMatrizTabela(b);

		// declara��o de uma matriz irregular
		int[][] c = new int[2][]; // cria��o de 2 linhas
		c[0] = new int[5]; // cria��o de 5 colunas na linha 0
		c[1] = new int[3]; // cria��o de 3 colunas na linha 1
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = (int) (Math.random() * 100);
			}
		}
		mostrarMatrizTabela(c);

		mostrarVetorTabelaVar(1,2,3,4,5,6);

	}

	private static void mostrarVetorTabela(int[] v) {
		System.out.printf("%6s%8s%n", "�ndice", "Valor");
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%6d%8d%n", i, v[i]);
		}
	}

	private static void mostrarVetorTabelaVar(int... v ) {
		System.out.printf("%6s%8s%n", "�ndice", "Valor");
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%6d%8d%n", i, v[i]);
		}
	}
	
	private static void mostrarMatrizTabela(int[][] w) {
		System.out.println("--------------------");
		for (int i = 0; i < w.length; i++) {
			for (int j = 0; j < w[i].length; j++) {
				System.out.printf("%5d", w[i][j]);
			}
			System.out.println();
		}
	}

}
