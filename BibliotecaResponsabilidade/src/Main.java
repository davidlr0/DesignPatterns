import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		Livro livro1 = new Livro("livro 1", "suspense");
		Livro livro2 = new Livro("livro 2", "Aventura");
		Livro livro3 = new Livro("livro 3", "suspense");
		ArrayList<Livro> livros = new ArrayList();
		livros.add(livro1);
		livros.add(livro2);
		livros.add(livro3);
		
		Busca buscaLivros = new Busca(livros, "livro");
		
		System.out.println(buscaLivros.buscarLivros("suspense"));
	}
}
