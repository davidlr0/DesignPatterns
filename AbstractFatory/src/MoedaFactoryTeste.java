
public class MoedaFactoryTeste {

	public static void main(String[] args) throws IllegalAccessException {
		
		MoedaFactory moeda = Moeda.CriarMoeda(Pais.Brasil);
		System.out.println(moeda.Simbolo());
		
		MoedaFactory Dinheiro = Moeda.CriarMoeda(Pais.EUA);
		System.out.println(Dinheiro.Simbolo());
		
	
	}

}
