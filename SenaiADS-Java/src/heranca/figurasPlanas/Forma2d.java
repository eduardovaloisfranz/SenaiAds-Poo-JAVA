package heranca.figurasPlanas;

import heranca.classes.Forma;

//abstract - bloqueia instancias deste objeto
public abstract class Forma2d extends Forma {

	int xyz;
	public Forma2d(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	public abstract double getPerimetro();

	public abstract double getArea();

}
