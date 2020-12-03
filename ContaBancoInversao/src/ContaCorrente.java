
public class ContaCorrente extends Conta{
	
	
   public ContaCorrente(String nroConta, double saldo) {
		super(nroConta, saldo);
	}
	 
   @Override
	public boolean depositar(double valor) {
	if(valor > 0) {

	super.setSaldo(super.getSaldo()+valor);
	System.out.println("Deposito realizado com sucesso!");
	return true;
	}

	System.out.println("Deposito não realizado! Valor deve ser superior a 0");
	return false;
	}

}

