package pl.edu.pw.mini.po.extensions.geom;

public class Oval extends Figure {
	
	private double r;
	
	@Override
	public double calculateArea() {
		return Math.PI * r * r;
	}
	
	private double generate() {
		return Math.sqrt(getId());
	}
	
}
