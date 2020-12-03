import java.util.ArrayList;

public class Campeonato {
	protected ArrayList<Time> times;
	
	public Campeonato() {
		times = new ArrayList<Time>();
	}
	
	public int totalDeTimes() {
		return times.size();
	}
	
	public IteradorCampeonato criarIterador() {
		return new IteradorCampeonato(times);
	}
}
