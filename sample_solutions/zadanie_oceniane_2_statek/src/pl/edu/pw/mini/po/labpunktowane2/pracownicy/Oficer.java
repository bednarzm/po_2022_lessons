package pl.edu.pw.mini.po.labpunktowane2.pracownicy;

import java.util.ArrayList;
import java.util.LinkedList;

import pl.edu.pw.mini.po.labpunktowane2.BrakNaLiscie;
import pl.edu.pw.mini.po.labpunktowane2.pasazer.Pasazer;
import pl.edu.pw.mini.po.labpunktowane2.statek.Kajuta;
import pl.edu.pw.mini.po.labpunktowane2.statek.Pietro;
import pl.edu.pw.mini.po.labpunktowane2.statek.Poklad;

public class Oficer {

	public Oficer() {
	}
	
	public void sprawdzPietra(Pietro[] pietra, LinkedList<Pasazer> listaPasazerow) throws BrakNaLiscie{
		for(Pietro pietro : pietra) {
			ArrayList<Kajuta> kajuty = pietro.getKajuty();
			for(Kajuta kajuta : kajuty) {
				for(Pasazer pasazer : kajuta.getMiejsca()) {
					if(pasazer != null) {
						if(!listaPasazerow.contains(pasazer)) {
							throw new BrakNaLiscie(pasazer);
						}
					}
				}
			}
		}
	}
	
	public void sprawdzPoklad(Poklad poklad, LinkedList<Pasazer> listaPasazerow) throws BrakNaLiscie {
	}
}
