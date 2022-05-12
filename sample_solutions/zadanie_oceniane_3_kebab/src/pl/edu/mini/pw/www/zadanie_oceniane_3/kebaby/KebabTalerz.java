package pl.edu.mini.pw.www.zadanie_oceniane_3.kebaby;

import java.util.Scanner;

import pl.edu.mini.pw.www.zadanie_oceniane_3.exceptions.UnknownTypeOfMeatException;
import pl.edu.mini.pw.www.zadanie_oceniane_3.exceptions.ItDoesntLookLikeFiresException;
import pl.edu.mini.pw.www.zadanie_oceniane_3.features.MyVisitor;

public class KebabTalerz extends Kebab {
	
	private Dodatek dodatek;
	private boolean czyNaWynos;
	
	
	public KebabTalerz(String line) throws UnknownTypeOfMeatException, ItDoesntLookLikeFiresException {
		super();
		
		Scanner scanner = new Scanner(line);
		scanner.useDelimiter("---");
		
		this.rozmiar = Rozmiar.valueOf(scanner.next());
		
		try {
			this.dodatek = Dodatek.valueOf(scanner.next());
		} catch (IllegalArgumentException e) {
			scanner.close();
			throw new ItDoesntLookLikeFiresException("It doesn't look like fires...");
		}
		
		try {
			this.mieso = Mieso.valueOf(scanner.next());
		} catch (IllegalArgumentException e) {
			scanner.close();
			throw new UnknownTypeOfMeatException("Nie znana nazwa miesa.");
		}
		this.waga = scanner.nextInt();
		this.czyNaWynos = scanner.nextBoolean();
		this.cena = Double.parseDouble(scanner.next());
		
		scanner.close();
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KebabTalerz other = (KebabTalerz) obj;
		if (czyNaWynos != other.czyNaWynos)
			return false;
		if (dodatek != other.dodatek)
			return false;
		return super.equals(obj);
	}
	
	@Override
	public Kebab accept(MyVisitor v) {
		if (mieso.equals(Mieso.kurczak) & (rozmiar.equals(Rozmiar.M) | rozmiar.equals(Rozmiar.L))) return this;
		else return null;
	}


	@Override
	public String toString() {
		return "Kebab na talerzu: " + super.toString() + ", na wynos?: " + czyNaWynos + ", z dodatkiem: " + dodatek;
	}


	private enum Dodatek {
		ryz, kasza, frytki;
	}

}
