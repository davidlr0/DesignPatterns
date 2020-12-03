
public class Main {

	public static void main(String[] args) {
		TimesDoCampeonato meusTimes = new TimesDoCampeonato();
		
		System.out.println("Iteracao de times");
		
		for (IteradorCampeonato ic = meusTimes.criarIterador(); !ic.isDone(); ic.proximaPosicao()) {
			System.out.println(ic.getNomeTime());
			
		}
		
	}

}
