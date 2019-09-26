package composicao;

import java.util.ArrayList;

public class Estado {
	private String nomeEstado;
	private String abreviaturaEstado;
	private Pais pais;
	private ArrayList<Cidade> cidades = new ArrayList<>();
	
	public Estado(String nomeEstado, String abreviaturaEstado, Pais pais) {
		this.nomeEstado = nomeEstado;		
		this.abreviaturaEstado = abreviaturaEstado;
		this.pais = pais;
		pais.adicionarEstado(this);
	}
	
	public void adicionarCidade(String nomeCidade) {
		this.adicionarCidade(new Cidade(nomeCidade, this));
	}
	public void adicionarCidade(Cidade cidade) {
		this.cidades.add(cidade);
	}
	public Pais getPais() {
		return pais;
	}
	
	public void getCidadesDoEstado() {
		for(Cidade cidade : cidades) {
			System.out.println("O Estado: " + this.nomeEstado + "Possui as cidades: " + cidade.getNomeCidade());
		}
	}
	public String getNomeEstado() {
		return this.nomeEstado; 
	}
	public void setEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}
	public String getAbreviaturaEstado() {
		return this.abreviaturaEstado;		
	}
	public String getNomePaisDoEstado() {
		return pais.getNomePais();
	}
	public void setAbreviatura(String abreviaturaEstado) {
		this.abreviaturaEstado = abreviaturaEstado;
	}
}
