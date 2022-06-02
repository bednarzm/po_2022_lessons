package pl.edu.pw.mini.po.twelfth.threads.newspaper;

import pl.edu.pw.mini.po.twelfth.threads.MyWorker;

public class ExternallySynchronizedWorker extends MyWorker {

	private Newspaper newspaper;

	private Object object;

	public ExternallySynchronizedWorker(Newspaper newspaper, Object object) {
		this.newspaper = newspaper;
		this.object = object;
	}

	@Override
	public void run() {

		newspaper.readMeSynchronized2();
	}
}
