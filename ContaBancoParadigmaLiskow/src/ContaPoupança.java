
public class ContaPoupança extends Conta{


	public ContaPoupança(String nroConta, double saldo) {
		super(nroConta, saldo);
	}

	@Override
	public boolean saque (double valor) {
		if(valor <=super.getSaldo()) {

			super.setSaldo(super.getSaldo() - valor); 
			System.out.println("Saque realizado com sucesso!");
			return true;}

		System.out.println("Saque não realizado! Valor insuficiente!");
		return false;
	}

	@Override
	public boolean depositar(double valor) {
		if(valor > 0) {

			super.setSaldo(super.getSaldo() + valor);
			super.setSaldo((super.getSaldo() * 0.5) + super.getSaldo());
			System.out.println("Deposito realizado com sucesso!");
			return true;
		}

		System.out.println("Deposito não realizado! Valor deve ser superior a 0");
		return false;
	}

	@Override
	public boolean transferir( double valor) {
		if(valor > 0 && valor < super.getSaldo()) {

			super.setSaldo(super.getSaldo() - valor);

			System.out.println("Transfência realizada com sucesso!");
			return false;}

		System.out.println("Transferência não realizada! Saldo da conta oriente insuficiente! ");
		return false;
	}

}
