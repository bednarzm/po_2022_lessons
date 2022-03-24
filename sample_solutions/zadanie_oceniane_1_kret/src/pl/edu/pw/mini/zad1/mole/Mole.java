package pl.edu.pw.mini.zad1.mole;

import java.util.Random;

import pl.edu.pw.mini.zad1.ground.GroundObject;

public class Mole implements MoleMotion{
	private Species species;
	private int nutritionalValue;
	private GroundObject[][] env;
	
	private int m;
	private int n;
	
	public Mole(Species species, GroundObject[][] env) {

		this.species = species;
		this.env = env;
		
		this.m = this.env.length;
		this.n = this.env[0].length;
		
		this.nutritionalValue = new Random().nextInt(41) + 200;
	}

	@Override
	public void goMole() {
		Random rand = new Random();
		int x = rand.nextInt(this.m);
		int y = rand.nextInt(this.n);
		
		if(env[x][y] == null) {
			System.out.println("Pusto :(");
		}
		else {
			int val = env[x][y].getNutritionalValue();
			nutritionalValue += val;
			System.out.print("Mniam! ");
			System.out.print("Pozycja: (" + x + ", " + y + "); ");
			System.out.println("skonsumowana wartosc odzywcza: " + val);
			env[x][y] = null;			
		}
		
	}

	@Override
	public String getNutritionalValue() {
		return Integer.toString(nutritionalValue);
	}
	
}
