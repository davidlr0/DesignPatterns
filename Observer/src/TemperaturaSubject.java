import java.util.ArrayList;

public class TemperaturaSubject {
	protected Temperatura temp;
	protected ArrayList<TemperaturaObserver> observers;
	
	public TemperaturaSubject() {
		observers = new ArrayList<>();
	}
	
	public void attach(TemperaturaObserver observer) {
		this.observers.add(observer);
	}
	
	public void detach(int index) {
		this.observers.remove(index);
	}
	
	public void setState(Temperatura temp) {
		this.temp = temp;
		notifyObservers();
	}
	
	private void notifyObservers() {
		for(TemperaturaObserver observer : observers) {
			observer.update();
		}
	}
	
	public Temperatura getState() {
		return this.temp;	
	}
	
	public int getValue() {
		return temp.getTemp();
	}
}
