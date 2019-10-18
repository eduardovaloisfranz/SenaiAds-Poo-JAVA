package interfaces2;

public interface Tributavel {
	
	public double getImpostoDevido();
	public default double getINSS() {
		return 0;
	}
}
