
public class ProxyDomain implements Domain{
	private RealDomain realDomain;
	private String domain;
	
	public ProxyDomain(String domain) {
		this.domain = domain;
	}
	@Override
	public void getIP() {
		if(this.realDomain == null) {
			this.realDomain = new RealDomain(this.domain);
		}
		
		this.realDomain.getIP();
	}

}
