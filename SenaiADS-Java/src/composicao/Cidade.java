package composicao;

public class Cidade {
	private String nomeCidade;
	private Estado estado;

	public Cidade(String nomeCidade, Estado estado) {
		this.nomeCidade = nomeCidade; 
		this.estado = estado;
		this.estado.adicionarCidade(this);
	}
	
	public String getNomeCidade() {
		return nomeCidade;
	}
	
	public String getNomeEstado() {
		return this.estado.getNomeEstado();
	}
	public Estado getEstado() {
		return this.estado;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}
}
