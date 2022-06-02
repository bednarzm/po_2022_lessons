package pl.edu.pw.mini.po.twelfth.threads.shared;

public class Customer extends Thread {
	
	private Shop shop;
	
	public Customer(String name,Shop shop) {
		super(name);
		this.shop = shop;
	}
	
	public void run() {
		shop.doShopping();
	}
	
}
