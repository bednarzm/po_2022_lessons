package pl.edu.pw.mini.po.extensions.control;

public class MartinetPoliceman extends Policeman {
	
	public boolean checkCar(Car car) {
		boolean result = false;
		
		result = super.checkCar(car);
		
		Driver driver = car.getDriver();
		if(driver.getBac() >= 0.5) {
			result = false;
			System.out.println("Uuuuu niedobrze!");
		} else if(driver.getBac() < 0.5 && driver.getBac() > 0.2) {
			result = false;
			System.out.println("Uuuuu Tez niedobrze!");
		} else {
			result = true;
		}
		
		return result;
	}

}
