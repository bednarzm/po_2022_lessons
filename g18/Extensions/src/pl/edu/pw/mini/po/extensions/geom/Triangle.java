package pl.edu.pw.mini.po.extensions.geom;

public class Triangle extends AngledFigure {
	
	private double a, h;
	
	@Override
	public double calculateArea() {
		return 0.5 * a * h;
	}

	@Override
	public double calculateAngleSum() {
		return 0;
	}
	
	
	
}
