package testew;

public enum TipoObra {
		//dvd, cd, colecao
		dvd("Dvd"),
		cd("Cd"),
		colecao("Colecao");
		
		private final String tipo;
		private TipoObra(String tipo) {
			this.tipo = tipo;
		}
		public String getTipo() {
			return this.tipo;
		}
}
