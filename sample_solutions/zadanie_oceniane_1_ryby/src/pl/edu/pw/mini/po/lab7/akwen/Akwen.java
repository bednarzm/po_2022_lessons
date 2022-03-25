package pl.edu.pw.mini.po.lab7.akwen;

import pl.edu.pw.mini.po.lab7.ObiektyPlywajace.*;

public class Akwen {
	private ObiektPlywajacy[][] plansza;

	public ObiektPlywajacy[][] getPlansza() {
		return plansza;
	}

	public Akwen() {
		this.plansza = new ObiektPlywajacy[100][100];
	}
	
	public void wstawObiekt(int[] pozycja, ObiektPlywajacy obiekt) {
		this.plansza[pozycja[0]][pozycja[1]] = obiekt;
	}
	
	public void usunObiekt(int[] pozycja) {
		this.plansza[pozycja[0]][pozycja[1]] = null;
	}
	
	public ObiektPlywajacy getObiekt(int[] pozycja) {
		return plansza[pozycja[0]][pozycja[1]];
	}
	
	@Override
	public String toString() {
		String string = "";
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				if(plansza[i][j] == null) {
					string+="~";
				} else if(plansza[i][j] instanceof Kuter) {
					string+="K";
				} else if(plansza[i][j] instanceof Trwaler) {
					string+="T";
				} else if(plansza[i][j] instanceof RekinPolarny) {
					string+="p";
				} else if(plansza[i][j] instanceof RekinOstronosy) {
					string+="o";
				}
			}
			string+="\n";
		}
		return string;
	}
}
