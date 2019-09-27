package composicao;

public class EnderecoMain {

	public static void main(String[] args) {
		Pais brasil = new Pais("Brasil");
		
		
		
		
		Estado sc = new Estado("Santa catarina", "SC",  brasil);
		brasil.getEstadosDoPais();
		// sc contem atributo do tipo PAIS
		//System.out.println(sc.getNomePaisDoEstado());
		System.out.println(sc.getPais().getNomePais());
		//DEVOLVE O PAIS do estado
		Cidade bnu = new Cidade("Blumenau", sc);
		//sc.adicionarCidade(bnu);
		sc.getCidadesDoEstado();
		System.out.println(bnu.getEstado().getPais().getNomePais()); 
		
		Cidade itajai = new Cidade("Itajai", sc);
		
		Endereco end1 = new Endereco();
		TipoLogradouro tp = TipoLogradouro.rua;
		end1.setCidade(bnu);
		end1.setComplemento("proximo de algo");
		end1.setNumero(100);
		end1.setNome("NOMENOME");
		end1.setTipoLogradouro(TipoLogradouro.rua);
		end1.setLogradouro("Carlos eugenio erbs");
		
		System.out.println(end1);
		Pessoa p1 = new Pessoa();
		p1.setEndereco(end1);
		p1.addEndereco(end1);
		p1.setNome("Marcolino pereira");
		p1.setIdade(8001);
		p1.addDependente("Meu Filho", 3);
		p1.addDependente("Minha Filha", 3);
		//p1.addDependente("asd", 3);
		//p1.addDependente("asd", 3);
		System.out.println(p1.getDependentes().get(0).getPai().getNome());
		p1.getDependentes().get(0).getPai().setPai(p1);
		System.out.println("Pai de " + p1.getDependentes().get(0).getNome() + " =  " + p1.getDependentes().get(0).getPai().getNome() +"\n\n\n");
		
		p1.listarDependentes();
		
		
		Pessoa p2 = new Pessoa();
		p1.addDependente(p2);
		
		//p1.listarDependentes();
		Endereco endereco2 = new Endereco();
		endereco2.setCidade(itajai);
		endereco2.setComplemento("Próximo a alguma coisa");
		endereco2.setLogradouro("Dos caçadores");
		endereco2.setNome("Nao sei o nome");
		endereco2.setNumero(1300);
		endereco2.setTipoLogradouro(TipoLogradouro.avenida);
		endereco2.setPessoa(p2);
		
		p2.setNome("P2");
		p2.setIdade(10);
		p2.setEndereco(endereco2);
		p2.setPai("pai", 57);
		p2.setMae("mae", 59);
		p2.addDependente(p1);
		p2.addDependente(p2);
		p2.addEndereco(end1);
		p2.addEndereco(endereco2);
		p2.setEndereco(end1);
		p2.getEnderecos();
		
		
		System.out.println("\n\n\nLista enderecos da pessoa: " + p2);
		p2.getEnderecos();
		System.out.println("\n\n\n" + endereco2.getPessoa());
		
		System.out.println("\n\n\n" + p1.getEndereco() + "\n" + p2.getEndereco());
		
	}

}
 