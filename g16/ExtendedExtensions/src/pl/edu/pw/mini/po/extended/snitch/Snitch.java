package pl.edu.pw.mini.po.extended.snitch;

import java.util.Random;

public class Snitch {

	private boolean scared;
	private int money;
	private int pulse;
	public void setScared(boolean scared) {
		this.scared = scared;
		this.pulse = 38 + new Random().nextInt(50);
	}
	
	public void giveBribe(int bribe) {
		money += bribe;
	}

	public void setPulse(int pulse) {
		this.pulse = pulse;
	}
	
}
