package pl.edu.pw.mini.zad1.ground;

public abstract class GroundObject {

	private int nutritionalValue;
	
	public GroundObject(int nutritionalValue) {
		this.nutritionalValue = nutritionalValue;
	}

	public int getNutritionalValue() {
		return nutritionalValue;
	}
	
	public abstract String repr();
	
}
