package interfaces2;

public class Comissionado implements ModeloPagamento {
	private double vendasBrutas;
	private double percentualComissao;
	public Comissionado(double vendasBrutas, double percentualComissao) {		
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
		return " E meu salario é: " + getSalarioBruto();
	}
	
}
