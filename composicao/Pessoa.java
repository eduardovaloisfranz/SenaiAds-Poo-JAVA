package composicao;

import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private int idade;
	private Endereco endereco;
	private ArrayList<Endereco> enderecos = new ArrayList<>();
	private Pessoa mae;
	private Pessoa pai;
	private ArrayList<Pessoa> dependentes;// = new ArrayList<>();
	public Pessoa() {
		this.dependentes = new ArrayList<>();
	}
	public Pessoa(String nome) {
		this.nome = nome;
	}
	public Pessoa(String nome, int idade, Pessoa pai) {
		this.nome = nome; 
		this.idade = idade;
		this.pai = pai;
	}
	public ArrayList<Pessoa> getDependentes() {
		return this.dependentes;
	}
	public Pessoa(String nome, int idade) {
		this(nome);
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Endereco getEndereco() {
		return this.endereco;
	}

	
	public void addDependente(String nomeDependente, int idade) {
		this.addDependente(new Pessoa(nomeDependente, idade, this));
	}
	public void addDependente(Pessoa pessoa) {		
		pessoa.setPai(this);
		this.dependentes.add(pessoa);		
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void getEnderecos() {
		for(Endereco endereco : enderecos) {
			System.out.println(endereco.toString());
		}
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void addEndereco(Endereco endereco) {
		this.enderecos.add(endereco);
	}
	public void setMae(String nomeMae, int idade) {
		//this.mae = new Pessoa(nomeMae, idade);
		this.setMae(new Pessoa(nomeMae, idade));
		
	}
	public void setMae(Pessoa mae) {
		this.mae = mae;
	}
	public void setPai(String nomePai, int idade) {
		//this.mae.setNome(nomePai);
		//this.mae.setIdade(idade);
		this.setPai(new Pessoa(nomePai, idade));
	}
	public void setPai(Pessoa pai) {
		this.pai = pai;
	}
	public Pessoa getPai() {
		return this.pai;
	}
	public Pessoa getMae() {
		return this.mae;
	}
	
	public void listarDependentes() {
		for(Pessoa pessoa : dependentes) {
			System.out.println("Dependente: " + pessoa.getNome());
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + this.nome + " Idade: " + this.idade + this.enderecos.get(0);		
	}
}
