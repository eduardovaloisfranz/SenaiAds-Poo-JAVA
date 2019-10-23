package exception;

public class CodigoDescricaoTest {
	public static void main(String[] args) {
	
		CodigoDescricao um = new CodigoDescricao("legal", 0);
		System.out.println(um);
		CodigoDescricao dois = new CodigoDescricao("legal", 1);
		System.out.println(dois);
		
		CodigoDescricao tres = null;
		try {			
			tres = new CodigoDescricao(null, 2);	
		}catch(IllegalArgumentException e) {
			System.out.println("algo de erado não esta certo: " + e.getLocalizedMessage());
		}
		
		System.out.println(tres);
	}
}
