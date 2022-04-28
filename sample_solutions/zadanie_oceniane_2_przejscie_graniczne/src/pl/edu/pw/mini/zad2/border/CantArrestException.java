package pl.edu.pw.mini.zad2.border;

public class CantArrestException extends Exception {
	private int age;
	
	public CantArrestException(int age) {
		this.age = age;
	}
	
	@Override
	public String getMessage() {
		return "Nie mozna aresztowac tak mlodej osoby: " + age;
	}
}
