package pl.edu.pw.mini.po.extendsions;

import java.util.Random;

public class ExtensionsDemonstrator {

	public static void main(String[] args) {
		
		Guard guard = new Guard();
		for(int i=0;i<100;i++) {
			DiscoGuest discoGuest = generateDiscoGuest();
			System.out.println("Entered? " + guard.checkGuest(discoGuest));
		}
		
	}

	private static DiscoGuest generateDiscoGuest() {
		DiscoGuest result = null;
		Random random = new Random();
		
		int option = random.nextInt(10);
		if(option < 5) {
			result = new DiscoGuest("Ania");
		} else if (option > 4 && option < 7) {
			result = new DiscoGuest("Stefan");
		} else {
			result = new DiscoGuest("Kazik");
		}
		
		return result;
	}
	
}
