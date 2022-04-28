package pl.edu.pw.mini.po.labpunktowane2.statek;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Random;

import pl.edu.pw.mini.po.labpunktowane2.Nabrzeze;
import pl.edu.pw.mini.po.labpunktowane2.pasazer.Pasazer;
import pl.edu.pw.mini.po.labpunktowane2.pracownicy.Kapitan;
import pl.edu.pw.mini.po.labpunktowane2.pracownicy.Oficer;

public class Statek<T extends Movable>{
	
	LinkedList<Pasazer> listaPasazerow;
	Kapitan kapitan;
	HashSet<Oficer> oficerowie;
	public static int liczbaPieter = 7;
	Pietro[] pietra;
	Poklad poklad;
	T maszynownia;
	
	public Statek(T maszynownia) {
		this.listaPasazerow = new LinkedList<Pasazer>();
		this.pietra = new Pietro[Statek.liczbaPieter];
		for(int i = 0; i < Statek.liczbaPieter;  i++) {
			this.pietra[i] = new Pietro();
		}
		this.poklad = new Poklad();
		this.kapitan = new Kapitan(this, this.pietra, this.poklad, this.listaPasazerow);
		this.oficerowie = new HashSet<Oficer>();
		Random random = new Random();
		int liczbaOficerow = random.nextInt(5)+1;
		for(int i = 0; i < liczbaOficerow; i++) {
			this.oficerowie.add(new Oficer());
		}
		this.maszynownia = maszynownia;
	}
	
	public static void main(String[] args) {
		
		Maszynownia maszynownia = new Maszynownia();
		Statek<Maszynownia> statek = new Statek<Maszynownia>(maszynownia);
		Nabrzeze nabrzeze = new Nabrzeze(500);
		LinkedHashSet<Pasazer> pasazerowie = nabrzeze.getPasazerowie();
		for(Pasazer pasazer : pasazerowie) {
			statek.getKapitan().dodajPasazera(pasazer);
		}
		
		for(int i = 0; i < 100; i++) {
			statek.getKapitan().ruszamy();
		}
		statek.getKapitan().stoimy();
	}

	public LinkedList<Pasazer> getListaPasazerow() {
		return listaPasazerow;
	}

	public void setListaPasazerow(LinkedList<Pasazer> listaPasazerow) {
		this.listaPasazerow = listaPasazerow;
	}

	public Kapitan getKapitan() {
		return kapitan;
	}

	public void setKapitan(Kapitan kapitan) {
		this.kapitan = kapitan;
	}

	public HashSet<Oficer> getOficerowie() {
		return oficerowie;
	}

	public void setOficerowie(HashSet<Oficer> oficerowie) {
		this.oficerowie = oficerowie;
	}

	public static int getLiczbaPieter() {
		return liczbaPieter;
	}

	public static void setLiczbaPieter(int liczbaPieter) {
		Statek.liczbaPieter = liczbaPieter;
	}

	public Pietro[] getPietra() {
		return pietra;
	}

	public void setPietra(Pietro[] pietra) {
		this.pietra = pietra;
	}

	public Poklad getPoklad() {
		return poklad;
	}

	public void setPoklad(Poklad poklad) {
		this.poklad = poklad;
	}

	public T getMaszynownia() {
		return maszynownia;
	}

	public void setMaszynownia(T maszynownia) {
		this.maszynownia = maszynownia;
	}
	
	
	
}
