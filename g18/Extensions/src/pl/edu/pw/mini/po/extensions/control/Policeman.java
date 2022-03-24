package pl.edu.pw.mini.po.extensions.control;

public class Policeman {

	public boolean checkCar(Car car) {
		boolean result = false;

		Driver driver = car.getDriver();

		if (driver.getDrivingLicense() != null) {
			result = true;
		}

		return result;
	}

}
