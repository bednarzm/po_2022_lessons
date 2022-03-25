package pl.edu.pw.mini.po.extended.handler;

import pl.edu.pw.mini.po.extended.snitch.Snitch;

public class BribeSnitchHandler extends SnitchHandler {
	
	public BribeSnitchHandler(String name) {
		super(name);
	}
	
	public void manage(Snitch snitch) {
		snitch.giveBribe(1000);
	}
}
