package pl.edu.pw.mini.po.extended.handler;

import pl.edu.pw.mini.po.extended.snitch.Snitch;

public class KillSnitchHandler extends SnitchHandler {
	 
	public KillSnitchHandler(String name) {
		super("Mr killer: " + name, true);
	}

	public void manage(Snitch snitch) {
		snitch.setPulse(0);
	}
}
