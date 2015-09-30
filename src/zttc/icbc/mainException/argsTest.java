package zttc.icbc.mainException;

public class argsTest {

	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("传入参数个数不正确.");
			return;
		}
		
		try {
			int r = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
			System.out.println(r);
		} catch (NumberFormatException e) {
			System.out.println("请传入正确参数.");
		}
	}
}
