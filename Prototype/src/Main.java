
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T290 prototipo290 = new T290();
		T110 prototipo110 = new T110();
		
		JBLPrototype clone290_1 = prototipo290.clonar();
		clone290_1.setCor("Branco");
		clone290_1.setValor(120);
		System.out.println(clone290_1.getInfo());
		
		JBLPrototype clone290_2 = prototipo290.clonar();
		clone290_2.setCor("preto");
		clone290_2.setValor(119);
		System.out.println(clone290_2.getInfo());
		
		JBLPrototype clone110_1= prototipo110.clonar();
		clone110_1.setCor("branco");
		clone110_1.setValor(90);
		System.out.println(clone110_1.getInfo());
		
		JBLPrototype clone110_2 = prototipo110.clonar();
		clone110_2.setCor("preto");
		clone110_2.setValor(89);
		System.out.println(clone110_2.getInfo());
		
	}

}
