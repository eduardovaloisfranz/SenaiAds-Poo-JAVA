package colecoes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ExArrayList {

	// Uma lista � uma cole��o de elementos em sequ�ncia e que pode conter itens
	// duplicados.

	// ArrayList � uma implementa��o da interface List para um vetor
	// redimension�vel. A inser��o de elementos entre outros j� existentes n�o
	// � eficiente, pois implica no deslocamento dos elementos posteriores.

	public static void main(String[] args) {

		// preenche uma lista com os elementos de um vetor de cores
		String[] cores = { "PRETO", "VERMELHO", "BRANCO", "AZUL", "AMARELO" };
		List<String> lista = new ArrayList<String>();
		for (String cor : cores) {
			lista.add(cor);
		}

		// preenche uma lista com cores a serem removidas
		String[] removerCores = { "VERMELHO", "BRANCO", "AZUL" };
		List<String> listaRemover = new ArrayList<String>();
		for (String cor : removerCores) {
			listaRemover.add(cor);
		}

		// conte�do da lista de cores original
		System.out.println("ArrayList cores: ");
		for (int cor = 0; cor < lista.size(); cor++) {
			System.out.printf("%s ", lista.get(cor));
		}

		// remover da lista de cores os elementos em listaRemover
		removerCores(lista, listaRemover);

		// conte�do da lista de cores ap�s remover os elementos especificados
		System.out.printf("%n%nArrayList cores ap�s remo��o:%n");
		for (String cor : lista) {
			System.out.printf("%s ", cor);
		}

	}

	private static void removerCores(Collection<String> original, Collection<String> aRemover) {

		Iterator<String> iterator = original.iterator();
		while (iterator.hasNext()) {
			if (aRemover.contains(iterator.next())) {
				iterator.remove();
			}
		}
	}

}
