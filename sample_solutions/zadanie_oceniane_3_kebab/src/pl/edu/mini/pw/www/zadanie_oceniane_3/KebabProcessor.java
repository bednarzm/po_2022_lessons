package pl.edu.mini.pw.www.zadanie_oceniane_3;

import java.util.List;

import pl.edu.mini.pw.www.zadanie_oceniane_3.features.MyVisitor;
import pl.edu.mini.pw.www.zadanie_oceniane_3.kebaby.Kebab;

public class KebabProcessor {
	
	public static List<Kebab> kebabyNaTalerzu(List<Kebab> kebaby) {
		
		MyVisitor v = new MyVisitor();
		
		List<Kebab> kebabyNaTalerzu = v.naTalerzu(kebaby);
		
		return kebabyNaTalerzu;
		
	}
	
	public static void getSummary(List<Kebab> kebaby) {
		
		double counter = 0;
		double sumPrice = 0;
		int sumWeight = 0;
		
		for (Kebab kebab : kebaby) {
			
			counter++;
			sumPrice += kebab.getCena();
			sumWeight += kebab.getWaga();
			
			System.out.println(kebab);
		}
		
		System.out.println("\n\n------SUMMARY------");
		System.out.println("Average price: " + sumPrice / counter + " zl");
		System.out.println("Total weigth: " + sumWeight + "g\n\n");
		
	}

}
