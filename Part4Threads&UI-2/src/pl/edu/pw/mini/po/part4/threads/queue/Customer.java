package pl.edu.pw.mini.po.part4.threads.queue;

public class Customer extends Thread {

	private Object lock;
	private String name;

	public Customer(Object lock, String name) {
		this.lock = lock;
		this.name = name;
	}

	@Override
	public void run() {

		try {
			Thread.sleep(1000);
			System.out.println("Thread: " + name + ": I am going to be locked soon");
			synchronized (lock) {
				lock.wait();
			}
			System.out.println("Thread: " + name + ": I am free :)");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
