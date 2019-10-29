package aulinhaSabado2;

public class ControleSony extends ControleTv {	
	public ControleSony(TVSony tv) {		
		super(tv);		
	}
	
	public void pretoEBranco() {
		((TVSony) super.GetTv()).modoPretoEBranco();		
	}
	
	

}
