
public abstract class LojaChain {
	protected LojaChain next;
	protected NivelLoja nivel;
	
	public LojaChain(NivelLoja nivel) {
		this.nivel = nivel;
	}
	
	public void setNext(LojaChain proximo) {
		if (next == null) {
			next = proximo;
		} else {
			next.setNext(proximo);
		}
	}
	
	public void mostrarItens(NivelLoja nivel) throws Exception{
		if(lojaDisponivel(nivel)) {
			mostraItens();
		} else {
			if(next == null) {
				throw new Exception("Loja não disponível");
			}
			
			next.mostrarItens(nivel);
		}
	}
	
	public boolean lojaDisponivel(NivelLoja nivel) {
		if(this.nivel == nivel) {
			return true;
		} else {
			return false;
		}
	}
	
	public abstract void mostraItens();

}
