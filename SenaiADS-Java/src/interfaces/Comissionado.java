package interfaces;

public class Comissionado extends Empregado {
	private double vendasBrutas;
	private double percentualComissao;
	public Comissionado(String nome, String sobrenome, String cpf, double vendasBrutas, double percentualComissao) {
		super(nome, sobrenome, cpf);
		this.vendasBrutas = vendasBrutas;
		if(percentualComissao >= 1) {
			percentualComissao /= 100;
		}
		this.percentualComissao = percentualComissao;
	}
	@Override
	public double getSalarioBruto() {
		// 
		return vendasBrutas * percentualComissao;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " E meu salario é: " + getSalarioBruto();
	}
	
}
