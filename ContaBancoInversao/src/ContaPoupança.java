
public class ContaPoupan�a extends Conta{

	 public ContaPoupan�a(String nroConta, double saldo) {
			super(nroConta, saldo);
		}


    @Override
	public boolean depositar(double valor) {
	if(valor > 0) {
    
	super.setSaldo((super.getSaldo() * 1.05) + valor);
	System.out.println("Deposito realizado com sucesso!");
	return true;
	}

	System.out.println("Deposito n�o realizado! Valor deve ser superior a 0");
	return false;
	}
    
}