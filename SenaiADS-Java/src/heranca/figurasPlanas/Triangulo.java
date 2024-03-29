package heranca.figurasPlanas;

public abstract class Triangulo extends Forma2d {
	private double ladoA;
	private double ladoB;
	private double ladoC;	
	
	
	public Triangulo(String nome, double ladoA, double ladoB, double ladoC) {
		super(nome);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		
	}
	@Override
	public final double getPerimetro() {
		return (ladoA + ladoB + ladoC) / 2;
	}
	@Override 
	public final double getArea() {
		double p = this.getPerimetro();
		return Math.sqrt(p*((p - ladoA) * (p - ladoB) * (p - ladoC)));
	}
	
	@Override
	public final String toString() {
		// TODO Auto-generated method stub
		return "Nome do tri�ngulo: " + super.getNome() + " possui Per�metro: " + getPerimetro();
	}
}
