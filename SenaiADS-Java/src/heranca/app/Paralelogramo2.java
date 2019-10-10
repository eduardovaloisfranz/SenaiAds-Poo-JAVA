package heranca.app;

import heranca.figurasPlanas.Paralelogramo;

public class Paralelogramo2 extends Paralelogramo{
	public Paralelogramo2(String nome, double ladoA, double ladoB) {
		// TODO Auto-generated constructor stub
		super("nome", ladoA, ladoB);
		//nao acessa getLadoA pois esta em outro pacote e se torna invisivel
		//super.getLadoA();
		
		//com o protected visualiza pois garante que para quem estende a classe esta visivel e permite o uso em outro package
		
	}
}
