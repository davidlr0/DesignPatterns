
public abstract class JBLPrototype {
	protected double valor;
	protected String cor;
	public abstract String getInfo();
	public abstract JBLPrototype clonar();
	
	public double getValor() {
		return this.valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
}
