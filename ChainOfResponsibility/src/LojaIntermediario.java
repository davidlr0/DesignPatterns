
public class LojaIntermediario extends LojaChain{

	public LojaIntermediario() {
		super(NivelLoja.intermediario);
	}

	@Override
	public void mostraItens() {
		System.out.println("Itens disponíveis na loja intermediario:"
				+ "\nItem básico 1, Item básico 2, Item básico 3"
				+ "\nItem raro 1, Item raro 2, Item raro 3\n");
		
	}
	
}
