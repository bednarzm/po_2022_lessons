package pl.edu.pw.mini.po.extensions.control;

public class Car {

	private Driver driver = new Driver();

	public Driver getDriver() {
		return driver;
	}

	@Override
	public String toString() {
		return "Car [driver=" + driver + "]";
	}
	
}
