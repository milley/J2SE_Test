package zttc.icbc.study;

public class Dog extends Pet {
	
	public Dog(String name) {
		super(name);
		this.setName(name);
	}

	public void enjoy() {
		System.out.println(this.getName()+"ÍôÍôÍô!");
	}
}
