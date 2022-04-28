package pl.edu.pw.mini.po.labpunktowane2;

import pl.edu.pw.mini.po.labpunktowane2.pasazer.Pasazer;

public class BrakNaLiscie extends RuntimeException{
	
	Pasazer pasazer;
	
	public BrakNaLiscie(Pasazer pasazer) {
		super();
		this.pasazer = pasazer;
		System.err.println("Brak pasażera na liście");
	}
	
	public Pasazer getPasazer() {
		return this.pasazer;
	}
}
