package interfaces2;

public class Mensalista implements ModeloPagamento{
	private double salarioMensal;
	public Mensalista(double salarioMensal) {		
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
		return  " E meu salario é: " + getSalarioBruto();
	}
}
