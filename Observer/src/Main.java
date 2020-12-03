
public class Main {

	public static void main(String[] args) {
		TemperaturaSubject temp = new TemperaturaSubject();
		temp.attach(new AlertaMedianoObserver(temp));
		//temp.attach(new AlertaCriticoObserver(temp));
		
		temp.setState(new Temperatura(15));
		temp.setState(new Temperatura(22));
		temp.setState(new Temperatura(35));
	}

}
