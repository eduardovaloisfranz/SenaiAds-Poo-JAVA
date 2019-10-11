package sistemaBancario;

public final class ContaConjunta extends ContaPf{
	private Titular titular2;

	public ContaConjunta(double saldoInicial, TitularPf titularPf, double limite, String nome, Titular titular2) {
		super(saldoInicial, titularPf, limite, nome);
		//double double saldoInicial, TitularPf titular, double limite, String nome
		this.titular2 = titular2;
	} 
	
}
