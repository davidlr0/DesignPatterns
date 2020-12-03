
public class Main {

	public static void main(String[] args) {
		Item item = new Camisa();
		item.adicionarItem(new Bermuda());
		item.adicionarItem(new Tenis());
		item.adicionarItem(new Camisa());
		item.equipar();
		

	}

}
