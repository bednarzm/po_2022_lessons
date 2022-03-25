package pl.edu.pw.mini.po.interfaces;

import java.util.Random;

public class Seller {

	private SellerCardable sellerCardable;

	public Seller(SellerCardable sellerCardable) {
		super();
		this.sellerCardable = sellerCardable;
	}

	public void doJob() {
		Random random = new Random();
		sellerCardable.addPoints(random.nextInt(100));
	}

}
