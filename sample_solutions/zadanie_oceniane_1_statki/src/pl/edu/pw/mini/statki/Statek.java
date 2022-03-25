package pl.edu.pw.mini.statki;

import java.util.Random;

import pl.edu.pw.mini.dodatki.Plansza;

public class Statek {
	private String nazwa;
	private int numerOgolny;
	private int numerSzczegolowy;
	private int rakiety;
	private int wystrzymalosc;
	private int trafienia;
	public int pozycjaX;
	public int pozycjaY;
	private static int liczbaStatkow=0;
	Plansza plansza;
	public String getString() {return("s");}
	public Statek(Plansza plansza) {
		liczbaStatkow++;
		this.numerOgolny= liczbaStatkow;
		this.trafienia = 0;
		this.plansza=plansza;
	}
	public Statek() {
		//wykorzystywany podczas tworzenia planszy
	}
	public void ostrzal() {
		this.trafienia+=1;
		if (this.wystrzymalosc==this.trafienia) {
			System.out.println("Okręt " + nazwa + " został trafiony i ZATOPIONY");
			plansza.plansza[pozycjaX][pozycjaY] = null;
		}
		else {System.out.println("Okręt " + nazwa + " został trafiony");this.rusz();}
	}
	private void rusz() {
		Random losowanko = new Random();
		Boolean kierunek = losowanko.nextBoolean();
		if (kierunek) {
			kierunek = losowanko.nextBoolean();
			if (kierunek) {
				
			}
			else {
				
			}
		}
		else {
			if (kierunek) {
				
			}
			else {
				
			}
			
		}
	}
}
