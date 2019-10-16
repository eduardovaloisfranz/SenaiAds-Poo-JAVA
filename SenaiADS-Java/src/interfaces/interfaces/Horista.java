package interfaces;

public class Horista extends Empregado{
	private double salarioHora, horasTrabalhadas;	
	public Horista(String nome, String sobrenome, String cpf, double salarioHora, double horasTrabalhadas) {
		super(nome, sobrenome, cpf);
		this.salarioHora = salarioHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	@Override
	public double getSalarioBruto() {
		if(this.horasTrabalhadas <= 44) {
			return (this.salarioHora * this.horasTrabalhadas) * 5;	
		}
		if(this.horasTrabalhadas > 44) {
			double salarioBase = (this.salarioHora * 44) * 5; 
			
			double horasAcima = this.horasTrabalhadas - 44;
			double valorPorHoraExtra = this.salarioHora + (this.salarioHora * 0.5);			
			return salarioBase + (horasAcima * valorPorHoraExtra);
					
		}		
		return 0;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " E meu salario é: " + getSalarioBruto();
	}
	
	

}
