package composicao;

public enum TipoLogradouro {
	rua("Rua" , "R."),
	avenida("Avenida" , "Av."),
	servidao("Servidão", "Srv.");
	
	private final String descricao;
	private final String abreviatura;
	
	private TipoLogradouro(String descricao, String abreviatura) {
		this.descricao = descricao;
		this.abreviatura = abreviatura;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getAbreviatura() {
		return abreviatura;
	}
	
}
