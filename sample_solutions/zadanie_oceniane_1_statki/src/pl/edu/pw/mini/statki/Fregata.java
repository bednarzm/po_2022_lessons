package pl.edu.pw.mini.statki;

import java.util.Random;

import pl.edu.pw.mini.dodatki.Plansza;

public class Fregata extends Statek{
	private String nazwa;
	private int numerSzczegolowy;
	private int rakiety;
	private int wystrzymalosc;
	public  int pozycjaX;
	public  int pozycjaY;
	private static int liczbaFregat=0;
	
	
	public Fregata(Plansza plansza) {
		super(plansza);
		liczbaFregat++;
		this.numerSzczegolowy=liczbaFregat;
		this.nazwa = "Fregata "+liczbaFregat;
		Random losowanko = new Random();
		this.rakiety = losowanko.nextInt(6);
		this.wystrzymalosc = 3;
	}
	public String getString() {return("F");}
	public void ostrzal() {
		super.ostrzal();
	}
}
