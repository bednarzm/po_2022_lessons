package pl.edu.pw.mini.po.part2collections.collections.data.model.other;

public class EnginePowerComparedCar extends Car implements Comparable<EnginePowerComparedCar>{

	public EnginePowerComparedCar(String make, int enginePower) {
		super(make, enginePower);
	}

	@Override
	public int compareTo(EnginePowerComparedCar o) {
		return enginePower == o.enginePower ? 0 : (enginePower < o.enginePower ? -1 : 1);
	}

}
