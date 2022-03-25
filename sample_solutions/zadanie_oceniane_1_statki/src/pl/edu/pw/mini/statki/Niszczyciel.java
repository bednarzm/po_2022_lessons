package pl.edu.pw.mini.statki;

import java.util.Random;

import pl.edu.pw.mini.dodatki.Plansza;

public class Niszczyciel extends Statek{
	private String nazwa;
	private int numerSzczegolowy;
	private int rakiety;
	private int wystrzymalosc;
	public  int pozycjaX;
	public  int pozycjaY;
	private static int liczbaNiszczycieli=0;
	
	public Niszczyciel(Plansza plansza) {
		super(plansza);
		liczbaNiszczycieli++;
		this.numerSzczegolowy=liczbaNiszczycieli;
		this.nazwa = "Niszczyciel "+liczbaNiszczycieli;
		Random losowanko = new Random();
		this.rakiety = losowanko.nextInt(20);
		this.wystrzymalosc = 5;
	}
	public String getString() {return("N");}
	public void ostrzal() {
		super.ostrzal();
	}
}
