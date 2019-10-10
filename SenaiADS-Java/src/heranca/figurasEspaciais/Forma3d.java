package heranca.figurasEspaciais;

import heranca.classes.Forma;

public abstract class Forma3d extends Forma {
	 public Forma3d(String nome) {
		 super(nome);
	 }
	 
	 public abstract double getVolume();
}
