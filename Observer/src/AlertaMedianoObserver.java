
public class AlertaMedianoObserver extends TemperaturaObserver {

	public AlertaMedianoObserver(TemperaturaSubject temp) {
		super(temp);
	}
	@Override
	public void update() {
		if(temp.getValue() >= 20 && temp.getValue() <= 25) {
			System.out.println("Alerta Mediano: Acionado");
		} else {
			System.out.println("Alerta Mediano: Não acionado");
		}
		
	}

}
