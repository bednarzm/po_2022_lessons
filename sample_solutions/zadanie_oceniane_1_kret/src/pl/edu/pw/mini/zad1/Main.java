package pl.edu.pw.mini.zad1;

import pl.edu.pw.mini.zad1.environment.Environment;
import pl.edu.pw.mini.zad1.mole.Species;

public class Main {

	public static void main(String[] args) {
		Environment env = new Environment(5, 5, 4, 5, Species.EUROPAEA);
		env.printEnv();
		env.runMole();
	}

}
