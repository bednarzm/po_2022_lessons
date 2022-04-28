package pl.edu.pw.mini.zad2.traveller;

import java.util.LinkedHashSet;
import java.util.Random;

import pl.edu.pw.mini.zad2.merchandise.Merchandise;

public class Spy extends Traveller{

	private boolean armed;
	
	public Spy() {
		super(new Random().nextInt(41) + 35);
		this.setArmed(new Random().nextBoolean());
		
		int goodsCounter = new Random().nextInt(1) + 2;
		LinkedHashSet<Merchandise> t = new LinkedHashSet<>();
		for(int i = 0 ; i < goodsCounter ; i++) {
			t.add(new Merchandise());
		}
		setGoods(t);
	}

	public boolean isArmed() {
		return armed;
	}

	public void setArmed(boolean armed) {
		this.armed = armed;
	}

	@Override
	public String toString() {
		return "Spy " + super.toString();
	}
}
