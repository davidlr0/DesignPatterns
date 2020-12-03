import java.util.ArrayList;
import java.util.List;

public abstract class Item {
	private List<Item> itens;
	
	public Item() {
		itens = new ArrayList<Item>();
	}
	public abstract void equipar();
	
	public void adicionarItem(Item item) {
		this.itens.add(item);
	}
	
	public void removerItem(Item item) {
		this.itens.remove(item);
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> boneco) {
		this.itens = boneco;
	}
	
}
