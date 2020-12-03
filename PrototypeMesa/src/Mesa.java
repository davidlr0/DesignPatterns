
public abstract class Mesa {
	protected String altura;
	protected String tipo;
	public abstract Mesa clonar();
	public abstract String getInfo();
	
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
