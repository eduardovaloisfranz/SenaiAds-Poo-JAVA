package heranca.figurasPlanas;

public final class Quadrado extends Paralelogramo {
	
	
	public Quadrado(String nome, double lado) {
		//super(nome, ladoA);		
		super(nome, lado, lado);
		//super.xyz;
			
	}	
	public double getLado(){
		return this.getLadoA();
	}
	@Override
	public boolean equals(Object outro) {
		if(outro == null) {
			return false;
		}
		if(outro == this) {
			return true;
		}
		if(outro instanceof Quadrado) {//certeza que o outro � um quadrado
			return this.getLadoA() == ((Quadrado) outro).getLadoA();		
			
		}
		return false;
	}
	
}
