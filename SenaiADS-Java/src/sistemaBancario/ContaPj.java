package sistemaBancario;

public class ContaPj extends ContaBancaria{
	public ContaPj(double saldoInicial, TitularPj titularPj, double limite, String nome, Agencia agencia) {
		super(saldoInicial, titularPj, limite, nome, agencia);
	}
	
	
	@Override
	public String toString() {		
		return "Conta possui dono com nome: " + super.getNome() + ((TitularPj) super.getTitular()).getCnpj() + " Possuo saldo: " + super.getSaldo() + 
		" Possui limite: " + super.getLimite() + " Minha agência é a : " + super.getAgencia().getIdAgencia() + " Que faz parte do Banco: " +
		super.getAgencia().getBanco().getNomeComercial() + " ID: " + super.getAgencia().getBanco().getIdBanco();
	}
	/* 
	 *("Conta possui Dono com nome: " + super.getNome() + "CPF: " + ((TitularPf) super.getTitular()).getCpf() + "Possuo saldo: " +
	 * super.getSaldo() *+ " possui limite: " + super.getLimite() + "Minha agência é a: " + super.getAgencia().getIdAgencia() + " 
	 * Que faz parte do banco: " + 
	 *super.getAgencia().getBanco().getNomeComercial() + " Id: " + super.getAgencia().getBanco().getIdBanco();	
	 * 
	 * 
	 * */
}
