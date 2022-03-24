package pl.edu.pw.mini.zad1.environment;

import java.util.Random;

import pl.edu.pw.mini.zad1.ground.Earthworm;
import pl.edu.pw.mini.zad1.ground.Soil;
import pl.edu.pw.mini.zad1.mole.Mole;
import pl.edu.pw.mini.zad1.mole.MoleMotion;
import pl.edu.pw.mini.zad1.mole.Species;
import pl.edu.pw.mini.zad1.ground.Larva;
import pl.edu.pw.mini.zad1.ground.GroundObject;

public class Environment {

	private static final int EARTHWORM_VALUE = 3;
	private static final int SOIL_VALUE = 0;
	
	
	private int m;
	private int n;
	
	private MoleMotion moleMotion;
	private GroundObject[][] env;
	
	public Environment(int m, int n, int larvaCount, int earthwormCount) {
		this.m = m; this.n = n;
		env = new GroundObject[m][n];
		Random rand = new Random();
		int x = rand.nextInt(m);
		int y = rand.nextInt(n);
		
		for(int i = 0 ; i < larvaCount ; i++) {
			while(env[x][y] != null) {
				x = rand.nextInt(m);
				y = rand.nextInt(n);
			}
			env[x][y] = new Larva(rand.nextInt(3) + 3);
		}
		for(int i = 0 ; i < earthwormCount ; i++) {
			while(env[x][y] != null) {
				x = rand.nextInt(m);
				y = rand.nextInt(n);
			}
			env[x][y] = new Earthworm(EARTHWORM_VALUE);
		}
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(env[i][j] == null)
					env[i][j] = new Soil(SOIL_VALUE);
			}
		}
	}
	
	public Environment(int m, int n, int larvaCount, int earthwormCount, Species moleSpecies) {
		this(m, n, larvaCount, earthwormCount);
		this.moleMotion = new Mole(moleSpecies, this.env);
	}
	
	public void runMole() {
		for(int i = 0 ; i < 10 ; i++) {
			moleMotion.goMole();
			printEnv();
		}
	}
	
	public void printEnv() {
		for(int i = 0 ; i < this.m ; i++) {
			for(int j = 0 ; j < this.n ; j++) {
				if(env[i][j] == null)
					System.out.print(" ");
				else
					System.out.print(env[i][j].repr());
			}
			System.out.println("");
		}
		System.out.println("");
	}

}
