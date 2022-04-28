package pl.edu.pw.mini.po.labpunktowane2.statek;

import pl.edu.pw.mini.po.labpunktowane2.pasazer.Pasazer;

public class Kajuta {
	
	private Pasazer[] miejsca;
	private int liczbaMiejsc;
	
	public Kajuta(int liczbaMiejsc) {
		this.liczbaMiejsc = liczbaMiejsc;
		this.miejsca = new Pasazer[liczbaMiejsc];
	}
	
	public Pasazer[] getMiejsca() {
		return this.miejsca;
	}
	
	public int getLiczbaMiejsc() {
		return this.liczbaMiejsc;
	}
}
