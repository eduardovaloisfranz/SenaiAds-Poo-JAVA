package composicao;

public class Endereco {
	private String nome;
	private int numero;
	private String logradouro;
	private String complemento;
	private Cidade cidade;
	private Pessoa pessoa;
	private TipoLogradouro tp;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome endereco: " + this.nome + " Número: " + this.numero + " Logradouro: " + tp.getDescricao() + " " + this.logradouro + " Cidade: " + this.cidade.getNomeCidade() + " Estado: " + this.cidade.getNomeEstado() + " Pais: " + this.cidade.getEstado().getPais().getNomePais();
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Pessoa getPessoa() {
		return this.pessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setTipoLogradouro(TipoLogradouro tp) {
		this.tp = tp;
	}
	public TipoLogradouro getTipoLogradouro() {
		return this.tp;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
}
