package pl.edu.pw.mini.po.twelfth.threads;

import java.util.Random;

public class MyWorker extends Thread {

	private static int idCounter;

	protected int id = idCounter++;
	
	public MyWorker() {
		setName(String.valueOf(id));
	}

	@Override
	public void run() {
		System.out.println(" I am worker starting my job" + id);
		ThreadDemonstrator.sleep(new Random().nextInt(500) + 1000);
		System.out.println(" I am worker finishing my job" + id);
	}

}
