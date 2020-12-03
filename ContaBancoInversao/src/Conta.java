
public abstract class Conta  {
	private String nroConta;
	private double saldo;
	
	public Conta( String nroConta, double saldo) {
		this.nroConta=nroConta;
		this.saldo=saldo;
     }
	
	 public boolean saque(double valor) {
		 if(valor <=this.saldo) {

				this.saldo = this.saldo - valor;
				System.out.println("Saque realizado com sucesso!");
				return true;}

				System.out.println("Saque não realizado! Valor insuficiente!");
				return false;
				};
				
		 
	 public abstract boolean depositar(double valor); 
	 
	 
	 
	 public  boolean transferir(double valor) {
		 if(valor > 0 && valor <= this.saldo) {

				this.saldo -=valor;
				
				System.out.println("Transfência realizada com sucesso!");
				return false;}

				System.out.println("Transferência não realizada! Saldo da conta insuficiente! ");
				return false;
	 };

	 public double ConsultaSaldo() {
			System.out.println(this.saldo);
			return this.saldo;
			
		}

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
