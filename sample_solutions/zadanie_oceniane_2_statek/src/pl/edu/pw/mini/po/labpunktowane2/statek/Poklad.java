package pl.edu.pw.mini.po.labpunktowane2.statek;

import java.util.LinkedHashSet;

import pl.edu.pw.mini.po.labpunktowane2.pasazer.Pasazer;

public class Poklad {
	LinkedHashSet<Pasazer> pasazerowie;
	
	public Poklad() {
		this.pasazerowie = new LinkedHashSet<Pasazer>();
	}
	
	public void dodajPasazera(Pasazer pasazer) {
		this.pasazerowie.add(pasazer);
	}
	
}
