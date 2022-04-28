package pl.edu.pw.mini.po.labpunktowane2;

import java.util.LinkedHashSet;

import pl.edu.pw.mini.po.labpunktowane2.pasazer.Pasazer;

public class Nabrzeze {
	private LinkedHashSet<Pasazer> pasazerowie;
	
	public Nabrzeze(int liczbaPasazerow) {
		this.pasazerowie = new LinkedHashSet<Pasazer>();
		for(int i = 0; i < liczbaPasazerow; i++) {
			this.pasazerowie.add(new Pasazer());
		}
	}
	
	public LinkedHashSet<Pasazer> getPasazerowie() {
		return this.pasazerowie;
	}
}
