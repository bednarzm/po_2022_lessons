package pl.edu.pw.mini.po.twelfth.threads.shared;

import java.util.Random;

import pl.edu.pw.mini.po.twelfth.threads.ThreadDemonstrator;

public class Shop {

	private Object lock;
	private int customers;

	public Shop(Object lock) {
		super();
		this.lock = lock;
	}

	public void doShopping() {
		enter();
		buySth();
		leave();
	}

	private void buySth() {
		System.out.println(Thread.currentThread().getName() + " Starting buying...");
		ThreadDemonstrator.sleep(new Random().nextInt(2000) + 10000);
		System.out.println(Thread.currentThread().getName() + " Finishing buying...");
	}

	private void enter() {
		synchronized (lock) {
			if (customers < 3) {
			} else {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			customers++;
			System.out.println("Customers increased: " + customers);
		}
	}

	private void leave() {
		synchronized (lock) {
			customers--;
			lock.notify();
			System.out.println("Customers decreased: " + customers);
		}
	}

}
