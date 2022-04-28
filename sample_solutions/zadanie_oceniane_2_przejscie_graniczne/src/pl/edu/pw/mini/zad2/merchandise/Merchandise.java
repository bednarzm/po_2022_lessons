package pl.edu.pw.mini.zad2.merchandise;

import java.util.List;
import java.util.Random;

public class Merchandise {

	private static List<String> names = List.of("woda", "kanapka", "laptop", "zasilacz", "mysz", "ksiazka");
	
	private String name;
	
	public Merchandise() {
		int id = new Random().nextInt(names.size());
		this.name = names.get(id);
	}

	public String getName() {
		return name;
	}
	
	public int apply(MerchandiseVisitor visitor) {
		return visitor.visit(this);
	}
}
