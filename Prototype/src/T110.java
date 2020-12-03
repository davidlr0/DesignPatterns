
public class T110 extends JBLPrototype{
	protected T110(T110 foneT110) {
		this.valor = foneT110.getValor();
	}
	public T110() {}

	public String getInfo() {
		return "Modelo T110 da cor " + this.cor + " custando: R$" + this.valor;
	}
	public JBLPrototype clonar() {
		return new T110(this);
	}
}
