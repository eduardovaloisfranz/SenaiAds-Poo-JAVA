package sistemaBancario;

public final class ContaConjunta extends ContaPf{
	private Titular titular2;

	public ContaConjunta(double saldoInicial, TitularPf titularPf, double limite, String nome, Titular titular2, Agencia agencia) {
		super(saldoInicial, titularPf, limite, nome, agencia);
		//double double saldoInicial, TitularPf titular, double limite, String nome
		this.titular2 = titular2;
	} 
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Conta possui os seguintes donos, o 1: " + super.getNome() + "CPF: " + ((TitularPf) super.getTitular()).getCpf() + 
				"O outro dono: " + this.titular2.getNome() + "CPF: " + ((TitularPf) this.titular2).getCpf() + 
				"Possui Saldo: " + super.getSaldo() + " Possui limite: " + super.getLimite() + " Minha agência é a: " + super.getAgencia().getIdAgencia() +
				" Que faz parte do banco: " + super.getAgencia().getBanco().getNomeComercial() + " Id : " + super.getAgencia().getBanco().getIdBanco();
		
		/* 
		 *("Conta possui Dono com nome: " + super.getNome() + "CPF: " + ((TitularPf) super.getTitular()).getCpf() + "Possuo saldo: " +
		 * super.getSaldo() *+ " possui limite: " + super.getLimite() + "Minha agência é a: " + super.getAgencia().getIdAgencia() + " 
		 * Que faz parte do banco: " + 
		 *super.getAgencia().getBanco().getNomeComercial() + " Id: " + super.getAgencia().getBanco().getIdBanco();	
		 * 
		 * 
		 * */
		}
	
}
