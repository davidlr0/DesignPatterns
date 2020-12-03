
public class PlacarSingleton {
	private static PlacarSingleton instancia;
	private int placarTime1;
	private int placarTime2;
	
	private PlacarSingleton() {}
	
	public static synchronized PlacarSingleton getInstance() {
		if(instancia == null) {
			instancia = new PlacarSingleton();		
		} 
		return instancia;
	}

	public int getPlacarTime1() {
		return placarTime1;
	}

	public void setPlacarTime1(int placarTime1) {
		this.placarTime1 = placarTime1;
	}

	public int getPlacarTime2() {
		return placarTime2;
	}

	public void setPlacarTime2(int placarTime2) {
		this.placarTime2 = placarTime2;
	}
	
	public String placarFinal() {
		return "Placar final: Time1 " + instancia.getPlacarTime1()
		+ "|" + instancia.getPlacarTime2() + " Time2 ";
	
	}
	
}
