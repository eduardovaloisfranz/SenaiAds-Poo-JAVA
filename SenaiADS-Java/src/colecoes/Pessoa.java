package colecoes;

public class Pessoa implements Comparable<Pessoa> {

	private String nome;
	private int idade;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public int getIdade() {
		return this.idade;
	}

	public String getNome() {
		return this.nome;
	}

	@Override
	public String toString() {
		return this.nome + ":" + this.idade;
	}

	@Override
	public int compareTo(Pessoa o) {
		return this.getNome().compareTo(o.getNome());
	}

}
