package heranca;

public class Quadrado extends Forma2d {
	private int ladoA;
	private int ladoB;
	
	public Quadrado(int ladoA, int ladoB, String nome) {
		super(nome);
		this.ladoA = ladoA;
		this.ladoB = ladoB;		
	}
	
	public int getArea() {
		return ladoA * ladoB;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome do quadrado: " + super.getNome() + " possui Área: " + getArea();
	}
}
