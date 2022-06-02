package pl.edu.pw.mini.po.twelfth.threads;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import pl.edu.pw.mini.po.twelfth.threads.newspaper.NewsWorker;
import pl.edu.pw.mini.po.twelfth.threads.newspaper.Newspaper;
import pl.edu.pw.mini.po.twelfth.threads.shared.AnyProcess;
import pl.edu.pw.mini.po.twelfth.threads.shared.Customer;
import pl.edu.pw.mini.po.twelfth.threads.shared.Shop;

public class ThreadDemonstrator {

	public static void main(String[] args) {

		//basicMethod();
		//create10Threads();
		//createSimpleLock();
		 //createSimpleLock2();
		//shopping();
		//createNewsWorkers();
		//createNewsSynchronizedWorkers();

	}

	private static void basicMethod() {

		try {
			Thread.sleep(2000);
			System.out.println(" Main thread");

			Thread thread = new MyThread();
			thread.start();

			Thread myRunnableThread = new Thread(new MyRunnable());
			myRunnableThread.start();

			Thread myAnonymousThread = new Thread(new Runnable() {

				@Override
				public void run() {

					try {
						Thread.sleep(new Random().nextInt(3000));
						System.out.println("My anonymous thread");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
			myAnonymousThread.start();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void shopping() {
		Object lock = new Object();
		Shop shop = new Shop(lock);

		Customer firstProcess = new Customer("First customer", shop);
		Customer secondProcess = new Customer("Second customer", shop);
		Customer thirdProcess = new Customer("Third customer", shop);
		Customer fourthProcess = new Customer("Fourth customer", shop);
		Customer fifthProcess = new Customer("Fifth customer", shop);

		firstProcess.start();
		secondProcess.start();
		thirdProcess.start();
		fourthProcess.start();
		fifthProcess.start();

	}

	private static void createSimpleLock() {
		Object lock = new Object();
		
		AnyProcess firstProcess = new AnyProcess("First process", lock);
		AnyProcess secondProcess = new AnyProcess("Second process", lock);
		AnyProcess thirdProcess = new AnyProcess("Third process", lock);
		AnyProcess fourthProcess = new AnyProcess("Fourth process", lock);

		firstProcess.start();
		secondProcess.start();
		thirdProcess.start();
		fourthProcess.start();

		sleep(5000);
		System.out.println("Uwalniamy pierwszy proces...");
		synchronized (lock) {
			lock.notify();
		}
		sleep(10000);
		System.out.println("Uwalniamy drugi proces...");
		synchronized (lock) {
			lock.notify();
		}
		sleep(15000);
		System.out.println("Uwalniamy pozostale dwa procesy hurtem...");
		synchronized (lock) {
			lock.notifyAll();
		}

	}

	private static void createSimpleLock2() {
		Object lock = new Object();

		AnyProcess firstProcess = new AnyProcess("First process", lock);
		AnyProcess secondProcess = new AnyProcess("Second process", lock);
		AnyProcess thirdProcess = new AnyProcess("Third process", lock);
		AnyProcess fourthProcess = new AnyProcess("Fourth process", lock);

		firstProcess.start();
		secondProcess.start();
		thirdProcess.start();
		fourthProcess.start();

		sleep(5000);
		System.out.println("\nUwalniamy pierwszy proces...");
		synchronized (lock) {
			lock.notify();
		}
		System.out.println("\nUwalniamy drugi proces...");
		synchronized (lock) {
			lock.notify();
		}
		sleep(15000);
		System.out.println("\nUwalniamy pozostale dwa procesy hurtem...");
		synchronized (lock) {
			lock.notifyAll();
		}

	}

	private static void createNewsWorkers() {
		Set<Thread> threadSet = new HashSet<>();

		Newspaper newspaper = new Newspaper();

		for (int i = 0; i < 10; i++) {
			//Newspaper newspaper = new Newspaper();//Tutaj nie ma wspoldzielenia zasobow
			threadSet.add(new NewsWorker(newspaper));
		}

		sleep(1000);

		for (Thread thread : threadSet) {
			thread.start();
		}

		sleep(5000);// Tak nie robimy!!

		System.out.println("Newspaper: " + newspaper.getAnnotation());

	}

	private static void createNewsSynchronizedWorkers() {
		Set<Thread> threadSet = new HashSet<>();
		Object lock = new Object();
		Newspaper newspaper = new Newspaper();

		for (int i = 0; i < 10; i++) {
			// Newspaper newspaper = new Newspaper();//Tutaj nie ma wspoldzielenia zasobow
			threadSet.add(new NewsWorker(newspaper));
		}

		sleep(1000);

		for (Thread thread : threadSet) {
			thread.start();
		}

		sleep(5000);// Tak nie robimy!!

		System.out.println("Newspaper: " + newspaper.getAnnotation());

	}

	private static void create10Threads() {
		Set<Thread> threadSet = new HashSet<>();

		for (int i = 0; i < 10; i++) {
			threadSet.add(new MyWorker());
		}

		sleep(5000);

		for (Thread thread : threadSet) {
			thread.start();
		}

	}

	public static void sleep(int milis) {
		try {
			Thread.sleep(milis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
