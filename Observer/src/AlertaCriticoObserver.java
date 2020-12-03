
public class AlertaCriticoObserver extends TemperaturaObserver {
	public AlertaCriticoObserver(TemperaturaSubject temp) {
		super(temp);
	}
	@Override
	public void update() {
		if(temp.getValue() > 25) {
			System.out.println("Alerta Crítico: Acionado");
		} else {
			System.out.println("Alerta Crítico: Não acionado");
		}
		
	}
}
