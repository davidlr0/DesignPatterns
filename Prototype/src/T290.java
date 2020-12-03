
public class T290 extends JBLPrototype{
	protected T290(T290 foneT290) {
		this.valor = foneT290.getValor();
	}
	public T290() {}

	public String getInfo() {
		return "Modelo T290 da cor " + this.cor + " custando: R$" + this.valor;
	}
	public JBLPrototype clonar() {
		return new T290(this);
	}
}
