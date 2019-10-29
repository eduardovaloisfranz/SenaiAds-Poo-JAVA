package aulinhaSabado2;

import java.util.ArrayList;

public class SalaMain {
	public static void main(String[] args) {
		//int volumeMaximo, int canalMinimo, int canalMaximo
		TV minhaTv = new TV(50, 0, 4);		
		ControleTv ControleDaTv = new ControleTv(minhaTv);		
		System.out.println(minhaTv.getCanalAtual());			
		for(int i = 0; i < 7; i++) {
			ControleDaTv.channelUp();
		}	
		System.out.println(minhaTv.getCanalAtual());
		ArrayList<ITV> tvs = new ArrayList<>();
		ArrayList<IControleTV> controles = new ArrayList<>();
		tvs.add(minhaTv);
		tvs.add(new TVSamsung(20, 0, 30));
		tvs.add(new TVSony(30, 3, 90));
		controles.add(ControleDaTv);
	    controles.add(new ControleSamsung((TVSamsung) tvs.get(1)));
		controles.add(new ControleSony((TVSony) tvs.get(2)));
		controles.get(1).channelDown();
		controles.get(1).channelDown();
		for(ITV tv: tvs) {
			System.out.println(tv.toString());
		}
		System.out.println(tvs.get(1) instanceof TVSamsung);
		System.out.println(tvs.get(2) instanceof TV);
		
		IControleTV controleSamsung = new ControleSamsung(new TVSamsung(50, 0, 4));
		
	
	
		
		
		
	
	}
}

