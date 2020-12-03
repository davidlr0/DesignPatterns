
public abstract class ContaJuridica  {
	private String nroConta;
	private double saldo;



	public ContaJuridica(String nroConta, double saldo) {
		super();
		this.nroConta = nroConta;
		this.saldo = saldo;
	}

	public abstract boolean saque(double valor,double ChequeEspecial);

	public abstract boolean depositar(double valor);

	public abstract boolean transferir( double valor);	 

	public String getNroConta() {
		return nroConta;
	}

	public void setNroConta(String nroConta) {
		this.nroConta = nroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
