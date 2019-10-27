package sistemaBancario;

public final class ContaInvestimentos extends ContaBancaria {
	private int diaNascimento;
	private double taxaRendimentos;
	public ContaInvestimentos(int diaNascimento, double taxaRendimentos, Titular titular, double saldoInicial, String nome, Agencia agencia) {
		super(saldoInicial, titular, 0, nome, agencia);
		//double saldoInicial, Titular titular, double limite, String nome
		this.diaNascimento = diaNascimento;
		this.taxaRendimentos = taxaRendimentos;		
	}
		
	
	@Override
	public String toString() {
		String documentoEspecializado = null;
		if(super.getTitular() instanceof TitularPf) {
			documentoEspecializado = "CPF: " + ((TitularPf) super.getTitular()).getCpf();
		}
		if(super.getTitular() instanceof TitularPj) {
			documentoEspecializado = "CNPJ: " +  ((TitularPj) super.getTitular()).getCnpj();
		}
		
		
		return "Conta possui dono com Nome: " + super.getNome() + documentoEspecializado + " Possuo saldo: " + super.getSaldo() + 
				" Minha agência: " + super.getAgencia().getIdAgencia() + " Que faz parte do Banco: " + super.getAgencia().getBanco().getNomeComercial() + " ID: " + super.getAgencia().getBanco().getIdBanco();
		/*
		 * ("Conta possui Dono com nome: " + super.getNome() + "CPF: " + ((TitularPf) super.getTitular()).getCpf() + 
		 * "Possuo saldo: " + super.getSaldo() + " possui limite: " + super.getLimite() + "Minha agência é a: " 
		 * + super.getAgencia().getIdAgencia() + " Que faz parte do banco: " + super.getAgencia().getBanco().getNomeComercial() + 
		 * " Id: " + super.getAgencia().getBanco().getIdBanco();	
		 * 
		 * */
	}
}
