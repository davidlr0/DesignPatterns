
public class Main {

	public static void main(String[] args) {
		FabricacaoHeadphone fbfone = new FabricaJBL();
		String cor = "azul";
		String conexao = "wireless";
		
		Headphone produto1 = fbfone.criarHeadphone(cor, conexao);
		System.out.println(produto1.getInfo());
		
		conexao = "com fio";
		Headphone produto2 = fbfone.criarHeadphone(cor, conexao);
		System.out.println(produto2.getInfo());
	}

}
