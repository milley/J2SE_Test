package zttc.icbc.study;

public class SonOfRichMan {
	private String name;
	private Pet pet;
	
	public SonOfRichMan(String name, Pet pet) {
		super();
		this.name = name;
		this.pet = pet;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public void play() {
		System.out.println(this.getName()+"ÕıÔÚºÍ"+pet.getName()+"ÍæË£");
		pet.enjoy();
	}
}
