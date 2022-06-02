package pl.edu.pw.mini.po.part4.threads.race;

import java.nio.charset.Charset;
import java.util.Random;

public class ChaoticRacingThread extends Thread {

	private ThoughtsHolder reflectionsHolder;
	
	public ChaoticRacingThread(String name, ThoughtsHolder reflectionsHolder) {
		setName(name);
		this.reflectionsHolder = reflectionsHolder;
	}

	@Override
	public void run() {
		Random random = new Random();
		
		try {
			sleep(random.nextInt(1000, 2000));
			reflectionsHolder.append("[" + getName() + "`s golden thoughts start... ");
			sleep(random.nextInt(1000, 2000));
			reflectionsHolder.append(generateRandomString());
			sleep(random.nextInt(1000, 2000));
			reflectionsHolder.append( getName() + "`s ...golden thoughts end ]");
			reflectionsHolder.printFinalString(getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	protected String generateRandomString() {
		byte[] array = new byte[1]; 
	    new Random().nextBytes(array);
	    
	    return new String(array, Charset.forName("UTF-8"));
	}
	
}
