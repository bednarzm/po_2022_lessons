package pl.edu.pw.mini.po.extended.handler;

import pl.edu.pw.mini.po.extended.snitch.Snitch;

public class ScarySnitchHandler extends SnitchHandler {
	
	public ScarySnitchHandler() {
		super("XXXX");
	}
	
	public void manage(Snitch snitch) {
		snitch.setScared(true);
	}
	
}
