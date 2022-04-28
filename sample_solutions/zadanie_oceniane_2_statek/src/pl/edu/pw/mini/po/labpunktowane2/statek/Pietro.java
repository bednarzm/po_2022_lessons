package pl.edu.pw.mini.po.labpunktowane2.statek;

import java.util.ArrayList;
import java.util.Random;

public class Pietro {
	private ArrayList<Kajuta> kajuty;
	private int liczbaPasazerow;
	
	public Pietro() {
		this.liczbaPasazerow = 0;
		Random random = new Random();
		int liczbaMiejsc = 2;
		if(random.nextBoolean()) {
			liczbaMiejsc += 2;
		}
		int liczbaKajut = 10+random.nextInt(11);
		this.kajuty = new ArrayList<Kajuta>();
		for(int i = 0; i < liczbaKajut; i++) {
			this.kajuty.add(new Kajuta(liczbaMiejsc));
		}
	}
	
	public void zwiekszLiczbePasazerow() {
		this.liczbaPasazerow++;
	}
	
	public void zmniejszLiczbePasazerow() {
		this.liczbaPasazerow--;
	}
	
	public ArrayList<Kajuta> getKajuty() {
		return this.kajuty;
	}
}
