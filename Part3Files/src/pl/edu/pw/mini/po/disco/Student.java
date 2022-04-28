package pl.edu.pw.mini.po.disco;

public class Student extends StudentZNazwiskiem {
	
	protected int jakisParametr; 
	
	public Student(String imie, String wiek, String nazwisko) {
		super(imie, wiek, nazwisko);
	}

	public int getJakisParametr() {
		return jakisParametr;
	}
	
}
