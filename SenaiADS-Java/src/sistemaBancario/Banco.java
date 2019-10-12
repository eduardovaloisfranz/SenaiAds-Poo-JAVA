package sistemaBancario;

import java.util.ArrayList;

public class Banco {
	private int idBanco;
	private String nomeComercial;	 
	private static int idAux;
	private ArrayList<Agencia> agencias = new ArrayList<>();
	public Banco(String nomeComercial) {
		this.nomeComercial = nomeComercial;
		this.idBanco = idAux++;
	}
	public void addAgencia(Agencia ag) {
		this.agencias.add(ag);
	}
	public int getIdBanco() {
		return this.idBanco;
	}
	public String getNomeComercial() {
		return this.nomeComercial;
	}
	
}