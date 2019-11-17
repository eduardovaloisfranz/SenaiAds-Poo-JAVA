package jdbc;

public class Pessoa {
	private int codigo;
	private String nome;
	
	public Pessoa(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Codigo: " + this.codigo + " Nome: " + this.nome;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getNome() {
		return this.nome;
	}
		
	
	
}
