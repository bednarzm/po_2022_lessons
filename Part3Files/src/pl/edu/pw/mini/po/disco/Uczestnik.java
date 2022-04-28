package pl.edu.pw.mini.po.disco;

public abstract class Uczestnik {
	
	private static int idCounter;

	protected int unikalneId;
	protected String imie;
	protected String wiek;

	public Uczestnik() {
	}

	public Uczestnik(String imie, String wiek) {
		this.unikalneId = idCounter++;
		this.imie = imie;
		this.wiek = wiek;
	}

	@Override
	public String toString() {
		return "Uczestnik [unikalneId=" + unikalneId + ", imie=" + imie + ", wiek=" + wiek + "]";
	}

}
