package sistemaBancario;

public class ContaPj extends ContaBancaria{
	public ContaPj(double saldoInicial, TitularPj titularPj, double limite, String nome, Agencia agencia) {
		super(saldoInicial, titularPj, limite, nome, agencia);
	}
}
