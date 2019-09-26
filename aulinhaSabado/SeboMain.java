package aulinhaSabado;

import java.util.Random;
import java.util.Scanner;

public class SeboMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		Sebo loja = new Sebo("RazaoSocial");
		
		
		//Inventario inventario = new Inventario();
		
		Obra obra1 = new Obra();
		obra1.setAutor("Eu");
		obra1.setPreco(10.92);
		obra1.setTitulo("Titulo da Obra");
		obra1.setTb(TipoObra.livro);
		
		//loja.addInventario(inventario);
		
		
		Obra obra2 = new Obra();
		obra2.setAutor("AutorObra2");
		obra2.setPreco(25.23);
		obra2.setTitulo("TituloObra2");
		obra2.setTb(TipoObra.dvd);
		
		Obra obra3 = new Obra("TituloObra3", 132.9);		
		Obra obra4 = new Obra("TituloObra4", 153.9);
		Obra obra5 = new Obra("TituloObra5", 110.9);
		Obra obra6 = new Obra("TituloObra6", 1230.9);
		
		
		
		
		loja.addObra(obra1, 100);		
		loja.addObra(obra2, 100);
		loja.addObra(obra3, getRandomNumber());
		loja.addObra(obra4, getRandomNumber());
		loja.addObra(obra5, getRandomNumber());
		loja.addObra(obra6, getRandomNumber());
		
		
		
		
		/*
		System.out.println("Digite o codigo da obra que deseja comprar");
		int obraDesejada = scanner.nextInt();
		System.out.println("Digite a quantidade de vezes que deseja comprar");
		int quantidadeDesejada = scanner.nextInt();
		loja.comprar(obraDesejada, quantidadeDesejada);*/
		loja.comprar(0, 1);
		loja.vender(0, 200);
		
		//
		
		
		
		


		
		loja.listarEstoque();

		
		

	}
	public static int getRandomNumber() {
		Random rand = new Random();
		
		
		return rand.nextInt(10);
	}

}

