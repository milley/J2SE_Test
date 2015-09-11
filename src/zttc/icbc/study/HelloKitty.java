package zttc.icbc.study;

public class HelloKitty extends Pet {

	public HelloKitty(String name) {
		super(name);
		this.setName(name);
		// TODO Auto-generated constructor stub
	}

	public void enjoy() {
		System.out.println(this.getName()+": come on, boy!!!");
	}
}
