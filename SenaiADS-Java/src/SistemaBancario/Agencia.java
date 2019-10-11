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
				System.out.println(((ContaSimples) contas).getNome());
			}
			if (contas instanceof ContaConjunta) {
				
			}
			if(contas instanceof ContaInvestimentos) {
				
			}
			
		}
	}
	public Banco getBanco() {
		return banco;
	}
	
}