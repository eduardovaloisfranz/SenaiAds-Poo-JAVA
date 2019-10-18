package interfaces2;

public class Horista implements ModeloPagamento{
	private double salarioHora, horasTrabalhadas;	
	public Horista(double salarioHora, double horasTrabalhadas) {		
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
		return "E meu salario é: " + getSalarioBruto();
	}
	
	

}
