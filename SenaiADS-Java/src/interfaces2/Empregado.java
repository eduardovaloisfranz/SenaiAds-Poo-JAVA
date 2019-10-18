package interfaces2;

public class Empregado implements Pagavel, Tributavel{
	private String nome;
	private String sobrenome;
	private String cpf;
	private ModeloPagamento modeloPagamento;
	
	public Empregado(String nome, String sobrenome, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;				
	}
	
	public Empregado(String nome, String sobrenome, String cpf, ModeloPagamento modelo) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;	
		this.modeloPagamento = modelo;
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
	public void setModeloPagamento(ModeloPagamento modeloPagamento) {
		this.modeloPagamento = modeloPagamento;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Sou: " + this.nome + " " + this.sobrenome + "Possuo CPF: " + this.cpf + " Meu salario Bruto é: " + getModeloPagamento().getSalarioBruto();
	}
	public ModeloPagamento getModeloPagamento() {
		return this.modeloPagamento;
	}
	
	
	@Override 
	public double getTotalDevido() {
		return getModeloPagamento().getSalarioBruto();
	}
	@Override 
	public double getImpostoDevido() {
		return getModeloPagamento().getSalarioBruto();
	}
	@Override
	public double getINSS(){
		return this.getImpostoDevido() * 0.085;
	}
	
}
