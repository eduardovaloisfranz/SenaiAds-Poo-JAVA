package aulinhaSabado;

import java.util.ArrayList;

public class Sebo {
	private String razaoSocial;
	private ArrayList<Inventario> estoque = new ArrayList<>();
	//private Inventario inventario;
	public Sebo(String razaoSocial) {
		this.razaoSocial = razaoSocial;		
	}
	
	/*
	public void addInventario(Inventario obra) {		
		obra.setQuantidadeEstoqueInicial(0);
		this.estoque.add(obra);
	}/*
	public Inventario getInventario() {
		return this.inventario;
	}*/
	public void listarEstoque() {
		for(Inventario estoque : estoque) {
			System.out.println("O Sebo possui a obra: " + estoque.getObra() + " possui a seguinte quantidade no estoque: " + estoque.getQuantidadeEstoque());
		}
	}
	public void vender(int codigoObra, int quantidadeDesejada) {		
		boolean encontrou = false;
		boolean qtdDesejadaMaiorQtdAtual = false;					
			for(Inventario estoque : estoque) {							
				if((estoque.getObra().getCodigo()) == (codigoObra)) {					
					encontrou = true;
					if(quantidadeDesejada > estoque.getQuantidadeEstoque()) {
						System.out.println("Não foi possivel vender uma quantidade maior que a quantidade em estoque \nQuantidade em estoque " + estoque.getQuantidadeEstoque() + " e a quantidade solicitada foi " + quantidadeDesejada);
						qtdDesejadaMaiorQtdAtual = true;
					}else {
						for(int i = 0; i < quantidadeDesejada; i++) {
							estoque.decEstoque();
						}
						estoque.decEstoque();
						qtdDesejadaMaiorQtdAtual = false;
					}
				}
			}
		
		
		if(encontrou == false) {
			System.out.println("Obra não encontrada!");
		}
		//if(qtdDesejadaMaiorQtdAtual == false) {
			//System.out.println("Não foi possivel vender uma quantidade maior que a quantidade em estoque \nQuantidade em estoque " + estoque.getQuantidadeEstoque() + " e a quantidade solicitada foi " + quantidadeDesejada);
			//System.out.println("Não foi possivel vender uma quantidade maior que a quantidade em estoque: \nQuantidade em estoque " + this.estoque.get(codigoObra).getQuantidadeEstoque() + " e a quantidade solicitada foi: " + quantidadeDesejada);
		//}
	}	
	public void comprar(int codigoObra, int quantidadeCompras) {
		boolean encontrou = false;					
			for(Inventario estoque : estoque) {
				if((estoque.getObra().getCodigo()) == (codigoObra)) {
					//estoque.addEstoque();
					for(int i = 0; i < quantidadeCompras; i++) {
						estoque.addEstoque();
					}
					encontrou = true;
				}
			}			
		
		if(encontrou == false) {
			System.out.println("Registro não encontrado");
		}
		
	}	
	 
	public void addObra(Obra obra, int quantidadeEstoque) {
		//Inventario inv = new Inventario(obra, quantidadeEstoque);
		this.addObra(new Inventario(obra, quantidadeEstoque));
	}
	public void addObra(Inventario inv) {
		this.estoque.add(inv);
	} 
	
}
