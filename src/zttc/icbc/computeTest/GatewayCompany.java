package zttc.icbc.computeTest;

public class GatewayCompany implements MainBoard {
	private String type;
	
	public GatewayCompany(String type) {
		super();
		this.setType(type);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void run() {
		System.out.println("Gateway " + this.getType() + " running...");
	}

}
