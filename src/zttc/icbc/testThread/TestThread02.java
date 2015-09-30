package zttc.icbc.testThread;

public class TestThread02 {	
	public static void main(String[] args) {
		new TestThread02().run();
	}
	
	public void run() {
		MyThread mt1 = new MyThread();
		new Thread(mt1, "mt1").start();
		new Thread(mt1, "mt2").start();
	}

	public class MyThread implements Runnable {
		private int index;

		public void run() {
			for (; index < 100; index++) {
				System.out.println(Thread.currentThread().getName() + ":"+index);
			}
		}
		
	}
}
