
public class Pelicula extends CelularDecorator{

	public Pelicula(Celular cel) {
		super(cel);
	}
	
	@Override
	public void equipar() {
		super.equipar();
		System.out.println("Pelicula equipado.");
	}

}
