
public class ContaPoupan�a extends Conta{

	private String nroConta;
	private double saldo;
	
	


	 public ContaPoupan�a(String nroConta, double saldo) {
			super(nroConta, saldo);
			this.nroConta=nroConta;
			this.saldo=saldo;
		}

    @Override
	public boolean saque (double valor) {
		 
		
		if(valor <=this.saldo) {

		this.saldo = this.saldo - valor;
		System.out.println("Saque realizado com sucesso!");
		return true;}

		System.out.println("Saque n�o realizado! Valor insuficiente!");
		return false;
		}
		 
    @Override
	public boolean depositar(double valor) {
	if(valor > 0) {
    
	this.saldo+= valor;
	System.out.println("Deposito realizado com sucesso!");
	return true;
	}

	System.out.println("Deposito n�o realizado! Valor deve ser superior a 0");
	return false;
	}
    
    @Override
	public boolean transferir( double valor) {
		if(valor > 0 && valor <= this.saldo) {

		this.saldo -=valor;
		
		System.out.println("Transf�ncia realizada com sucesso!");
		return false;}

		System.out.println("Transfer�ncia n�o realizada! Saldo da conta  insuficiente! ");
		return false;}

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
