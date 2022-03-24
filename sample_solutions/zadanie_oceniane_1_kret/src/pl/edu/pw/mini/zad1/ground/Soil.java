package pl.edu.pw.mini.zad1.ground;

import java.util.Random;

public class Soil extends GroundObject{
	
	private double density;
	
	public Soil(int nutritionalValue) {
		super(nutritionalValue);
		this.density = new Random().nextDouble() + 1.4;
	}

	@Override
	public String repr() {
		return "#";
	}
}
