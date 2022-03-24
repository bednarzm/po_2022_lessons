package pl.edu.pw.mini.zad1.ground;

import java.util.Random;

public class Larva extends GroundObject{
	
	private double mass;
	
	
	public Larva(int nutritionalValue) {
		super(nutritionalValue);
		this.mass = new Random().nextDouble() + 2;
	}


	@Override
	public String repr() {
		return "@";
	}
	
}
