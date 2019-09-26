package aulinhaSabado;

public enum TipoObra {
	livro("Livro"),
	cd("Cd"),
	dvd("Dvd"),
	colecao("Colecao");
	
	private final String tipo;
	private TipoObra(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipoObra() {
		return tipo;
	}
}
