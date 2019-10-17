package interfaces;

public class Fatura implements Pagavel{
	private static int idAux = 0;
	private int codigoItem, quantidade;
	private double valorItem;
	
	private Fatura() {
		Fatura.idAux++;
		this.codigoItem = idAux;
	}
	public Fatura(int quantidade, double valorItem) {
		this();
		this.quantidade = quantidade;
		this.valorItem = valorItem;		
	}
	@Override
	public double getTotalDevido() {
		return this.valorItem * this.quantidade;
	}
	public int getCodigoItem() {
		return this.codigoItem;
	}
	
}
