package sistemaBancario;

import java.util.ArrayList;
import java.util.Scanner;

public class bancoMain {
	public static ArrayList<Banco> bancos = new ArrayList<>();
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		/*Banco banco1 = new Banco("Banco1");
		Agencia ag1 = new Agencia(banco1);
		
		
		TitularPf titularPf = new TitularPf("Nome", "MeuCPF");
		TitularPj titularPj = new TitularPj("TitularPj", "CNPJ aqui");
		
		
		ContaBancaria contaSimples = new ContaSimples(1300, titularPf, 2000, "meuNome", ag1);
		ContaInvestimentos contaInv1 = new ContaInvestimentos(7, 130.32, titularPf, 1200, "Sou investidor1", ag1);
		//int diaNascimento, double taxaRendimentos, Titular titular, double saldoInicial, String nome
		ContaInvestimentos contaInv2 = new ContaInvestimentos(9, 90.23, titularPj , 900,  "Investidor2", ag1);
		ag1.addContaBancaria(contaSimples);
		ag1.addContaBancaria(contaInv1);
		ag1.addContaBancaria(contaInv2);	
		
		ag1.listarContas();*/
		
		
		menu();
		
		
		
		
		
	}
	public static void cadastrarBanco() {
		
		
		System.out.println("Digite o nome comercial do banco: ");
		String nomeComercial = input.nextLine();		
		bancos.add(new Banco(nomeComercial));
		
	}
	public static void menu() {
			
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a sua opcao desejada: ");
		short opcao = input.nextShort();
		switch(opcao) {
			case 1: cadastrarBanco();
				break;
			case 2: cadastrarAgencia();
				break;
			case 3: cadastrarClientes();
				break;
			case 4: depositarValores();
				break;
			case 5: retirarValores();
				break;
			case 6: emitirRelatorios();
				break;
			case 7: excluirBancos();
				break;
			case 8: excluirAgencias();
				break;
			
		}
		
	}
	public static void excluirAgencias() {
		// TODO Auto-generated method stub
		
	}
	public static void excluirBancos() {
		// TODO Auto-generated method stub
		
	}
	public static void emitirRelatorios() {
		// TODO Auto-generated method stub
		
	}
	public static void retirarValores() {
		// TODO Auto-generated method stub
		
	}
	public static  void depositarValores() {
		// TODO Auto-generated method stub
		
	}
	public static  void cadastrarClientes() {
		// TODO Auto-generated method stub
		
	}
	public static void cadastrarAgencia() {
		// TODO Auto-generated method stub
		
	}
	

}
