package pl.edu.pw.mini.po.extended;

import pl.edu.pw.mini.po.extended.blackmailed.Blackmailed;
import pl.edu.pw.mini.po.extended.handler.KillSnitchHandler;
import pl.edu.pw.mini.po.extended.handler.ScarySnitchHandler;
import pl.edu.pw.mini.po.extended.handler.SnitchHandler;
import pl.edu.pw.mini.po.extended.snitch.Snitch;

public class Demonstrator {

	public static void main(String[] args) {
		
		demonstrateScary();
		demonstrateKill();
	}
	
	private static void demonstrateKill() {
		Snitch snitch = new Snitch();
		SnitchHandler snitchHandler = new KillSnitchHandler("Killex");
		Blackmailed blackmailed = new Blackmailed(snitchHandler, snitch);
	}
	
	private static void demonstrateScary() {
		Snitch snitch = new Snitch();
		SnitchHandler snitchHandler = new ScarySnitchHandler();
		Blackmailed blackmailed = new Blackmailed(snitchHandler, snitch);
	}
}
