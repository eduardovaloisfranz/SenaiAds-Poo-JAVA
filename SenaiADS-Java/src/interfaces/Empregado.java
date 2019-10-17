package interfaces;

public abstract class Empregado implements Pagavel, Tributavel{
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
	@Override 
	public double getImpostoDevido() {
		return this.getSalarioBruto() * 0.2;
	}
	@Override
	public double getINSS(){
		return this.getImpostoDevido() * 0.085;
	}
	
}
