package sistemaBancario;

public final class ContaInvestimentos extends ContaBancaria {
	private int diaNascimento;
	private double taxaRendimentos;
	public ContaInvestimentos(int diaNascimento, double taxaRendimentos, Titular titular, double saldoInicial, String nome) {
		super(saldoInicial, titular, 0, nome);
		//double saldoInicial, Titular titular, double limite, String nome
		this.diaNascimento = diaNascimento;
		this.taxaRendimentos = taxaRendimentos;		
	}
}
