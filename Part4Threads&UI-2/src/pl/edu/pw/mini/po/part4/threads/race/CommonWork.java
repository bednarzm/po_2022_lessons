package pl.edu.pw.mini.po.part4.threads.race;

import java.util.Random;

public class CommonWork {

	private ThoughtsHolder thoughtsHolder;
	private Object intervalLockObject = new Object();
	private Object externalLockObject;

	public CommonWork(ThoughtsHolder thoughtsHolder) {
		this.thoughtsHolder = thoughtsHolder;
	}

	public CommonWork(ThoughtsHolder reflectionsHolder, Object externalLockObject) {
		this.thoughtsHolder = reflectionsHolder;
		this.externalLockObject = externalLockObject;
	}

	private void commonThoughtsProcedure(String name, String thoughts) throws InterruptedException {
		Random random = new Random();
		Thread.sleep(random.nextInt(1000, 2000));
		thoughtsHolder.append("[" + name + "`s golden thoughts start... ");
		Thread.sleep(random.nextInt(1000, 2000));
		thoughtsHolder.append(thoughts);
		Thread.sleep(random.nextInt(1000, 2000));
		thoughtsHolder.append(name + "`s ...golden thoughts end ]");
		thoughtsHolder.printFinalString(name);
	}

	public synchronized void commonWork1(String name, String thoughts) throws InterruptedException {
		commonThoughtsProcedure(name, thoughts);
	}

	public void commonWork2(String name, String thoughts) throws InterruptedException {

		synchronized (this) {
			commonThoughtsProcedure(name, thoughts);
		}

	}

	public void commonWork3(String name, String thoughts) throws InterruptedException {

		synchronized (intervalLockObject) {
			commonThoughtsProcedure(name, thoughts);
		}

	}

	public void commonWork4(String name, String thoughts) throws InterruptedException {

		synchronized (externalLockObject) {
			commonThoughtsProcedure(name, thoughts);
		}

	}

}
