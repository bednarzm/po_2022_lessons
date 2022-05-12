package pl.edu.mini.pw.www.zadanie_oceniane_3.kebaby;

import pl.edu.mini.pw.www.zadanie_oceniane_3.features.MyVisitor;

public abstract class Kebab {
	
	protected Rozmiar rozmiar;
	protected Mieso mieso;
	protected int waga;
	protected double cena;
	
	
	
	protected enum Rozmiar {
		S, M, L;
	}
	
	protected enum Mieso {
		kurczak, wolowina, mix;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kebab other = (Kebab) obj;
		if (Double.doubleToLongBits(cena) != Double.doubleToLongBits(other.cena))
			return false;
		if (mieso != other.mieso)
			return false;
		if (rozmiar != other.rozmiar)
			return false;
		if (waga != other.waga)
			return false;
		return true;
	}
	
	public abstract Kebab accept(MyVisitor v);
	
	


	public int getWaga() {
		return waga;
	}

	public double getCena() {
		return cena;
	}

	@Override
	public String toString() {
		return rozmiar.toString() + " z " + mieso.toString() + ", waga: " + waga + ", cena: " + cena;
	}

	
	
}
