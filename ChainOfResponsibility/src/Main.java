
public class Main {

	public static void main(String[] args) {
		LojaChain loja = new LojaAmador();
		loja.setNext(new LojaIntermediario());
		loja.setNext(new LojaAvancado());
		
		try {
			loja.mostrarItens(NivelLoja.amador);
			loja.mostrarItens(NivelLoja.intermediario);
			loja.mostrarItens(NivelLoja.avancado);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
