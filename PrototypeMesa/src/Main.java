
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MesaQuadrada prototipoQ = new MesaQuadrada();
		MesaRetangular prototipoR = new MesaRetangular();
		
		Mesa mq1 = prototipoQ.clonar();
		mq1.setAltura("1,5m");
		mq1.setTipo("madeira");
		System.out.println(mq1.getInfo());
		
		Mesa mq2 = prototipoQ.clonar();
		mq2.setAltura("1m");
		mq2.setTipo("vidro");
		System.out.println(mq2.getInfo());
		
		Mesa mr1 = prototipoR.clonar();
		mr1.setAltura("1,5m");
		mr1.setTipo("madeira");
		System.out.println(mr1.getInfo());
		
		Mesa mr2 = prototipoR.clonar();
		mr2.setAltura("1m");
		mr2.setTipo("vidro");
		System.out.println(mr2.getInfo());
	}

}
