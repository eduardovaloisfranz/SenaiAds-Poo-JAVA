package av2;

public enum Sexo {
	MASCULINO("Masculino"),
	FEMININO("Feminino");
	private final String sexo;
	
	private Sexo(String sexo) {
		this.sexo = sexo;
	}
	public String getSexo() {
		return sexo;
	}
}
