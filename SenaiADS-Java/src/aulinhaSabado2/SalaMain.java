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
		ArrayList<TV> tvs = new ArrayList<>();
		ArrayList<ControleTv> controles = new ArrayList<>();
		tvs.add(minhaTv);
		tvs.add(new TVSamsung(20, 0, 30));
		tvs.add(new TVSony(30, 3, 90));
		controles.add(ControleDaTv);
		controles.add(new ControleSamsung(tvs.get(1)));
		controles.add(new ControleSony(tvs.get(2)));
		controles.get(1).channelDown();
		controles.get(1).channelDown();
		for(TV tv: tvs) {
			System.out.println(tv.toString());
		}
			
		
	
	
		
		
		
	
	}
}

