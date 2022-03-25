package pl.edu.pw.mini.po.lab7.ObiektyPlywajace;

import java.util.Random;

public class Trwaler extends Statek {
	
	private byte licznoscZalogi;
	
	public Trwaler() {
		super();
		Random random = new Random();
		this.licznoscZalogi = (byte) (random.nextInt(30) + 1);
	}
	
}
