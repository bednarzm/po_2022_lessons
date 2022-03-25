package pl.edu.pw.mini.dodatki;

import java.util.Random;

import pl.edu.pw.mini.statki.Statek;
import pl.edu.pw.mini.GraInterface;
import pl.edu.pw.mini.statki.Fregata;
import pl.edu.pw.mini.statki.Korweta;
import pl.edu.pw.mini.statki.Niszczyciel;

public class Gra implements GraInterface{
	Plansza plansza;
	Generator generator;
	Canon canon;
	
	public Gra(int n, int f, int k) {
		this.plansza = new Plansza();
		this.generator = new Generator(this.plansza);
		this.canon = new Canon(this.plansza);
		this.Inicjalize(n, f, k);
	}
	public Gra() {
		this.plansza = new Plansza();
		this.generator = new Generator(this.plansza);
		this.canon = new Canon(this.plansza);
		this.Inicjalize(100,500,1000);
	}
	private void Inicjalize(int n, int f, int k) {
		for (int i=0;i<n;i++) {
			this.generator.Generuj(new Niszczyciel(this.plansza));
		}
		for (int i=0;i<f;i++) {
			this.generator.Generuj(new Fregata(this.plansza));
		}
		for (int i=0;i<k;i++) {
			this.generator.Generuj(new Korweta(this.plansza));
		}
	}
	@Override
	public void wypisz() {
		for (int i=0;i<100;i++) {
			for (int j=0;j<100;j++) {
				if (plansza.plansza[i][j]==null)
					{System.out.print("~");}
				else {System.out.print(plansza.plansza[i][j].getString());} //getString zamiast getSymbol
			}
			System.out.println();
		}
	}
	@Override
	public void graj(int liczbaTur) {
		for (int i=0;i<liczbaTur;i++) {
			System.out.println("Tura numer" + (i+1));
			for (int j=0;j<10;j++) {
				this.canon.probaStrzalu();
			}
		}
		
	}
	
}
