package aulinhaSabado2;

public class TVSamsung extends TV{
	public TVSamsung(int volumeMaximo, int canalMinimo, int canalMaximo) {
		super(volumeMaximo, canalMinimo, canalMaximo);
	}
	
	public void setTimer(int tempo) {
		for(int i = 0; i < tempo; i++) {
			System.out.println("Desligando a tv em: " + i + " Segundos!\n");
			if(i == 0) {
				super.ligarDesligar();
			}
		}
	}
	
}
