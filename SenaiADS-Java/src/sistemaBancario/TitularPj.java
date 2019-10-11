package sistemaBancario;

public final class TitularPj extends Titular{
	private String cnpj; 
	public TitularPj(String nome, String cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}
	public String getCnpj() {
		return this.cnpj;
	}
}
