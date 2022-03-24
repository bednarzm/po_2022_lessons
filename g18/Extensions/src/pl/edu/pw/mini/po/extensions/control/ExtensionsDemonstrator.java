package pl.edu.pw.mini.po.extensions.control;

public class ExtensionsDemonstrator {

	public static void main(String[] args) {
		
		//Policeman policeman = new Policeman();
		MartinetPoliceman martinetPoliceman = new MartinetPoliceman();
		
		for(int i=0;i<10;i++) {
			Car car = new Car();
			System.out.println("Kontrola samochodu " + car + " rezultat: " + martinetPoliceman.checkCar(car));
		}
		
	}

}
