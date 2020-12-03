
public class Main {

	public static void main(String[] args) {
		Domain domain = new ProxyDomain("dns.google.com");
		domain.getIP();
		
		System.out.println("=========================");
		domain.getIP();

	}

}
