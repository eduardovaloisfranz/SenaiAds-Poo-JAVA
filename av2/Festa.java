package av2;

import java.util.ArrayList;

public class Festa {
	private Pessoa organizador;
	private String motivo;
	private ArrayList<Convidado> convidados = new ArrayList<>();
	public Festa(String motivo) {
		this.motivo = motivo;
	}
	public void setOrganizador(Pessoa organizador) {
		this.organizador = organizador;
	}
	
	public void imprimirConvites() {
		for(Convidado convidado : convidados) {
			System.out.println("Ola, " + convidado.getPessoaConvidada().getNome() + "!\nConto com a sua presença na festa " + this.motivo + ".\nAtt, " + this.organizador.getNome());
		}
	}
	
	public Integer getQtdeConvidados() {
		return this.convidados.size();//porque percorrer o array com size ja retorna o tamanho total, digo isso caso entenda que isso nao seja a forma correta de se obter a quantidade total
	}
	public Integer getQtdeConvidados(Sexo sexo) {
		Integer qtdSexo = 0;
		if(sexo == Sexo.MASCULINO) {
			for(Convidado convidado : convidados) {
				if(convidado.getPessoaConvidada().getSexo() == Sexo.MASCULINO) {
					qtdSexo++;
				}
			}
			return qtdSexo;
		}
		else if (sexo == Sexo.FEMININO) {
			for(Convidado convidado : convidados) {
				if(convidado.getPessoaConvidada().getSexo() == Sexo.MASCULINO) {
					qtdSexo++;
				}
			}			
			return qtdSexo;
		}
		return null;
		
	}
	public Integer getQtdePessoasConfirmadas(Sexo sexo) {
		Integer qtdSexoConfirmado = 0;
		if(sexo == Sexo.MASCULINO) {
			for(Convidado convidado : convidados) {
				if(convidado.getPessoaConvidada().getSexo() == sexo.MASCULINO) {
					if(convidado.getConfirmacao() == true) {
						qtdSexoConfirmado++;
					}
				}
			}
			return qtdSexoConfirmado;
		}else if(sexo == Sexo.FEMININO) {
			for(Convidado convidado : convidados) {
				if(convidado.getPessoaConvidada().getSexo() == sexo.FEMININO) {
					if(convidado.getConfirmacao() == true) {
						qtdSexoConfirmado++;
					}
				}
			}
			return qtdSexoConfirmado;
		}
		
		return null;
	}
	
	public Integer getQtdePessoasConfirmadas() {
		Integer qtdPessoasConfirmadas = 0;
		for(Convidado convidado : convidados) {
			if(convidado.getConfirmacao() == true) {
				qtdPessoasConfirmadas++;
			}
		}
		
		
		return qtdPessoasConfirmadas;
	}
	
	public void convidar(Pessoa pessoa, boolean acompanhado, boolean confirmado) {
			this.convidados.add(new Convidado(pessoa, acompanhado, confirmado));
	}
	
}
