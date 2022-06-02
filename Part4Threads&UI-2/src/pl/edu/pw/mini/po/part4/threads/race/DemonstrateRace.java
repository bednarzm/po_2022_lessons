package pl.edu.pw.mini.po.part4.threads.race;

public class DemonstrateRace {

	public static void main(String[] args) {
		//demonstrateChaos();
		//demonstrateSynchronizedChaos();
		//demonstrateExternallySynchronizedChaosWithSharedExternalLock();
		demonstrateExternallySynchronizedChaosWithNOTSharedExternalLock();
	}

	private static void demonstrateChaos() {
		ThoughtsHolder reflectionsHolder = new ThoughtsHolder();
		
		Thread aniaRacingThread = new ChaoticRacingThread("Ania", reflectionsHolder);
		aniaRacingThread.start();
		/*
		Thread piotrekRacingThread = new ChaoticRacingThread("Piotrek", reflectionsHolder);
		piotrekRacingThread.start();
		
		Thread heniekRacingThread = new ChaoticRacingThread("Heniek", reflectionsHolder);
		heniekRacingThread.start();
		
		Thread stefaniaRacingThread = new ChaoticRacingThread("Stefania", reflectionsHolder);
		stefaniaRacingThread.start();
		
		Thread joannaRacingThread = new ChaoticRacingThread("Joanna", reflectionsHolder);
		joannaRacingThread.start();
		
		Thread adamRacingThread = new ChaoticRacingThread("Adam", reflectionsHolder);
		adamRacingThread.start();
		*/
	}
	
	private static void demonstrateSynchronizedChaos() {
		ThoughtsHolder thoughtsHolder = new ThoughtsHolder();
		CommonWork commonWork = new CommonWork(thoughtsHolder);
		
		Thread aniaRacingThread = new SynchronizedRacingThread("Ania", commonWork);
		aniaRacingThread.start();
		
		Thread piotrekRacingThread = new SynchronizedRacingThread("Piotrek", commonWork);
		piotrekRacingThread.start();
		
		Thread heniekRacingThread = new SynchronizedRacingThread("Heniek", commonWork);
		heniekRacingThread.start();
		/*
		Thread stefaniaRacingThread = new SynchronizedRacingThread("Stefania", commonWork);
		stefaniaRacingThread.start();
		
		Thread joannaRacingThread = new SynchronizedRacingThread("Joanna", commonWork);
		joannaRacingThread.start();
		
		Thread adamRacingThread = new SynchronizedRacingThread("Adam", commonWork);
		adamRacingThread.start();
		*/
	}
	
	private static void demonstrateExternallySynchronizedChaosWithSharedExternalLock() {
		ThoughtsHolder thoughtsHolder = new ThoughtsHolder();
		
		Object lock = new Object();
		
		CommonWork commonWork = new CommonWork(thoughtsHolder, lock);
		
		Thread aniaRacingThread = new SynchronizedRacingThread("Ania", commonWork);
		aniaRacingThread.start();
		
		Thread piotrekRacingThread = new SynchronizedRacingThread("Piotrek", commonWork);
		piotrekRacingThread.start();
		
		Thread heniekRacingThread = new SynchronizedRacingThread("Heniek", commonWork);
		heniekRacingThread.start();
		
		
		CommonWork commonWork2 = new CommonWork(thoughtsHolder, lock);//Tutaj lock jest ten sam co w commonWork1
		
		Thread stefaniaRacingThread = new SynchronizedRacingThread("Stefania", commonWork2);
		stefaniaRacingThread.start();
		
		Thread joannaRacingThread = new SynchronizedRacingThread("Joanna", commonWork2);
		joannaRacingThread.start();
		
		Thread adamRacingThread = new SynchronizedRacingThread("Adam", commonWork2);
		adamRacingThread.start();
		
	}
	
	private static void demonstrateExternallySynchronizedChaosWithNOTSharedExternalLock() {
		ThoughtsHolder thoughtsHolder = new ThoughtsHolder();
		Object lock1 = new Object();
		CommonWork commonWork = new CommonWork(thoughtsHolder, lock1);
		
		Thread aniaRacingThread = new SynchronizedRacingThread("Ania", commonWork);
		aniaRacingThread.start();
		
		Thread piotrekRacingThread = new SynchronizedRacingThread("Piotrek", commonWork);
		piotrekRacingThread.start();
		
		Thread heniekRacingThread = new SynchronizedRacingThread("Heniek", commonWork);
		heniekRacingThread.start();
		

		Object lock2 = new Object();
		CommonWork commonWork2 = new CommonWork(thoughtsHolder, lock2);//Tutaj lock jest ten sam co w commonWork1
		
		Thread stefaniaRacingThread = new SynchronizedRacingThread("Stefania", commonWork2);
		stefaniaRacingThread.start();
		
		Thread joannaRacingThread = new SynchronizedRacingThread("Joanna", commonWork2);
		joannaRacingThread.start();
		
		Thread adamRacingThread = new SynchronizedRacingThread("Adam", commonWork2);
		adamRacingThread.start();
		
	}
	
}
