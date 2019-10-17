package interfaces;

public class BaseMaisComissao extends Comissionado {

	private double salarioBase;
	public BaseMaisComissao(String nome, String sobrenome, String cpf, double vendasBrutas, double percentualComissao, double salarioBase) {
		super(nome, sobrenome, cpf, vendasBrutas, percentualComissao);
		this.salarioBase = salarioBase;
	}
	
	@Override
	public double getSalarioBruto() {
		return (super.getSalarioBruto()) + this.salarioBase;
	}

}
