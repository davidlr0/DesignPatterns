
public class Tenis extends Item{

	@Override
	public void equipar() {
		System.out.println("T�nis equipada");
		for(Item item : super.getItens()) {
			item.equipar();
		}
		
	}

}
