
public class Tenis extends Item{

	@Override
	public void equipar() {
		System.out.println("Tênis equipada");
		for(Item item : super.getItens()) {
			item.equipar();
		}
		
	}

}
