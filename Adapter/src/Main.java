
public class Main {

	public static void main(String[] args) {
		ConectorVGA vga = new ConectorVGA();
		ConectorHDMI hdmi = new ConectorHDMI();
		
		AdapterConector adapHdmi = new AdapterConector(vga);
		
		adapHdmi.conectarEntradaHDMI();

	}

}
