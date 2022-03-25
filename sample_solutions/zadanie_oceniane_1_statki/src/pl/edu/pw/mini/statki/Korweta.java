package pl.edu.pw.mini.statki;

import java.util.Random;

import pl.edu.pw.mini.dodatki.Plansza;

public class Korweta extends Statek{
	private String nazwa;
	private int numerSzczegolowy;
	private int rakiety;
	private int wystrzymalosc;
	public  int pozycjaX;
	public  int pozycjaY;
	private static int liczbaKorwet=0;
	
	
	public Korweta(Plansza plansza) {
		super(plansza);
		liczbaKorwet++;
		this.numerSzczegolowy=liczbaKorwet;
		this.nazwa = "Korweta "+liczbaKorwet;
		Random losowanko = new Random();
		this.rakiety = losowanko.nextInt(4);
		this.wystrzymalosc = 1;
	}
	public String getString() {return("K");}
	public void ostrzal() {
		super.ostrzal();
	}
}
