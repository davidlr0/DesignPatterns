
public class MesaRetangular extends Mesa{
	public MesaRetangular(MesaRetangular essaMesa) {}
	public MesaRetangular() {}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "Mesa retangular, altura: " + this.altura + " e do tipo: " + this.tipo;
	}

	public Mesa clonar() {
		return new MesaRetangular(this);
	}
}
