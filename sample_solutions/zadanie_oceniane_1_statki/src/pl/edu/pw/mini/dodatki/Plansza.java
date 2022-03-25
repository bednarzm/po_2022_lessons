package pl.edu.pw.mini.dodatki;

import pl.edu.pw.mini.statki.Statek;

public class Plansza {
	public Statek [][] plansza;
	public Plansza() {
		this.plansza = new Statek[100][100];
		for (int i=0;i<100;i++) {
			for (int j=0;j<100;j++) {
				plansza[i][j]=null;
			}
		}
	}
}
