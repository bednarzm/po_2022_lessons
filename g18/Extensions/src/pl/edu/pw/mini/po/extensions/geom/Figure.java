package pl.edu.pw.mini.po.extensions.geom;

public abstract class Figure {
	
	public abstract double calculateArea();
	
	private static int counter;
	
	private int id = counter++;
	
	public int getId() {
		return id;
	}
	
}
