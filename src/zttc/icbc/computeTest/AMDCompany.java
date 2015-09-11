package zttc.icbc.computeTest;

public class AMDCompany implements VideoCard, CPU {
	private String type;
	private int memory;
	private double speed;
	
	public AMDCompany(String type, int memory) {
		super();
		this.setType(type);
		this.setMemory(memory);
	}

	public AMDCompany(String type, double speed) {
		super();
		this.setType(type);
		this.setSpeed(speed);
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getMemory() {
		return memory;
	}


	public void setMemory(int memory) {
		this.memory = memory;
	}


	public void display() {
		System.out.println("AMD " + this.getType() + ": " + this.getMemory() + " MB");
	}

	@Override
	public void operation() {
		System.out.println("AMD " + this.getType() + ": " + this.getSpeed() + " G Hz");
	}

}
