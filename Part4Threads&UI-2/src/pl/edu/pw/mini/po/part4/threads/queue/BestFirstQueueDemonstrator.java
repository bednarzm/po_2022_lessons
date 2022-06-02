package pl.edu.pw.mini.po.part4.threads.queue;

import java.util.ArrayList;
import java.util.List;

public class BestFirstQueueDemonstrator {

	public static void main(String[] args) throws InterruptedException {
		// demonstrateNotification();
		// demonstrateGeneralMultiNotification();
		demonstrateConcreteObjectMultiNotification();
	}

	private static void demonstrateNotification() throws InterruptedException {
		Object commonLock = new Object();

		Thread firstCustomer = new Thread(new Customer(commonLock, "First"));
		Thread secondCustomer = new Thread(new Customer(commonLock, "Second"));
		Thread thirdCustomer = new Thread(new Customer(commonLock, "Third"));

		firstCustomer.start();
		secondCustomer.start();
		thirdCustomer.start();

		// Bad practice!!!
		Thread.sleep(2000);

		synchronized (commonLock) {
			commonLock.notify();
			commonLock.notify();
		}
	}

	private static void demonstrateGeneralMultiNotification() throws InterruptedException {
		Object commonLock = new Object();

		List<Thread> threads = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			threads.add(new Customer(commonLock, String.valueOf(i)));
		}

		for (Thread thread : threads) {
			thread.start();
		}

		// Bad practice!!!
		Thread.sleep(2000);
		System.out.println("Notify 20 only...");
		synchronized (commonLock) {
			for (int i = 0; i < 20; i++) {
				commonLock.notify();
			}
		}
		Thread.sleep(3000);
		System.out.println("It`s time to free the rest of them...");
		synchronized (commonLock) {
			commonLock.notifyAll();
		}

	}

	private static void demonstrateConcreteObjectMultiNotification() throws InterruptedException {

		List<Thread> threads = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			threads.add(new SelfLockingCustomer(String.valueOf(i)));
		}

		for (Thread thread : threads) {
			thread.start();
		}

		// Bad practice!!!
		Thread.sleep(2000);
		System.out.println("Notify 20 only...");

		for (int i = 0; i < 20; i++) {
			Thread treadToNotify = threads.get(i);
			synchronized (treadToNotify) {
				treadToNotify.notify();//Kazdy watek zawieszony jest na samym sobie
			}
		}

	}

}
