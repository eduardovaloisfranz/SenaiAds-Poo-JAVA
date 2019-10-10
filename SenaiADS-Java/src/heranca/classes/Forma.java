package heranca.classes;

public abstract class Forma {// classe concreta permite NEW, classe abstrata n�o permite
	//uso classe abstrata: usar como molde
	private String nome;
	
	public final String getNome() {
		return this.nome;
	}
	
	public Forma(String nome) {
		this.nome = nome;
	}
}
