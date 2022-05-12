package pl.edu.mini.pw.www.zadanie_oceniane_3;

import java.util.List;

import pl.edu.mini.pw.www.zadanie_oceniane_3.kebaby.Kebab;

public class Demonstrator {

	public static void main(String[] args) {
		
		System.out.println("---------START---------\n\n");
		
		List<Kebab> kebaby = KebabParser.parseKebab("/kebaby.txt");
		
		KebabProcessor.getSummary(kebaby);
		
		List<Kebab> kebabyNaTalerzu = KebabProcessor.kebabyNaTalerzu(kebaby);
		
		KebabProcessor.getSummary(kebabyNaTalerzu);
		
		System.out.println("\n----------------------\nTry to parse bad kebabs: \n");
		
		List<Kebab> falszyweKebaby = KebabParser.parseKebab("/kebaby_bad.txt");
		
		KebabProcessor.getSummary(falszyweKebaby);
		
		
		System.out.println("\n\n----------END----------");
		
	}

}
