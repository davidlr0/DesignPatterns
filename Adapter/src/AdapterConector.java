
public class AdapterConector {
	private ConectorVGA conecVga;
	
	public AdapterConector(ConectorVGA conecVga) {
		this.conecVga = conecVga;
	}
	
	public void conectarEntradaHDMI() {
		this.conecVga.conectarEntradaVGA();
	}
}
