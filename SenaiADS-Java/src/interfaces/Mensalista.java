package interfaces;

public class Mensalista extends Empregado {
	private double salarioMensal;
	public Mensalista(String nome, String sobrenome, String cpf, double salarioMensal) {		
		super(nome, sobrenome, cpf);
		this.salarioMensal = salarioMensal;
	}
	@Override
	public double getSalarioBruto() {
		// TODO Auto-generated method stub
		return this.salarioMensal;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " E meu salario é: " + getSalarioBruto();
	}
}
