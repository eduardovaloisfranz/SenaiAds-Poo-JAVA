package heranca.app;

import heranca.classes.Forma;
import heranca.figurasPlanas.Forma2d;
import heranca.figurasPlanas.Quadrado;
import heranca.figurasPlanas.Triangulo;
import heranca.figurasPlanas.TrianguloEquilatero;

public class HerancaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Quadrado q1 = new Quadrado("Quadrado1" , 5);
		Retangulo r1 = new Retangulo("Retangulo1" , 5, 5);
		TrianguloEquilatero teq = new TrianguloEquilatero("TrianguloEquilatero", 5);
		TrianguloIsoceles tiso = new TrianguloIsoceles("TrianguloIsoceles", 5, 5);
		TrianguloEscaleno tesc = new TrianguloEscaleno("TrianguloEscaleno", 5, 5, 5);
		

		System.out.println(q1 + "\n" + r1 + " \n" + teq + " \n" + tiso + "\n" + tesc);*/
		Forma f = new Quadrado("Nome quadrado", 5);// f � uma referencia de um quadrado, logo � um quadrado, n�o � uma referencia da forma
		//Forma f = new Forma("Forma generica");	
		
		System.out.println(((Quadrado) f).getArea());
		//Triangulo t1 = new Triangulo("nome", 1, 1, 1);
		Forma2d f2d = new Quadrado("Forma2d <-- Quadrado", 13);
		System.out.println(f2d.getArea());
		
		Triangulo t = new TrianguloEquilatero("", 2);
		
		Quadrado q1 = new Quadrado("Quadrado de verdade", 3);
		Quadrado q2 = new Quadrado("Quadrado de verdade", 3);
		System.out.println(q1 == q2);
		System.out.println(q1.equals(q2));
		System.out.println(q1.getLado());
		
		//Paralelogramo p2 = new 
		
		
	}

}
