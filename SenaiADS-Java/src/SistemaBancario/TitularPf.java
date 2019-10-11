package sistemaBancario;

public final class TitularPf extends Titular{
	private String cpf;
	public TitularPf(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}
	public String getCpf() {
		return this.cpf;
	}
}
