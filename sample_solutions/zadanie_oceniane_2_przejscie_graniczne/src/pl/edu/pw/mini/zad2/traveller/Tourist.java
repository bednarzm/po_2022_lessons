package pl.edu.pw.mini.zad2.traveller;

import java.util.LinkedHashSet;
import java.util.Random;

import pl.edu.pw.mini.zad2.merchandise.Counterfeit;
import pl.edu.pw.mini.zad2.merchandise.Merchandise;

public class Tourist extends Traveller {

	public Tourist() {
		super(new Random().nextInt(47) + 14);

		int goodsCounter = new Random().nextInt(11) + 10;
		LinkedHashSet<Merchandise> t = new LinkedHashSet<>();
		Random rand = new Random();
		for (int i = 0; i < goodsCounter; i++) {
			Merchandise good = rand.nextDouble() <= 0.1 ? new Counterfeit() : new Merchandise();
			t.add(good);
		}
		setGoods(t);
	}

	@Override
	public String toString() {
		return "Tourist " + super.toString();
	}

}
