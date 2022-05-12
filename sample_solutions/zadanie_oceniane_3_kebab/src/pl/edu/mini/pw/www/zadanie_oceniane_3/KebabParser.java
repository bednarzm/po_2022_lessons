package pl.edu.mini.pw.www.zadanie_oceniane_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.nio.charset.StandardCharsets;

import pl.edu.mini.pw.www.zadanie_oceniane_3.exceptions.UnknownTypeOfMeatException;
import pl.edu.mini.pw.www.zadanie_oceniane_3.exceptions.ItDoesntLookLikeFiresException;
import pl.edu.mini.pw.www.zadanie_oceniane_3.kebaby.Kebab;
import pl.edu.mini.pw.www.zadanie_oceniane_3.kebaby.KebabCiasto;
import pl.edu.mini.pw.www.zadanie_oceniane_3.kebaby.KebabTalerz;

public class KebabParser {
	
	public static List<Kebab> parseKebab(String path) {
		
		List<Kebab> kebaby = new LinkedList<Kebab>();
		
		InputStream is = Kebab.class.getResourceAsStream(path);
		
		String line;
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
			
			while((line = br.readLine()) != null) {
				try {
					if (line.split("---").length == 5) kebaby.add(new KebabCiasto(line));
					else kebaby.add(new KebabTalerz(line));
				} catch (UnknownTypeOfMeatException | ItDoesntLookLikeFiresException e) {
					e.printStackTrace();
					System.out.println("Program aborted...");
					System.exit(-1);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return kebaby;
		
	}

}
