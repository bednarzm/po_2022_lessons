package pl.edu.pw.mini.po.part4.threads.base;

import java.util.Random;

public class MyThread1 extends Thread {

	private String message;
	
	public MyThread1(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			try {
				sleep(new Random().nextInt(1000, 2000));
				System.out.println(message);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
