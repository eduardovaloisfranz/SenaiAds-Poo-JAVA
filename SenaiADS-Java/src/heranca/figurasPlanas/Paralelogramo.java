package heranca.figurasPlanas;

public abstract class Paralelogramo extends Forma2d{
	private double ladoA; 
	private double ladoB;
	public Paralelogramo(String nome, double ladoA, double ladoB) {
		super(nome);
		this.ladoA = ladoA;
		this.ladoB = ladoB;		
	}
	
	@Override
	public final double getPerimetro() {
		return (this.ladoA + this.ladoB);
	}
	@Override
	public final double getArea() {		
		return this.ladoA * this.ladoB;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome do quadrado: " + super.getNome() + " possui �rea: " +  getArea() + " possui o perimetro" + getPerimetro(); 
	}
	protected double getLadoA() {
		return this.ladoA;
	}
	protected double getLadoB() {
		return this.ladoB;
	}
}
