package pl.edu.pw.mini.po.extended.blackmailed;

import pl.edu.pw.mini.po.extended.handler.SnitchHandler;
import pl.edu.pw.mini.po.extended.snitch.Snitch;

public class Blackmailed {
	
	private SnitchHandler snitchHandler;
	
	private Snitch snitch;
	
	public Blackmailed(SnitchHandler snitchHandler, Snitch snitch) {
		this.snitchHandler = snitchHandler;
		this.snitch = snitch;
	}

	public void solveProblem() {
		snitchHandler.manage(snitch);
	}
	
}
