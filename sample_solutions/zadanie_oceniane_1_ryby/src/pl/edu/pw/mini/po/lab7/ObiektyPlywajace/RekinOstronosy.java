package pl.edu.pw.mini.po.lab7.ObiektyPlywajace;

import java.util.Random;

public class RekinOstronosy extends Ryba{

	public RekinOstronosy() {
		super();
		Random random = new Random();
		this.waga = (short) (random.nextInt(201) + 200);
	}
	
}
