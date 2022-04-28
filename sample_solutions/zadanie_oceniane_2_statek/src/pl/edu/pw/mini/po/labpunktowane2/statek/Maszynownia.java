package pl.edu.pw.mini.po.labpunktowane2.statek;

import pl.edu.pw.mini.po.labpunktowane2.Awaria;

public class Maszynownia implements Movable {
	
	private int licznikAwarii;
	
	public void plyn() throws Awaria{
		if(this.licznikAwarii%20 == 0) {
			this.licznikAwarii++;
			throw new Awaria();
		} else {
			this.licznikAwarii++;
			System.out.println("Płynę");		
		}
	}
	
	public void stoj() {
		System.out.println("Stoję");
	}
	
	public Maszynownia() {
		this.licznikAwarii = 0;
	}
	
}
