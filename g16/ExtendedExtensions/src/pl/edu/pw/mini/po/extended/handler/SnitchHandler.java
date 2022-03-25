package pl.edu.pw.mini.po.extended.handler;

import pl.edu.pw.mini.po.extended.snitch.Snitch;

public abstract class SnitchHandler {

	private String name;
	private boolean experienced;

	public SnitchHandler(String name) {
		this.name = name;
	}

	public SnitchHandler(String name, boolean experienced) {
		this.name = name;
		this.experienced = experienced;
	}

	public abstract void manage(Snitch snitch);

}
