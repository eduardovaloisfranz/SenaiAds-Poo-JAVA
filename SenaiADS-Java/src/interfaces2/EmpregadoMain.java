package interfaces2;

import java.awt.List;
import java.util.ArrayList;


public class EmpregadoMain {

	public static void main(String[] args) {
		Mensalista m1 = new  Mensalista(1300);
		//System.out.println(m1.getSalarioBruto());
		
		Horista semHoraExtra = new Horista(5.85, 44);
		
		Horista comHoraExtra = new Horista(5.85, 46);
		
		Comissionado comissionado = new Comissionado(1000, 50);
		
		BaseMaisComissao baseMaisComissao = new BaseMaisComissao(100, 50, 1300);
		
		
		//System.out.println(m1 + "\n" + semHoraExtra + "\n" + comHoraExtra + "\n" + comissionado + "\n" + baseMaisComissao);
		//System.out.println(comHoraExtra.getSalarioBruto() - semHoraExtra.getSalarioBruto());
		
		ArrayList<Empregado> empregados = new ArrayList<>();
		
		empregados.add(new Empregado("Mensalista", "com asdasda", "cpf", m1)); //m1
		empregados.add(new Empregado("semHoraExtra", "nao tem", "cpf", semHoraExtra)); //semHoraExtra
		empregados.add(new Empregado("ComHoraExtra", "com hora extra", "cpf", comHoraExtra)); //comHoraExtra
 		empregados.add(new Empregado("Comissionado" , "comissionado", "cpf", comissionado)); //comissionado
		empregados.add(new Empregado("BaseMaisComissao" , "tem a base e a comissao", "cpf", baseMaisComissao)); // baseMaisComissao
		for(Empregado emp : empregados) {
			System.out.println(emp);
			
		}
		
		//Fatura fat = new Fatura(30, 2);
		/*	
		ArrayList<Pagavel> pagar = new ArrayList<>();
		pagar.add(fat);
		pagar.addAll(empregados);
		pagar.add(new Fatura(30, 2));
		
		
		
		for(Pagavel pag : pagar) {
			
			if(pag instanceof Fatura) {
				System.out.println("Fatura do item: " + ((Fatura) pag).getCodigoItem() + " Total devido: " + pag.getTotalDevido());
			}
			if (pag instanceof Empregado) {
				System.out.println("Nome: " + ((Empregado) pag).getNome() + "Total devido: " + pag.getTotalDevido());
			}
			
		}
		*/
		//TributavelSC.ESTADO
		

	}	

}
