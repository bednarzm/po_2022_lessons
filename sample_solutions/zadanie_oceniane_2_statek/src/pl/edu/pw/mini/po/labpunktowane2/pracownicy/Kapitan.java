package pl.edu.pw.mini.po.labpunktowane2.pracownicy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

import pl.edu.pw.mini.po.labpunktowane2.Awaria;
import pl.edu.pw.mini.po.labpunktowane2.BrakNaLiscie;
import pl.edu.pw.mini.po.labpunktowane2.pasazer.Pasazer;
import pl.edu.pw.mini.po.labpunktowane2.statek.Pietro;
import pl.edu.pw.mini.po.labpunktowane2.statek.Poklad;
import pl.edu.pw.mini.po.labpunktowane2.statek.Statek;

public class Kapitan {
	
	private Pietro[] pietra;
	private Poklad poklad;
	private LinkedList<Pasazer> listaPasazerow;
	private Statek<?> statek;
	private LinkedList<Pasazer> listaPasazerowPozaLista;
	private int zapisPasazerow;
	
	public Kapitan(Statek<?> statek, Pietro[] pietra, Poklad poklad, LinkedList<Pasazer> listaPasazerow) {
		this.statek = statek;
		this.pietra = pietra;
		this.poklad = poklad;
		this.listaPasazerow = listaPasazerow;
		this.zapisPasazerow = 0;
		this.listaPasazerowPozaLista = new LinkedList<Pasazer>();
	}
	
	public void dodajPasazera(Pasazer pasazer) {
		Random random = new Random();
		Pietro pietro = this.pietra[random.nextInt(7)];
		System.out.println();
		pasazer.setPietro(pietro);
		if(!pasazer.szukajMiejsca()) {
			this.poklad.dodajPasazera(pasazer);
		}
		
		if(this.zapisPasazerow%10!=0) {
			this.listaPasazerow.add(pasazer);
		}
		this.zapisPasazerow += 1;
	}
	
	public void dodajDoListy(Pasazer pasazer) {
		this.listaPasazerow.add(pasazer);
	}
	
	public void dodajDoListyPozaLista(Pasazer pasazer) {
		this.listaPasazerowPozaLista.add(pasazer);
	}
	
	public void ruszamy() {
		try {
			this.statek.getMaszynownia().plyn();
		} catch(Awaria awaria) {
			System.out.println("Koniec Rejsu! Dryfujemy.");
		}
	}
	
	public void stoimy() {
		this.statek.getMaszynownia().stoj();
	}
	
	public void wyslijOficera() {
		try {
			Iterator<Oficer> iter = this.statek.getOficerowie().iterator();
			Random random = new Random();
			int index = random.nextInt(this.statek.getOficerowie().size());
			for(int i = 0; i < index; i++) {
				iter.next();
			}
			Oficer oficer = iter.next();
			oficer.sprawdzPietra(this.pietra, this.listaPasazerow);
		} catch(BrakNaLiscie brakNaLiscie) {
			this.dodajDoListy(brakNaLiscie.getPasazer());
			this.dodajDoListyPozaLista(brakNaLiscie.getPasazer());
		}
	}
	
}
