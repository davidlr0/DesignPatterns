
public class Main {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente("236",5000);
		conta.saque(500);
		conta.getSaldo();
		conta.depositar(500);
		conta.getSaldo();
		conta.transferir(200);
		conta.getSaldo();
		
		ContaPoupança poupa = new ContaPoupança("254",3000);
		poupa.saque(500);
		poupa.getSaldo();
		poupa.depositar(500);
		poupa.getSaldo();
		poupa.transferir(3000);
		poupa.getSaldo();

	}

}
