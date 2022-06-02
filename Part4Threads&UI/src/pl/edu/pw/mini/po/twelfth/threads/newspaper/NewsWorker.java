package pl.edu.pw.mini.po.twelfth.threads.newspaper;

import pl.edu.pw.mini.po.twelfth.threads.MyWorker;

public class NewsWorker extends MyWorker {
	
	private Newspaper newspaper;
	
	public NewsWorker(Newspaper newspaper) {
		super();
		this.newspaper = newspaper;
	}

	@Override
	public void run() {
		
		//newspaper.readMe();
		//newspaper.readMeSynchronized();
		//newspaper.readMeSynchronized2();
	}
	
}
