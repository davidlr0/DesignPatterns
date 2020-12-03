
public class RoupaBuilder {
	private Roupa roupa;
	
	public RoupaBuilder() {
		this.roupa = new Roupa();
	}
	
	public RoupaBuilder marca(String marca) {
		roupa.setMarca(marca);
		return this;
	}
	public RoupaBuilder tamanho(String tamanho) {
		roupa.setTamanho(tamanho);
		return this;
	}
	public RoupaBuilder tecido(String tecido) {
		roupa.setTecido(tecido);
		return this;
	}
	public RoupaBuilder tipo(String tipo) {
		roupa.setTipo(tipo);
		return this;
	}
	public Roupa builder() {
		return this.roupa;
	}
}
