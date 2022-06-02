package pl.edu.pw.mini.po.twelfth.threads.newspaper;

import java.util.Random;

public class Newspaper {

	private String annotation = "";

	public void readMe() {
		System.out.println(" Started ");
		annotation += "[" + Thread.currentThread().getName() + " started";
		try {
			Thread.sleep(new Random().nextInt(1000));

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		annotation += Thread.currentThread().getName() + " finished]";
		System.out.println("finished.");
	}

	public void readMeSynchronized() {

		synchronized (this) {
			System.out.println(" Started ");
			annotation += "[" + Thread.currentThread().getName() + " started";
			try {
				Thread.sleep(new Random().nextInt(1000));

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			annotation += Thread.currentThread().getName() + " finished]";
			System.out.println("finished.");
		}
		
	}
	
	public synchronized void readMeSynchronized2() {
		System.out.println(" Started ");
		annotation += "[" + Thread.currentThread().getName() + " started";
		try {
			Thread.sleep(new Random().nextInt(1000));

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		annotation += Thread.currentThread().getName() + " finished]";
		System.out.println("finished.");
	}

	

	public void readMeSynchronizedWithLock(Object lock) {

		synchronized (lock) {
			System.out.println(" Started ");
			annotation += "[" + Thread.currentThread().getName() + " started";
			try {
				Thread.sleep(new Random().nextInt(1000));

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			annotation += Thread.currentThread().getName() + " finished]";
			System.out.println("finished.");
		}
		
	}
	
	public String getAnnotation() {
		return annotation;
	}

}
