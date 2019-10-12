package sistemaBancario;

public abstract class ContaPf extends ContaBancaria{
	public ContaPf(double saldoInicial, TitularPf titular, double limite, String nome, Agencia agencia) {
		super(saldoInicial, titular, limite, nome, agencia);
	}
	
}
