package herancaInicio;

public class Objeto{
	
	private String descricao;
	
	
	public Objeto(String descricao) {
		super();
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "subclasse " + this.descricao;
	}
	//public Objeto(int x) {
		//this();
	//}
}
