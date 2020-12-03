import java.util.ArrayList;

public class Busca {
	private ArrayList<Livro> listaLivros;
	private String tipo;
	
	public Busca(ArrayList lista, String tipo){
		this.tipo = tipo;
		if(tipo == "livro"){
			this.listaLivros = lista;
		}
	}
	public ArrayList<String> buscarLivros(String categoria){
		ArrayList<String> resultado = new ArrayList<>();
	    if(this.tipo == "livro"){
	        for (Livro livro: this.listaLivros) {
	        	if(livro.getCategoria() == categoria) {
	        		resultado.add(livro.getNome());
	        	}
	        }	    }
	    return resultado;
	}
	
	public ArrayList getLista() {
		return listaLivros;
	}
	public void setLista(ArrayList lista) {
		this.listaLivros = lista;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}