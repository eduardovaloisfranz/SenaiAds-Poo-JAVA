package aulinhaSabado2;

public class ControleSamsung extends ControleTv{	
	public ControleSamsung(TVSamsung tv) {
		super(tv);
	}
	public void timer(int tempo) {
		if(super.GetTv() instanceof TVSamsung) {
			((TVSamsung) super.GetTv()).setTimer(tempo);
		}
	}
	
}
