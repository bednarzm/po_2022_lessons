package pl.edu.pw.mini.po.lab7.ObiektyPlywajace;

import java.util.Random;

import pl.edu.pw.mini.po.lab7.akwen.Akwen;

public abstract class Statek extends ObiektPlywajacy {
	
	public static int globalStatekId = 0;
	
	protected String kod;
	protected int statekId;
	protected short ladownosc;
	protected int masaZlowionychRyb;
	
	protected Statek() {
		super();
		Random random = new Random();
		this.kod = String.valueOf((Math.sqrt(random.nextLong())));
		this.statekId = Statek.globalStatekId;
		Statek.globalStatekId += 1;
		this.ladownosc = 5000;
		this.masaZlowionychRyb = 0;
	}
	
	@Override
	public void move(Akwen akwen) {
		if(this.masaZlowionychRyb >= this.ladownosc) {
			return;
		}
		Random random = new Random();
		for(int i = 0; i < 8; i++) {
			int vertical = random.nextInt(2);
			int horizontal = random.nextInt(2);
			if(vertical == 0) {
				if(this.pozycja[0] - 1 < 0) {
					continue;
				}
			} else {
				if(this.pozycja[0] + 1 >= 100) {
					continue;
				}
			}
			if(horizontal == 0) {
				if(this.pozycja[1] - 1 < 0) {
					continue;
				}
			} else {
				if(this.pozycja[1] + 1 >= 100) {
					continue;
				}
			}
			if(akwen.getObiekt(pozycja) instanceof Statek) {
				continue;
			}
			akwen.wstawObiekt(pozycja, null);
			if(vertical == 0) {
				this.pozycja[0] -= 1;
			} else {
				this.pozycja[0] += 1;
			}
			if(horizontal == 0) {
				this.pozycja[1] -= 1;
			} else {
				this.pozycja[1] += 1;
			}
			if(akwen.getObiekt(pozycja) instanceof RekinOstronosy || akwen.getObiekt(pozycja) instanceof RekinPolarny) {
				Ryba ryba = (Ryba) akwen.getObiekt(pozycja);
				akwen.usunObiekt(pozycja);
				this.masaZlowionychRyb += ryba.getWaga();
			}
			if(this.masaZlowionychRyb >= this.ladownosc) {
				System.out.println("Statek typu " + this.getClass().getName() + " nr " + this.statekId + " nie prowadzi już połowów");
			}
			akwen.wstawObiekt(pozycja, this);
			break;
		}
	}
}
