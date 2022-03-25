package pl.edu.pw.mini.po.interfaces;

public class LoyaltyCard implements BuyerCardable, SellerCardable {

	private int points;

	@Override
	public void addPoints(int points) {
		System.out.println(points + " have been added!");
		this.points += points;
		System.out.println("");
	}

	@Override
	public void usePoints(int points) {
		if (this.points >= points) {
			this.points -= points;// this.points = this.points - points;
			System.out.println(points + " has been used.");
		} else {
			System.out.println("Too less points to get!");
		}
	}

}
