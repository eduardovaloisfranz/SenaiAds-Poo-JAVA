package aulinhaSabado;

public class Inventario {
	private Obra obra;
	private int quantidadeEstoque;
	public Inventario(Obra obra) {
		this.obra = obra;
	}
	public Inventario(Obra obra, int quantidadeEstoque) {
		this.obra = obra;
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public Inventario() {
		
	}
	
	public int getQuantidadeEstoque() {
		return this.quantidadeEstoque;
	}
	public Obra getObra() {
		return this.obra;
	}
	public void addObra(Obra obra) {
		this.obra = obra;
	}
	public void addEstoque() {
		this.quantidadeEstoque++;
	} 
	public void decEstoque() {
		this.quantidadeEstoque--;
	}
	
}
