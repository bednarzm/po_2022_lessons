package pl.edu.pw.mini.po.labpunktowane2;

public class Awaria extends RuntimeException{
	
	public Awaria() {
		super();
		System.err.println("Doszło do awarii maszynowni");
	}
}
