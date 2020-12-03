
public class ContaCorrente extends Conta{
	private String nruConta;
	private double Saldo;
	
	
   public ContaCorrente(String nroConta, double saldo) {
		super(nroConta, saldo);
		this.nruConta=nroConta;
		this.Saldo=saldo;
	}

   @Override
	public boolean saque (double valor) {
		 	
		if(valor <=this.Saldo) {

		this.Saldo = this.Saldo - valor;
		System.out.println("Saque realizado com sucesso!");
		return true;}

		System.out.println("Saque não realizado! Valor insuficiente!");
		return false;
		}
		 
   @Override
	public boolean depositar(double valor) {
	if(valor > 0) {

	this.Saldo+= valor;
	System.out.println("Deposito realizado com sucesso!");
	return true;
	}

	System.out.println("Deposito não realizado! Valor deve ser superior a 0");
	return false;
	}
   
   @Override
	public boolean transferir( double valor) {
		if(valor > 0 && valor < this.Saldo) {

		this.Saldo -=valor;
		
		System.out.println("Transfência realizada com sucesso!");
		return false;}

		System.out.println("Transferência não realizada! Saldo da conta oriente insuficiente! ");
		return false;}

	public double ConsultaSaldo() {
		System.out.println(this.Saldo);
		return this.Saldo;
		
	}
	

	public String getNruConta() {
		return nruConta;
	}



	public void setNruConta(String nruConta) {
		this.nruConta = nruConta;
	}



	public double getSaldo() {
		return Saldo;
	}



	public void setSaldo(double saldo) {
		Saldo = saldo;
	}







}

