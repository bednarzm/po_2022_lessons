package pl.edu.pw.mini.po.part4.threads.race;

import java.nio.charset.Charset;
import java.util.Random;
/*
 * 
 */
public class SynchronizedRacingThread extends Thread {
	
	private CommonWork commonWork;
	
	public SynchronizedRacingThread(String name, CommonWork commonWork) {
		setName(name);
		this.commonWork = commonWork;
	}

	@Override
	public void run() {

		try {
			commonWork.commonWork1(getName(), generateRandomString());//OK
			//commonWork.commonWork2(getName(), generateRandomString());//OK
			//commonWork.commonWork3(getName(), generateRandomString());//OK
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	protected String generateRandomString() {
		byte[] array = new byte[10];
		new Random().nextBytes(array);

		return new String(array, Charset.forName("UTF-8"));
	}

}
