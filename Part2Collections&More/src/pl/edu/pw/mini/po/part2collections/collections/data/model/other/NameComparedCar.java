package pl.edu.pw.mini.po.part2collections.collections.data.model.other;

public class NameComparedCar extends Car implements Comparable<NameComparedCar>{

	public NameComparedCar(String make, int enginePower) {
		super(make, enginePower);
	}

	@Override
	public int compareTo(NameComparedCar o) {
		return (-1) * make.compareTo(o.make);
	}

}
