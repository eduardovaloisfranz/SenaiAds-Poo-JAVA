package interfaces;

public abstract class Empregado implements Pagavel{
	private String nome;
	private String sobrenome;
	private String cpf;
	
	public Empregado(String nome, String sobrenome, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;				
	}
	public final String getNome() {
		return this.nome;		
	}
	public final String getSobrenome() {
		return this.sobrenome;
	}
	public final String getCPF() {
		return this.cpf;
	}
	public abstract double getSalarioBruto();
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Sou: " + this.nome + " " + this.sobrenome + "Possuo CPF: " + this.cpf;
	}
	
	@Override 
	public double getTotalDevido() {
		return getSalarioBruto();
	}
	
}
