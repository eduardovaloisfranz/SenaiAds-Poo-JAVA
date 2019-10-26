package aulinhaSabado2;

public class SalaMain {
	public static void main(String[] args) {
		//int volumeMaximo, int canalMinimo, int canalMaximo
		TV minhaTv = new TV(50, 0, 80);
		
		ControleTv ControleDaTv = new ControleTv(minhaTv);
		
		System.out.println(minhaTv.getCanalAtual());
		
		
		for(int i = 0; i < 54; i++) {
			ControleDaTv.channelUp();
		}
		
		
		
		System.out.println(minhaTv.getCanalAtual());
		
		
		
	}
}
