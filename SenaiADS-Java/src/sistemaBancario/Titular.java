package sistemaBancario;

public abstract class Titular {
	private String nome;
	public Titular(String titular){
		this.nome = titular;
	}
	public final String getNome() {
		return this.nome;
	}
}
