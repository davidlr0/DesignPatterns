
public class Main {

	public static void main(String[] args) {
		
		Roupa roupa1 = new RoupaBuilder().tipo("Camisa")
										.tamanho("M")
										.marca("Apollo")
										.tecido("Malha").builder();
		
		System.out.println(roupa1.getInfo());

	}

}
