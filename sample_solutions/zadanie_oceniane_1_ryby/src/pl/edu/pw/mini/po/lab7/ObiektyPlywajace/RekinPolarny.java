package pl.edu.pw.mini.po.lab7.ObiektyPlywajace;

import java.util.Random;

public class RekinPolarny extends Ryba{
	
	private short wiek;
	
	public RekinPolarny() {
		super();
		Random random = new Random();
		this.waga = (short) (random.nextInt(1001) + 500);
		this.wiek = (short) (random.nextInt(101) + 300);
	}
	
}
