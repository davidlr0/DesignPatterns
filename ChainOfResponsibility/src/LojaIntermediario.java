
public class LojaIntermediario extends LojaChain{

	public LojaIntermediario() {
		super(NivelLoja.intermediario);
	}

	@Override
	public void mostraItens() {
		System.out.println("Itens dispon�veis na loja intermediario:"
				+ "\nItem b�sico 1, Item b�sico 2, Item b�sico 3"
				+ "\nItem raro 1, Item raro 2, Item raro 3\n");
		
	}
	
}
