package aulinhaSabado;

public class Obra {
	private int codigo;
	private TipoObra tb;
	private String autor = "";
	private double preco = 0;
	private String titulo = "";
	private static int idAux = 0;
	public Obra() {
		this.codigo = idAux;
		idAux++;
	}
	public Obra(String titulo, double preco) {
		this();
		this.titulo = titulo;
		this.preco = preco;
		this.tb = TipoObra.livro;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Codigo Obra: " + this.codigo + " " +tb.getTipoObra()  + " Nome da obra: " + this.titulo + "Nome do autor: " + this.autor + " possui o preço " + this.preco;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public TipoObra getTb() {
		return tb;
	}
	public void setTb(TipoObra tb) {
		this.tb = tb;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
