package zttc.icbc.computeTest;

public class KingstonCompany implements Memory {
	private String type;
	private int memory;
	
	public KingstonCompany(String type, int memory) {
		super();
		this.setType(type);
		this.setMemory(memory);
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

	@Override
	public void exchange() {
		System.out.println("Kingston " + this.getType() + ": " + this.getMemory() + "G Hz");
	}

}
