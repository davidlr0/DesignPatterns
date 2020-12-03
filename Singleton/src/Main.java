
public class Main {

	public static void main(String[] args) {
		PlacarSingleton placar1 = PlacarSingleton.getInstance();
		placar1.setPlacarTime1(1);
		placar1.setPlacarTime2(3);
		
		System.out.println(placar1.placarFinal());
		
		PlacarSingleton placar2 = PlacarSingleton.getInstance();
		placar2.setPlacarTime1(5);
		System.out.println(placar2.placarFinal());
		
		System.out.println(placar1.placarFinal());
	}

}
