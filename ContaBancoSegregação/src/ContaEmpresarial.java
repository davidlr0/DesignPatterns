
public class ContaEmpresarial implements SaqueJuridico,Conta {
    
	private String nroConta;
	private double saldo;
	
	public ContaEmpresarial(String nroConta, double saldo) {
		super();
		this.nroConta = nroConta;
		this.saldo = saldo;
	}

	public boolean saque (double valor,double ChequeEspecial) {
		 ChequeEspecial=2000;
		 this.saldo=this.saldo+ChequeEspecial;
		if(valor <=this.saldo) {

		this.saldo = this.saldo - valor;
		System.out.println("Saque realizado com sucesso!");
		return true;}

		System.out.println("Saque não realizado! Valor insuficiente!");
		return false;
		}
		
	
	public boolean depositar(double valor) {
	if(valor > 0) {

	this.saldo+= valor;
	System.out.println("Deposito realizado com sucesso!");
	return true;
	}

	System.out.println("Deposito não realizado! Valor deve ser superior a 0");
	return false;
	}

	
	public boolean transferir( double valor) {
		if(valor > 0 && valor < this.saldo) {

		this.saldo -=valor;
		
		System.out.println("Transfência realizada com sucesso!");
		return false;}

		System.out.println("Transferência não realizada! Saldo da conta oriente insuficiente! ");
		return false;}

	public double ConsultaSaldo() {
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




