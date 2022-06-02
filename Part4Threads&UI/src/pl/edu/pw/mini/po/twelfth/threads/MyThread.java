package pl.edu.pw.mini.po.twelfth.threads;

public class MyThread extends Thread {
	
	public MyThread() {
		setName("My thread name!!");
		Thread.currentThread().getName();
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("Thread name: " + getName()); ;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
