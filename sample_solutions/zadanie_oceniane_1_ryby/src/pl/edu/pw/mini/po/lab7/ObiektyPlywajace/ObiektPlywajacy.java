package pl.edu.pw.mini.po.lab7.ObiektyPlywajace;

import pl.edu.pw.mini.po.lab7.akwen.Akwen;

public abstract class ObiektPlywajacy {
	protected int[] pozycja;
	
	protected ObiektPlywajacy() {
	}
	
	public int[] getPozycja() {
		return this.pozycja;
	}
	
	public void setPozycja(int[] pozycja) {
		this.pozycja = pozycja;
	}

	public abstract void move(Akwen akwen);
}
