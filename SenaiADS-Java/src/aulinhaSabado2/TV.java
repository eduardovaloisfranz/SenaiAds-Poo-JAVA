package aulinhaSabado2;

public class TV implements ITV{

	private String serial;
	private boolean ligado;
	private int volumeAtual;
	private int volumeAnterior = volumeAtual -1;
	private int maxVolume;	
	private int minVolume;
	private int minCanal;
	private int maxCanal;
	private int canalAtual;
	
	public TV(int volumeMaximo, int canalMinimo, int canalMaximo) {
		this.maxVolume = volumeMaximo;
		this.minCanal = canalMinimo;
		this.maxCanal = canalMaximo;
		this.minVolume = 0;		
	}
	
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
		if(this.volumeAtual < this.maxVolume) {
			this.volumeAtual++;			
		}

		
	}

	@Override
	public void diminuirVolume() {
		if(this.volumeAtual > 0) {
			this.volumeAtual--;				
		}

		
	}

	@Override
	public void diminuirCanal() {
		if(this.canalAtual > 0) {
			this.canalAtual--;			
		}

		
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
		if(this.canalAtual < this.maxCanal) {
			this.canalAtual++;
		}		

		
	}

}
