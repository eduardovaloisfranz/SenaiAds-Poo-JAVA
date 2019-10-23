package aulinhaSabado2;

public class TV implements ITV{

	private String serial;
	private boolean ligado;
	private int volumeAtual;
	private int volumeAnterior;
	private int maxVolume;	
	private int minCanal;
	private int maxCanal;
	private int canalAtual;
	

	
	@Override
	public void ligarDesligar() {
		if(this.ligado == true) {
			this.ligado = false;
		}else {
			this.ligado = true;
		}
		
	}

	@Override
	public void aumentarVolume() {
		this.volumeAtual++;
		
	}

	@Override
	public void diminuirVolume() {
		this.volumeAtual--;		
		
	}

	@Override
	public void diminuirCanal() {
		this.canalAtual--;
		
	}

	@Override
	public void comSemSom() {
		if(this.volumeAtual > 0) {
			this.volumeAtual = 0;
		}else {
			this.volumeAtual = 0;
		}
		
	}

	@Override
	public void aumentarCanal() {
		this.canalAtual++;
		
	}

}
