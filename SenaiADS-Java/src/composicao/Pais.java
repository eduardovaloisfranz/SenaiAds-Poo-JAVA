package composicao;

import java.util.ArrayList;

public class Pais {
	private String nomePais;
	private ArrayList<Estado> estados = new  ArrayList<Estado>();
	public Pais(String nomePais) {
		this.nomePais = nomePais;
	}
	public void adicionarEstado(String nomeEstado, String abreviatura) {
		 this.adicionarEstado(new Estado(nomeEstado, abreviatura, this));
	}
	public void adicionarEstado(Estado estado) {
		this.estados.add(estado);
	}
	public void getEstadosDoPais() {
		for(Estado estado : estados) {
			System.out.println("O Pais: " + this.nomePais + " possui o estado: " + estado.getNomeEstado() + " e possui abreviatura: " + estado.getAbreviaturaEstado());
		}
	}
	 
	
	public String getNomePais() {
		return this.nomePais;
	}
	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}
	
}
