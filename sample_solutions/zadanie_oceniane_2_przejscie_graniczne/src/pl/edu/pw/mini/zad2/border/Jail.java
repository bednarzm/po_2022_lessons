package pl.edu.pw.mini.zad2.border;

import java.util.Set;
import java.util.TreeSet;

import pl.edu.pw.mini.zad2.traveller.Traveller;

public class Jail {
	private Set<Traveller> arrested;

	public Jail() {
		this.arrested = new TreeSet<>();
	}

	public void arrest(Traveller t) throws CantArrestException {
		if (t.getAge() < 18)
			throw new CantArrestException(t.getAge());
		this.arrested.add(t);
	}

}
