package pl.edu.pw.mini.po.twelfth.threads.shared;

import pl.edu.pw.mini.po.twelfth.threads.ThreadDemonstrator;

public class AnyProcess extends Thread {

	private Object lock;// Cokolwiek obiektowego

	public AnyProcess(String name, Object lock) {
		super(name);
		this.lock = lock;
	}

	@Override
	public void run() {
		//System.out.println(Thread.currentThread().getName() + " Before synchronized.");
		synchronized (lock) {
			try {
				System.out.println(Thread.currentThread().getName() + " Before wait.");
				
				lock.wait();
				System.out.println(Thread.currentThread().getName() + " After wait... Released :D");
				
				System.out.println(Thread.currentThread().getName() + "Kontynuuje sekcje krytyczna");
				ThreadDemonstrator.sleep(2000);
				System.out.println(Thread.currentThread().getName() + "Koncze sekcje krytyczna");
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//System.out.println(Thread.currentThread().getName() + " After synchronized.");
	}

}
