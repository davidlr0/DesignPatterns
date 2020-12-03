
public class AlertaCriticoObserver extends TemperaturaObserver {
	public AlertaCriticoObserver(TemperaturaSubject temp) {
		super(temp);
	}
	@Override
	public void update() {
		if(temp.getValue() > 25) {
			System.out.println("Alerta Cr�tico: Acionado");
		} else {
			System.out.println("Alerta Cr�tico: N�o acionado");
		}
		
	}
}
