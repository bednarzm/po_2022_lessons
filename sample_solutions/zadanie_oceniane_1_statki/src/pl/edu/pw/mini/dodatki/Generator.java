package pl.edu.pw.mini.dodatki;

import java.util.Random;

import pl.edu.pw.mini.statki.Statek;

public class Generator {
	Plansza plansza;
	public Generator(Plansza plansza) {
		this.plansza=plansza;
	}
	public void Generuj(Statek statek) {
		Random losowanko = new Random();
		boolean wstawiony = false;
		while (wstawiony==false) {
			int x = losowanko.nextInt(100) % 100;
			int y = losowanko.nextInt(100) % 100;
			if (plansza.plansza[x][y]==null) {
				wstawiony=true;
				plansza.plansza[x][y] = statek;
				statek.pozycjaX=x;
				statek.pozycjaY=y;
			}
		}
	}
}
