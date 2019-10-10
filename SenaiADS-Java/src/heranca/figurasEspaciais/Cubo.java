package heranca.figurasEspaciais;

public final class Cubo extends Forma3d{
	private int aresta;
	public Cubo(int aresta, String nome) {
		super(nome);
		this.aresta = aresta;
	}
	@Override
	public double getVolume() {
		return 0;
	}
}
