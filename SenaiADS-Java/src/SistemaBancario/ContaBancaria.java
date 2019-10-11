package sistemaBancario;

public abstract class ContaBancaria extends Titular {
	//private Pessoa proprietarioConta;
	private double saldo;
	private Titular titular;
	private Agencia agencia;
	private double limite;
	public ContaBancaria(double saldoInicial, Titular titular, double limite, String nome) {
		super(nome);		
		this.titular = titular;
		this.saldo = saldoInicial;
	}
	public double getSaldo() {
		return this.saldo;
	}
	//saque deposito
	public void saque(double valor) {
				
		if(valor < saldo) {
			this.saldo -= valor;	
		} else if(valor < this.limite) {
			this.saldo -= valor;
		}else {
			this.saldo -= 0;
		}
	}
	public void deposito(double valor) {
		this.saldo+= valor;
	}
	public Titular getTitular() {
		return this.titular;
	}
	public Agencia getAgencia() {
		return this.agencia;
	}
}