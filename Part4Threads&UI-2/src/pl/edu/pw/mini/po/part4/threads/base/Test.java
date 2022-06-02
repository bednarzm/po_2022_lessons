package pl.edu.pw.mini.po.part4.threads.base;

public class Test {

	public  void main(String[] args) {
		
		MyThread1 aniaThread = new MyThread1("Ania");
		aniaThread.setName("Threads name");
		
		MyThread1 maciekThread = new MyThread1("Maciek");
		MyThread1 zenekThread = new MyThread1("Zenek M.");
		Thread anotherThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<50;i++) {
					try {
						Thread.sleep(1000);
						System.out.println("Anonymous");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}
		});
		
		Thread externallyImplementedRunnableThread = new Thread(new MyRunnable());
		
		aniaThread.start();
		maciekThread.start();
		zenekThread.start();
		anotherThread.start();
		externallyImplementedRunnableThread.run();
		
	}

}
