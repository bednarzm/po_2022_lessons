package pl.edu.pw.mini.po.interfaces;

public class Demonstrator {

	public static void main(String[] args) {
		LoyaltyCard loyaltyCard = new LoyaltyCard();
		
		SellerCardable sellerCardable = loyaltyCard;
		BuyerCardable buyerCardable = loyaltyCard;
		
		Buyer buyer = new Buyer(buyerCardable);
		Seller seller = new Seller(sellerCardable);
		
		for(int i=0;i<1000;i++) {
			seller.doJob();
			buyer.doJob();
		}
		
	}

}
