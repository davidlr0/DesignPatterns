
public class LojaAvancado extends LojaChain{

	public LojaAvancado() {
		super(NivelLoja.avancado);
	}

	@Override
	public void mostraItens() {
		System.out.println("Itens disponíveis na loja avançado:"
				+ "\nItem básico 1, Item básico 2, Item básico 3"
				+ "\nItem raro 1, Item raro 2, Item raro 3"
				+ "\nITem lendário 1, Item lendário 2, Item lendário 3\n");
		
	}

}
