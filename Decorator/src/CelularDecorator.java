
public class CelularDecorator implements Celular{
	public Celular celular;
	
	public CelularDecorator(Celular cel) {
		this.celular = cel;
	}
	@Override
	public void equipar() {
		this.celular.equipar();
	}

}
