
public class Roupa {
	private String marca;
	private String tamanho;
	private String tecido;
	private String tipo;
	
	public Roupa() {}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getTecido() {
		return tecido;
	}
	public void setTecido(String tecido) {
		this.tecido = tecido;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getInfo() {
		return "Tipo: " + this.getTipo() +
				"\nMarca: " + this.getMarca() +
				"\nTamanho: " + this.getTamanho() +
				"\nTecido: " + this.getTecido();
	}
	
}
