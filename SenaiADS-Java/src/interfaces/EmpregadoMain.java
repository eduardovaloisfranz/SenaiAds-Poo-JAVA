package interfaces;

import java.awt.List;
import java.util.ArrayList;


public class EmpregadoMain {

	public static void main(String[] args) {
		Mensalista m1 = new  Mensalista("EuSou","Mensalista", "meuCpf", 1300);
		//System.out.println(m1.getSalarioBruto());
		
		Horista semHoraExtra = new Horista("EuSou", "semHoraExtra" , "meuCPF", 5.85, 44);
		
		Horista comHoraExtra = new Horista("EuSou", "comHoraExtra" , "meuCPF", 5.85, 46);
		
		Comissionado comissionado = new Comissionado("EuSou", "comissionado", "MeuCpf", 1000, 50);
		
		BaseMaisComissao baseMaisComissao = new BaseMaisComissao("EuSou", "baseMaisComissao", "MeuCpf",  100, 50, 1300);
		
		
		//System.out.println(m1 + "\n" + semHoraExtra + "\n" + comHoraExtra + "\n" + comissionado + "\n" + baseMaisComissao);
		//System.out.println(comHoraExtra.getSalarioBruto() - semHoraExtra.getSalarioBruto());
		
		ArrayList<Empregado> empregados = new ArrayList<>();
		
		empregados.add(m1);
		empregados.add(semHoraExtra);
		empregados.add(comHoraExtra);
		empregados.add(comissionado);
		empregados.add(baseMaisComissao);
		for(Empregado emp : empregados) {
			System.out.println(emp + " " + emp.getTotalDevido());
		}
		
		Fatura fat = new Fatura(30, 2);
				
		ArrayList<Pagavel> pagar = new ArrayList<>();
		pagar.add(fat);
		pagar.addAll(empregados);
		pagar.add(new Fatura(30, 2));
		
		
		System.out.println(m1.getINSS());
		for(Pagavel pag : pagar) {
			
			if(pag instanceof Fatura) {
				System.out.println("Fatura do item: " + ((Fatura) pag).getCodigoItem() + " Total devido: " + pag.getTotalDevido());
			}
			if (pag instanceof Empregado) {
				System.out.println("Nome: " + ((Empregado) pag).getNome() + "Total devido: " + pag.getTotalDevido());
			}
			
		}
		NotaFiscalSC nsc = new NotaFiscalSC();
		//TributavelSC.ESTADO
		

	}	

}
