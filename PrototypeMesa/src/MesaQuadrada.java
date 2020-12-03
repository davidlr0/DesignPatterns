
public class MesaQuadrada extends Mesa{
	public MesaQuadrada(MesaQuadrada essaMesa) {}
	public MesaQuadrada() {}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "Mesa quadrada, altura: " + this.altura + " e do tipo: " + this.tipo;
	}

	public Mesa clonar() {
		return new MesaQuadrada(this);
	}
}
