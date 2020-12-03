
public class Capinha extends CelularDecorator{

	public Capinha(Celular cel) {
		super(cel);
	}
	
	@Override
	public void equipar() {
		super.equipar();
		System.out.println("Capinha equipado.");
	}
	
}
