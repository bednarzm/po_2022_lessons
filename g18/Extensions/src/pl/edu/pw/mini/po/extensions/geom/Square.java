package pl.edu.pw.mini.po.extensions.geom;

public class Square extends AngledFigure {
	
	private double a;
	
	@Override
	public double calculateArea() {
		return a * a;
	}

	@Override
	public double calculateAngleSum() {
		return 0;
	}
	
}
