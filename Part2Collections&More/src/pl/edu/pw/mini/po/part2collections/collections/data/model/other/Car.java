package pl.edu.pw.mini.po.part2collections.collections.data.model.other;

public class Car {

	protected String make;
	protected int enginePower;

	public Car(String make, int enginePower) {
		this.make = make;
		this.enginePower = enginePower;
	}

	public int getEnginePower() {
		return enginePower;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", enginePower=" + enginePower + "]";
	}

}
