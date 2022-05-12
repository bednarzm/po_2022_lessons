package pl.edu.mini.pw.www.zadanie_oceniane_3.kebaby;

import java.util.Scanner;

import pl.edu.mini.pw.www.zadanie_oceniane_3.exceptions.UnknownTypeOfMeatException;
import pl.edu.mini.pw.www.zadanie_oceniane_3.features.MyVisitor;

public class KebabCiasto extends Kebab {
	
	private boolean czyGrube;
	
	
	public KebabCiasto(String line) throws UnknownTypeOfMeatException {
		super();
		
		Scanner scanner = new Scanner(line);
		scanner.useDelimiter("---");
		
		try {
			this.rozmiar = Rozmiar.valueOf(scanner.next());
			this.czyGrube = scanner.nextBoolean();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(line);
			System.exit(-1);
		}
	
		try {
			this.mieso = Mieso.valueOf(scanner.next());
		} catch (IllegalArgumentException e) {
			scanner.close();
			System.out.println(line);
			throw new UnknownTypeOfMeatException("Nie znana nazwa miesa.");
		}
			
		this.waga = scanner.nextInt();
		this.cena = Double.parseDouble(scanner.next());
			
			
		scanner.close();
		
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		KebabCiasto other = (KebabCiasto) obj;
		if (czyGrube != other.czyGrube)
			return false;
		return super.equals(obj);
	}
	
	@Override
	public Kebab accept(MyVisitor v) {
		return null;
	}


	@Override
	public String toString() {
		return "Kebab w ciescie: " + super.toString() + ", na grubym?: " + czyGrube;
	}	
	
}
