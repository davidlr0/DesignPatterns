
public class Main {

	public static void main(String[] args) {
		float numero1 = 5;
		float numero2 = 3;
		
		OperatorFacade facade = new OperatorFacade(numero1, numero2);
		System.out.println(facade.operation());
	}

}
