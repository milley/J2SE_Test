package zttc.icbc.testThread;

public class TestThreadDead {

	public static void main(String[] args) {
		new TestThreadDead().run();
	}
	
	public void run() {
		MyThread mt = new MyThread();
		new Thread(mt, "mt1").start();
		new Thread(mt, "mt2").start();
	}

	class MyThread implements Runnable {
		private boolean flag = true;
		
		private Object k1 = new Object();
		private Object k2 = new Object();

		@Override
		public void run() {
			if (flag) {
				flag = false;
				synchronized (k1) {
					System.out.println(Thread.currentThread().getName()+":k1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (k2) {
						System.out.println(Thread.currentThread().getName()+":k2");
					}
				}
			} else {
				flag = true;
				synchronized (k2) {
					System.out.println(Thread.currentThread().getName()+":k2");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (k1) {
						System.out.println(Thread.currentThread().getName()+":k1");
					}
				}
			}
		}
		
	}
}
