
public class LojaAmador extends LojaChain {

	public LojaAmador() {
		super(NivelLoja.amador);
	}

	@Override
	public void mostraItens() {
		System.out.println("Itens disponíveis na loja amador:"
				+ "\nItem básico 1, Item básico 2, Item básico 3\n");
		
	}

}
