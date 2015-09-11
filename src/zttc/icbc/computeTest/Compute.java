package zttc.icbc.computeTest;

public class Compute {
	private MainBoard mainboard;
	private CPU cpu;
	private VideoCard videocard;
	private Memory memory;

	public Compute(MainBoard mainboard, CPU cpu, VideoCard videocard,
			Memory memory) {
		super();
		this.mainboard = mainboard;
		this.cpu = cpu;
		this.videocard = videocard;
		this.memory = memory;
	}


	public MainBoard getMainboard() {
		return mainboard;
	}


	public void setMainboard(MainBoard mainboard) {
		this.mainboard = mainboard;
	}


	public CPU getCpu() {
		return cpu;
	}


	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}


	public VideoCard getVideocard() {
		return videocard;
	}


	public void setVideocard(VideoCard videocard) {
		this.videocard = videocard;
	}


	public Memory getMemory() {
		return memory;
	}


	public void setMemory(Memory memory) {
		this.memory = memory;
	}


	public void start() {
		System.out.println("Compute startup...");
		mainboard.run();
		memory.exchange();
		videocard.display();
		cpu.operation();
		System.out.println("Windows XP startup...");
	}
}
