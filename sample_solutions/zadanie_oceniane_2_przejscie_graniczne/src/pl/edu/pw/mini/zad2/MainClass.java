package pl.edu.pw.mini.zad2;

import pl.edu.pw.mini.zad2.border.BorderCrossing;
import pl.edu.pw.mini.zad2.border.CantArrestException;

public class MainClass {
	public static void main(String[] args) throws CantArrestException {
		BorderCrossing p = new BorderCrossing();
		p.doJob();
	}
}
