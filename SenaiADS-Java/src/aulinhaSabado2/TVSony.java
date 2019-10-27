package aulinhaSabado2;

public class TVSony extends TV {

	public TVSony(int volumeMaximo, int canalMinimo, int canalMaximo) {
		super(volumeMaximo, canalMinimo, canalMaximo);		
	}
	
	public void modoPretoEBranco() {
		System.out.println("Sua tv esta em preto e branco! \n(como eu nao sei, mas deveria estar)");
	}

}
