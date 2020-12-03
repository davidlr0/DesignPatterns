
public class Main {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente("236",5000);
		conta.saque(500);
		conta.ConsultaSaldo();
		conta.depositar(500);
		conta.ConsultaSaldo();
		conta.transferir(200);
		conta.ConsultaSaldo();
		
		ContaPoupança poupa = new ContaPoupança("254",3000);
		poupa.saque(500);
		poupa.ConsultaSaldo();
		poupa.depositar(500);
		poupa.ConsultaSaldo();
		poupa.transferir(3000);
		poupa.ConsultaSaldo();
		
	}

}
