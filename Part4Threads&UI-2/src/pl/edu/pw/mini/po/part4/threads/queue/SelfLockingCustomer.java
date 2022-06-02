package pl.edu.pw.mini.po.part4.threads.queue;

public class SelfLockingCustomer extends Thread {
	private String name;

	public SelfLockingCustomer(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		try {
			Thread.sleep(1000);
			System.out.println("Thread: " + name + ": I am going to be locked soon");
			synchronized (this) {
				this.wait();
				//wait();//To samo co wczesniej
			}
			System.out.println("Thread: " + name + ": I am free :)");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
