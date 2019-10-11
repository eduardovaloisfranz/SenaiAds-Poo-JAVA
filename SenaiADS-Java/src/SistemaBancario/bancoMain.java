package sistemaBancario;

public class bancoMain {

	public static void main(String[] args) {
		Banco banco1 = new Banco("Banco1");
		Agencia ag1 = new Agencia(banco1);
		
		
		TitularPf titularPf = new TitularPf("Nome", "MeuCPF");
		TitularPj titularPj = new TitularPj("TitularPj", "CNPJ aqui");
		ContaBancaria minhaConta = new ContaSimples(1300, titularPf, 2000, "meuNome");
		ContaInvestimentos contaInv1 = new ContaInvestimentos(7, 130.32, titularPf, 1200, "Sou investidor1");
		//int diaNascimento, double taxaRendimentos, Titular titular, double saldoInicial, String nome
		ContaInvestimentos contaInv2 = new ContaInvestimentos(9, 90.23, titularPj , 900,  "Investidor2");
		ag1.addContaBancaria(contaInv1);
		ag1.addContaBancaria(contaInv2);
		
		ag1.listarContas();
		
	}

}
