package aulinhaSabado2;

public class ControleTv implements IControleTV {

	private TV tv;
	public ControleTv(ITV Itv) {
		this.tv = (TV) Itv;
	}
	
	public TV GetTv() {
		return this.tv;
	}
	
	@Override
	public void volumeUp() {
		this.tv.aumentarVolume();
		
	}

	@Override
	public void volumeDown() {
		this.tv.diminuirVolume();
		
	}

	@Override
	public void channelUp() {
		this.tv.aumentarCanal();
		
	}

	@Override
	public void channelDown() {
		this.tv.diminuirCanal();
		
	}

	@Override
	public void onOff() {
		this.tv.ligarDesligar();
		
	}

	@Override
	public void mute() {
		this.tv.comSemSom();
		
	}

}
