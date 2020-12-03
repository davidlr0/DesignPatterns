
public class FabricaJBL extends FabricacaoHeadphone{

	public Headphone criarHeadphone(String cor, String conexao) {
		if(conexao.equals("wireless")) {
			return new T110(cor);
		} else {
			return new T290(cor);
		}
	}

}
