package pl.edu.pw.mini.po.disco;

public class Studentka extends StudentZNazwiskiem {
	private String jakiesInfo;
	public Studentka(String imie, String wiek, String nazwisko) {
		super(imie, wiek, nazwisko);
	}
	public String getJakiesInfo() {
		return jakiesInfo;
	}
	
}
