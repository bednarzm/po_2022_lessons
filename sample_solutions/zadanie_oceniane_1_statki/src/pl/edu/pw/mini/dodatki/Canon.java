package pl.edu.pw.mini.dodatki;

import java.util.Random;

import pl.edu.pw.mini.statki.Statek;

public class Canon {
	Plansza plansza;
	public Canon(Plansza plansza) {
		this.plansza = plansza;
	}
	public void probaStrzalu() {
		Random losowanko = new Random();
		int x = losowanko.nextInt(100)-1;
		int y = losowanko.nextInt(100)-1;
		if (plansza.plansza[x][y]!=null) {
			this.ostrzal(plansza.plansza[x][y]);
		}
	}
	private void ostrzal(Statek statek) {
		statek.ostrzal();
	}
}
