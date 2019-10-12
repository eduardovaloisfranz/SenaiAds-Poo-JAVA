package sistemaBancario;

public final class ContaSimples extends ContaPf{

	public ContaSimples(double saldoInicial, TitularPf titular, double limite, String nome, Agencia agencia) {
		super(saldoInicial, titular, limite, nome, agencia);			
	}
	
	@Override
	public String toString() {
		return "Conta possui Dono com nome: " + super.getNome() + "CPF: " + ((TitularPf) super.getTitular()).getCpf() + "Possuo saldo: " + super.getSaldo() + " possui limite: " + super.getLimite() + "Minha agência é a: " + super.getAgencia().getIdAgencia() + " Que faz parte do banco: " + super.getAgencia().getBanco().getNomeComercial() + " Id: " + super.getAgencia().getBanco().getIdBanco();
	}	

}
