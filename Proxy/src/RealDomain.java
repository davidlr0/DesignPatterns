
public class RealDomain implements Domain{
	private String domainName;
	
	public RealDomain(String domainName) {
		this.domainName = domainName;
		loadingIP();
	}
	@Override
	public void getIP() {
		System.out.println("IP do dom�nio " + this.domainName + " � 8.8.8.8" );		
	}
	
	public void loadingIP() {
		System.out.println("Buscando IP do dom�nio " + this.domainName);
	}
	
}
