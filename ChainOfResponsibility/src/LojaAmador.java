
public class LojaAmador extends LojaChain {

	public LojaAmador() {
		super(NivelLoja.amador);
	}

	@Override
	public void mostraItens() {
		System.out.println("Itens dispon�veis na loja amador:"
				+ "\nItem b�sico 1, Item b�sico 2, Item b�sico 3\n");
		
	}

}
