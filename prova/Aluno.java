package prova;

public class Aluno {
	private String nome;
	private int idade;
	private int matricula;
	private static int ultimaMatricula = 9990;
	
	public Aluno(String nomeAluno, int idade) {
		this.nome = nomeAluno;
		this.idade = idade;
		//System.out.println(matricula);
		ultimaMatricula += 10;
		this.matricula = ultimaMatricula;
		//System.out.println(matricula);
	}
	public String getNome() {
		return this.nome;
	}
	public int getIdade(){
		return this.idade;
	}
	public int getMatricula() {
		return matricula;
	}
	public void alterarInformacoes(String novoNome, int novaIdade) {
		this.nome = novoNome;
		this.idade = novaIdade;
	}
	public String getMaioridade() {
		String retorno = "";
		if(this.idade < 18) {
			retorno = "Aluno menor de idade!";
		}else {
			retorno = "Aluno maior de idade!";
		}
		
		return retorno;
	}
	
}
