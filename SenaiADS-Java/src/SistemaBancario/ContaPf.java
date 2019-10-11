package sistemaBancario;

public abstract class ContaPf extends ContaBancaria{
	public ContaPf(double saldoInicial, TitularPf titular, double limite, String nome) {
		super(saldoInicial, titular, limite, nome);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Titular: " + super.getTitular().getNome() + " CPF: " + ((super.getTitular()) ContaPf) ;
	}
}
