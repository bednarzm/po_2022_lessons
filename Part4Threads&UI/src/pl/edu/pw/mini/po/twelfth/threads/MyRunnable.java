package pl.edu.pw.mini.po.twelfth.threads;

import java.util.Random;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(new Random().nextInt(1000) + 1000);
			System.out.println("My runnable: ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
