package pl.edu.pw.mini.po.extensions.geom;

public class Cube extends ThreeDFigure {
	
	private double a;

	@Override
	public double calculateArea() {
		return 6 * a * a;
	}

	@Override
	public double calculateVolume() {
		return Math.pow(a, 3);
	}
	
}
