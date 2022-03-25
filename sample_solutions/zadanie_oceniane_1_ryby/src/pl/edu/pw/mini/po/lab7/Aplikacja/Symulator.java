package pl.edu.pw.mini.po.lab7.Aplikacja;

import java.util.ArrayList;
import java.util.Random;

import pl.edu.pw.mini.po.lab7.ObiektyPlywajace.Kuter;
import pl.edu.pw.mini.po.lab7.ObiektyPlywajace.ObiektPlywajacy;
import pl.edu.pw.mini.po.lab7.ObiektyPlywajace.RekinOstronosy;
import pl.edu.pw.mini.po.lab7.ObiektyPlywajace.RekinPolarny;
import pl.edu.pw.mini.po.lab7.ObiektyPlywajace.Trwaler;
import pl.edu.pw.mini.po.lab7.akwen.Akwen;

public class Symulator implements Simulable{

	private Akwen akwen;
	
	private ArrayList<ObiektPlywajacy> obiekty;
	
	public void inicjalizuj(int liczbaRekinowOstronosych, int liczbaRekinowPolarnych, int liczbaKutrow, int liczbaTrwalerow) {
		for(int i = 0; i < liczbaRekinowOstronosych; i++ ) {
			this.generujObiekt("rekin ostronosy");
		}
		for(int i = 0; i < liczbaRekinowPolarnych; i++ ) {
			this.generujObiekt("rekin polarny");
		}
		for(int i = 0; i < liczbaKutrow; i++) {
			this.generujObiekt("kuter");
		}
		for(int i = 0; i < liczbaTrwalerow; i++) {
			
		}
	}
	
	public void generujObiekt(String nazwaObiektu) {
		Random random = new Random();
		int[] pozycja = new int[2];
		while(true) {
			pozycja[0] = random.nextInt(100);
			pozycja[1] = random.nextInt(100);
			if(this.akwen.getPlansza()[pozycja[0]][pozycja[1]] == null) {
				break;
			}
		}
		
		switch(nazwaObiektu.toLowerCase()) {
			case "kuter":
				Kuter kuter = new Kuter();
				this.obiekty.add(kuter);
				kuter.setPozycja(pozycja);
				this.akwen.wstawObiekt(pozycja, kuter);
				break;
			case "trwaler":
				Trwaler trwaler = new Trwaler();
				this.obiekty.add(trwaler);
				trwaler.setPozycja(pozycja);
				this.akwen.wstawObiekt(pozycja, trwaler);
				break;
			case "rekin polarny":
				RekinPolarny rekinPolarny = new RekinPolarny();
				this.obiekty.add(rekinPolarny);
				rekinPolarny.setPozycja(pozycja);
				this.akwen.wstawObiekt(pozycja, rekinPolarny);
				break;
			case "rekin ostronosy":
				RekinOstronosy rekinOstronosy = new RekinOstronosy();
				this.obiekty.add(rekinOstronosy);
				rekinOstronosy.setPozycja(pozycja);
				this.akwen.wstawObiekt(pozycja, rekinOstronosy);
				break;
		}
	}
	
	public Symulator(int liczbaRekinowOstronosych, int liczbaRekinowPolarnych, int liczbaKutrow, int liczbaTrwalerow) {
		this.akwen = new Akwen();
		this.obiekty = new ArrayList<ObiektPlywajacy>();
		inicjalizuj(liczbaRekinowOstronosych, liczbaRekinowPolarnych, liczbaKutrow, liczbaTrwalerow);
	}
	
	public Symulator() {
		this(500, 500, 100, 100);
	}

	public void symuluj(int LiczbaTur) {
		for(int i = 0; i < LiczbaTur; i++) {
			System.out.println("Tura " + i);
			int j = 0;
			while(j < this.obiekty.size()){
				if(this.akwen.getObiekt(this.obiekty.get(j).getPozycja()) != this.obiekty.get(j)) {
					this.obiekty.remove(j);
					continue;
				}
				obiekty.get(j).move(this.akwen);
				j += 1;
			}
		}
	}
	
	public int getLiczbaObiektow() {
		return this.obiekty.size();
	}
	
	public Akwen getAkwen() {
		return this.akwen;
	}
	
}
