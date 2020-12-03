
public class Main {

	public static void main(String[] args) {
		Celular celuPadrao = new CelularPadrao();
		celuPadrao.equipar();
		System.out.println("\n");
		
		Celular celuEquipado = new Capinha(new Pelicula(new CelularPadrao()));
		celuEquipado.equipar();
	}

}
