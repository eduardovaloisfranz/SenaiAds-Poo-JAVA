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
	public String toString() {
		// TODO Auto-generated method stub
		String statusTv = "";
		if(this.isLigado()) {
			statusTv = "Ligado";
		}else {
			statusTv = "Desligado";
		}
		return "A Tv possui serial: " + this.getSerial() + " Encontra-se " + statusTv + " Esta no volume: " + this.getVolumeAtual() +
				"O volume anterior � : " + this.getVolumeAnterior() + " o volume maximo �: " + this.getMaxVolume() +
				" o volume minimo �: " + this.getMinVolume() + " e atualmente esta no canal: " + this.getCanalAtual();
			
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	
	public String getSerial() {
		return serial;
	}

	public boolean isLigado() {
		return ligado;
	}

	public int getVolumeAtual() {
		return volumeAtual;
	}

	public int getVolumeAnterior() {
		return volumeAnterior;
	}

	public int getMaxVolume() {
		return maxVolume;
	}

	public int getMinVolume() {
		return minVolume;
	}

	public int getMinCanal() {
		return minCanal;
	}

	public int getMaxCanal() {
		return maxCanal;
	}

	public int getCanalAtual() {
		return canalAtual;
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
		} else if(this.canalAtual == 0) {
			this.canalAtual = maxCanal;
		}

		
	}

	@Override
	public void comSemSom() {
		int volumeAtual = 0;
		if(this.volumeAtual > 0) {
			this.volumeAtual = 0;
			volumeAtual = this.volumeAtual;
		}else {
			this.volumeAtual = volumeAtual;
		}
		
	}

	@Override
	public void aumentarCanal() {
		if(this.canalAtual <= this.maxCanal) {
			this.canalAtual++;
		}else if (this.canalAtual > this.maxCanal) {
			this.canalAtual = this.minCanal;
		}
		
	}

}
