package interfaces2;

public class BaseMaisComissao extends Comissionado {

	private double salarioBase;
	public BaseMaisComissao(double vendasBrutas, double percentualComissao, double salarioBase) {
		super(vendasBrutas, percentualComissao);
		this.salarioBase = salarioBase;
	}
	
	@Override
	public double getSalarioBruto() {
		return (super.getSalarioBruto()) + this.salarioBase;
	}

}
