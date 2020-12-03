
public abstract class Conta  {
	private String nroConta;
	private double saldo;
	
	public Conta( String nroConta, double saldo) {
		this.nroConta=nroConta;
		this.saldo=saldo;
     }
	
	 public abstract boolean saque(double valor); 
		 
	 public abstract boolean depositar(double valor); 
	 
	 public abstract boolean transferir(double valor);
			 

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
