package pl.edu.pw.mini.po.interfaces;

import java.util.Random;

public class Buyer {

	private BuyerCardable buyerCardable;

	public Buyer(BuyerCardable buyerCardable) {
		super();
		this.buyerCardable = buyerCardable;
	}

	public void doJob() {
		buyerCardable.usePoints(new Random().nextInt(200));

	}

}
