package zttc.icbc.testThread;

public class TestThread01 {

	public static void main(String[] args) {
		new TestThread01().run();
	}
	
	public void run() {
		MyThread mt1 = new MyThread("mt1");
		mt1.start();
		MyThread mt2 = new MyThread("mt2");
		mt2.start();
	}

	public class MyThread extends Thread {
		private int index;
		public MyThread(String name) {
			super(name);
		}
		public void run() {
			for (; index < 100; index++) {
				System.out.println(Thread.currentThread().getName() + ":"+index);
			}
		}
	}
}
