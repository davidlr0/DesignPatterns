
public class Bermuda extends Item {

	@Override
	public void equipar() {
		System.out.println("Bermuda equipada");
		for(Item item : super.getItens()) {
			item.equipar();
		}
		
	}

}
