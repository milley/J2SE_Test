package zttc.icbc.computeTest;

public class Test {

	public static void main(String[] args) {
		GatewayCompany gboard = new GatewayCompany("Gateway 570");
		//IntelCompany icpu = new IntelCompany("酷睿II代", 2.8);
		AMDCompany acpu = new AMDCompany("推土机 X4", 3.8);
		AMDCompany avideo = new AMDCompany("ATI radeon hd 4350", 1024);
		KingstonCompany kmemory = new KingstonCompany("DDR III", 4096);
		
		Compute compute = new Compute(gboard, acpu, avideo, kmemory);
		compute.start();

	}

}
