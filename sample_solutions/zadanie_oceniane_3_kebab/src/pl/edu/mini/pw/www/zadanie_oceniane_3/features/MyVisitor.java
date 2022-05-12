package pl.edu.mini.pw.www.zadanie_oceniane_3.features;

import java.util.LinkedList;
import java.util.List;

import pl.edu.mini.pw.www.zadanie_oceniane_3.kebaby.Kebab;

public class MyVisitor {
	
	public List<Kebab> naTalerzu(List<Kebab> kebaby) {
		
		List<Kebab> naTalerzu = new LinkedList<>();
		
		for (Kebab kebab : kebaby) {
			if (kebab.accept(this) != null) naTalerzu.add(kebab);
		}
		
		return naTalerzu;
		
	}

}
