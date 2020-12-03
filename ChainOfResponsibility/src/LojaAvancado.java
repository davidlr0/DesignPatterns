
public class LojaAvancado extends LojaChain{

	public LojaAvancado() {
		super(NivelLoja.avancado);
	}

	@Override
	public void mostraItens() {
		System.out.println("Itens dispon�veis na loja avan�ado:"
				+ "\nItem b�sico 1, Item b�sico 2, Item b�sico 3"
				+ "\nItem raro 1, Item raro 2, Item raro 3"
				+ "\nITem lend�rio 1, Item lend�rio 2, Item lend�rio 3\n");
		
	}

}
