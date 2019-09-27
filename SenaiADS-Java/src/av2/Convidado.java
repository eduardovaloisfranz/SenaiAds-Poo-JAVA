package av2;

public class Convidado {
	private Pessoa pessoaConvidada;
	private boolean temAcompanhante;
	private boolean confirmouPresenca;
	
	public Convidado(Pessoa pessoaConvidada, boolean temAcompanhante, boolean confirmouPresenca) {
		this.pessoaConvidada = pessoaConvidada;
		this.temAcompanhante = temAcompanhante;
		this.confirmouPresenca = confirmouPresenca;
	}
	public Pessoa getPessoaConvidada() {
		return pessoaConvidada;
	}
	
	public boolean getTemAcompanhante(){
		return this.temAcompanhante;
	}
	public boolean getConfirmacao() {
		return this.confirmouPresenca;
	}
	
	
	
}
