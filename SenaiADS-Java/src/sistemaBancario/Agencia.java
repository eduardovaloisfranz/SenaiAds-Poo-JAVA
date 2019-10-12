package sistemaBancario;

import java.util.ArrayList;

public class Agencia {
	private int idAgencia;
	private Banco banco;
	private static int idAux;
	private ArrayList<ContaBancaria> contasBancarias = new ArrayList<>();
	public Agencia(Banco banco) {
		this.idAgencia = idAux;
		this.idAux++;
		this.banco = banco;
	}
	public void addContaBancaria(ContaBancaria conta) {
		this.contasBancarias.add(conta);
	}
	public void listarContas() {
		for(ContaBancaria contas : contasBancarias) {	
			if(contas instanceof ContaSimples) {
				System.out.println(contas);
			}
			if (contas instanceof ContaConjunta) {
				System.out.println(contas);
			}
			if(contas instanceof ContaInvestimentos) {
				System.out.println(contas);
			}
			if(contas instanceof ContaPj) {
				System.out.println(contas);
			}
			
		}
	}
	public int getIdAgencia() {
		return this.idAgencia;
	}
	public Banco getBanco() {
		return banco;
	}
	
}