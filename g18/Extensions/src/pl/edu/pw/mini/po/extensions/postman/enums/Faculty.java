package pl.edu.pw.mini.po.extensions.postman.enums;

public enum Faculty {
	
	MINI("Matematyiki i "), ELKA("Elekt"), FTIMS("Fartem "), WP("Wydzial produkcji");
	
	private String extendedNams;
	
	private Faculty(String extendedNams) {
		this.extendedNams = extendedNams;
	}

	public String getExtendedNams() {
		return extendedNams;
	}
	
}
