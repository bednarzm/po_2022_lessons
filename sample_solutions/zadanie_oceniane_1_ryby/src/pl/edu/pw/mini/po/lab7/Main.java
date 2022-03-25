package pl.edu.pw.mini.po.lab7;

import pl.edu.pw.mini.po.lab7.Aplikacja.Symulator;

public class Main {
	public static void main(String[] args) {
		Symulator symulator = new Symulator();
		System.out.println(symulator.getAkwen());
		int begin = symulator.getLiczbaObiektow();
		symulator.symuluj(1000);
		int end = symulator.getLiczbaObiektow();
		System.out.println(symulator.getAkwen());
		System.out.println("poczatek, koniec\n" + begin + " " + end);
	}
}
