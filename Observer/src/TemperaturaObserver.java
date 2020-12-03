
public abstract class TemperaturaObserver {
	protected TemperaturaSubject temp;
	
	public TemperaturaObserver(TemperaturaSubject temp) {
		this.temp = temp;
	}
	
	public abstract void update();
}
