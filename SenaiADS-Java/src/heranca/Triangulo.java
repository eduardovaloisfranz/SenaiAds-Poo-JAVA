package heranca;

public class Triangulo extends Forma2d {
	private int ladoA;
	private int ladoB;
	private int ladoC;
	
	public Triangulo(int ladoA, int ladoB, int ladoC, String nome) {
		super(nome);
		this.ladoA = ladoA;
		this.ladoB = ladoB;		
		this.ladoC = ladoC;
	}
	public int getPerimetro() {
		return ladoA + ladoB + ladoC;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome do triângulo: " + super.getNome() + " possui Perímetro: " + getPerimetro();
	}
}
