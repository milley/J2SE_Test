package zttc.icbc.mainException;

public class argsTest {

	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("���������������ȷ.");
			return;
		}
		
		try {
			int r = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
			System.out.println(r);
		} catch (NumberFormatException e) {
			System.out.println("�봫����ȷ����.");
		}
	}
}
