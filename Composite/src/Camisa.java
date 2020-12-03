
public class Camisa extends Item{

	@Override
	public void equipar() {
		System.out.println("Camisa equipada");
		for(Item item : super.getItens()) {
			item.equipar();
		}
		
	}

}
