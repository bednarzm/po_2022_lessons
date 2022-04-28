package pl.edu.pw.mini.po.disco;

import java.io.Serializable;

public abstract class StudentZNazwiskiem extends Uczestnik implements Serializable {
	
	private static final long serialVersionUID = -6275622600452731599L;
	
	protected String nazwisko;

	public StudentZNazwiskiem(String imie, String wiek, String nazwisko) {
		super(imie, wiek);
		this.nazwisko = nazwisko;
	}

	@Override
	public String toString() {
		return "StudentZNazwiskiem [nazwisko=" + nazwisko + "]";
	}
	
}
