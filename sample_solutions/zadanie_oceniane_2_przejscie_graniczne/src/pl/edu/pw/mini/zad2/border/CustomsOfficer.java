package pl.edu.pw.mini.zad2.border;

import java.util.List;
import java.util.Random;

import pl.edu.pw.mini.zad2.merchandise.MerchandiseVisitor;
import pl.edu.pw.mini.zad2.merchandise.MerchandiseVisitorImpl;
import pl.edu.pw.mini.zad2.merchandise.Merchandise;
import pl.edu.pw.mini.zad2.traveller.Traveller;

public class CustomsOfficer {
	private List<Traveller> travellers;
	private Jail jail;
	
	public CustomsOfficer(List<Traveller> travellers, Jail jail) {
		this.travellers = travellers;
		this.jail = jail;
	}
	
	//Jesli aresztowany zwraca true, a jak nie to false
	public boolean control(Traveller p) throws CantArrestException {
		System.out.println("Kontroluje podroznego: " + p);
		int summaryValue = 0;
		Random rand = new Random();
		MerchandiseVisitor mv = new MerchandiseVisitorImpl();
		for(Merchandise t: p.getGoods())
			if(rand.nextDouble() <= 0.2)
				summaryValue += t.apply(mv);
		if(summaryValue > 50000) {
			travellers.remove(p);
			jail.arrest(p);
			System.out.println("Aresztowano pasazera: " + p + "; wartosc trefnego towaru: " + summaryValue);
			return true;
		}
		System.out.println("Kontrola przeszla pomyslnie, znaleziono nielegalny towar o wartosci: " + summaryValue);
		return false;
	}
	
}
