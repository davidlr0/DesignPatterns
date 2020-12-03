
public class Main {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente("236",5000);
		conta.saque(500);
		System.out.println(conta.getSaldo());
		conta.depositar(500);
		System.out.println(conta.getSaldo());
		conta.transferir(200);
		System.out.println(conta.getSaldo());
		
		ContaPoupança poupa = new ContaPoupança("254",3000);
		poupa.saque(500);
		System.out.println(poupa.getSaldo());
		poupa.depositar(500);
		System.out.println(poupa.getSaldo());
		poupa.transferir(3000);
		System.out.println(poupa.getSaldo());

	}

}
