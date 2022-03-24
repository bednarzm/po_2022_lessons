package pl.edu.pw.mini.po.extensions.control;

import java.util.Random;

public class Driver {

	private float bac;
	private DrivingLicense drivingLicense;

	public Driver() {
		Random random = new Random();

		int age = 16 + random.nextInt(51);

		int value = random.nextInt(10);
		String name;
		if (value < 5) {
			name = "Ania";
		} else if (value > 4 && value < 8) {
			name = "Stefan";
		} else {
			name = "Kazimierz";
		}
		
		if(random.nextBoolean()) {
			drivingLicense = new DrivingLicense(age, name);
		}

		bac = 4 * random.nextFloat();

	}

	public DrivingLicense getDrivingLicense() {
		return drivingLicense;
	}

	public float getBac() {
		return bac;
	}

	@Override
	public String toString() {
		return "Driver [bac=" + bac + ", drivingLicense=" + drivingLicense + "]";
	}

}
