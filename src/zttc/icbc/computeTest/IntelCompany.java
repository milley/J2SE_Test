package zttc.icbc.computeTest;

public class IntelCompany implements CPU {
	private String type;
	private double speed;
	
	public IntelCompany(String type, double speed) {
		super();
		this.setType(type);
		this.setSpeed(speed);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}


	public void operation() {
		System.out.println("Intel " + this.getType() + ": " + this.getSpeed() + "G Hz");
	}

}
