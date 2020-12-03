import java.util.ArrayList;

public class IteradorCampeonato {
	private ArrayList<Time> lista;
	private int posicao;
	
	protected IteradorCampeonato(ArrayList<Time> lista) {
		this.lista = lista;
		posicao = 1;
	}
	
	public void primeiro() {
		posicao = 1;
	}
	
	public void proximaPosicao() {
		posicao ++;
	}
	
	public void posicaoAnterior() {
		posicao --;
	}
	
	public boolean isDone() {
		return posicao == lista.size();
	}
	
	public String getNomeTime() {
		return lista.get(posicao).nome;
	}
}
