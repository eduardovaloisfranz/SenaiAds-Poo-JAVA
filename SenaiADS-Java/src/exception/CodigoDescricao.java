package exception;

public class CodigoDescricao {
	private String descricao;
	private int codigo;
	public CodigoDescricao(String descricao, int codigo) throws IllegalArgumentException{ {
		if (descricao == null)
			throw new IllegalArgumentException("Descricao nao pode ser nula");
		}
		this.descricao = descricao;
		this.codigo = codigo; 
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return codigo + " : " + descricao; 
	}
	
}
