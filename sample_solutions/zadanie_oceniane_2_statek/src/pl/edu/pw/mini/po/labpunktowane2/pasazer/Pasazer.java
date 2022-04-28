package pl.edu.pw.mini.po.labpunktowane2.pasazer;

import java.util.List;

import pl.edu.pw.mini.po.labpunktowane2.statek.Kajuta;
import pl.edu.pw.mini.po.labpunktowane2.statek.Pietro;

public class Pasazer {
	
	Pietro pietro;
	
	public Pasazer() {
	}
	
	public void setPietro(Pietro pietro) {
		this.pietro = pietro;
	}
	
	public boolean szukajMiejsca() {
		List<Kajuta> kajuty = this.pietro.getKajuty();
		for(Kajuta kajuta : kajuty) {
			Pasazer[] miejsca = kajuta.getMiejsca();
			int liczbaMiejsc = kajuta.getLiczbaMiejsc();
			for(int i = 0; i < liczbaMiejsc; i++) {
				if(miejsca[i]==null) {
					miejsca[i] = this;
					this.pietro.zwiekszLiczbePasazerow();
					return true;
				}
			}
		}
		return false;
	}
	
}
