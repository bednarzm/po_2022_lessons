package pl.edu.pw.mini.zad2.traveller;

import java.util.LinkedHashSet;
import java.util.Random;

import pl.edu.pw.mini.zad2.merchandise.Counterfeit;
import pl.edu.pw.mini.zad2.merchandise.Merchandise;

public class Smuggler extends Traveller {

	private boolean armed;

	public Smuggler() {
		super(new Random().nextInt(41) + 35);
		this.armed = new Random().nextBoolean();

		int goodsCounter = new Random().nextInt(31);
		LinkedHashSet<Merchandise> t = new LinkedHashSet<>();
		Random rand = new Random();
		for (int i = 0; i < goodsCounter; i++) {
			Merchandise good = rand.nextDouble() <= 0.4 ? new Counterfeit() : new Merchandise();
			t.add(good);
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
		return "Smuggler " + super.toString();
	}

}
