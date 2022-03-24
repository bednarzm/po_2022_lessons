package pl.edu.pw.mini.zad1.ground;

import java.util.Random;

public class Earthworm extends GroundObject{
	
	private double mass;
	
	public Earthworm(int nutritionalValue) {
		super(nutritionalValue);
		this.mass = new Random().nextDouble()*0.5 + 0.5;
	}

	@Override
	public String repr() {
		return "{}";
	}
}
