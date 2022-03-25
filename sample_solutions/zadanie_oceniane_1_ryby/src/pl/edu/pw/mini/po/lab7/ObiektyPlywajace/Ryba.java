package pl.edu.pw.mini.po.lab7.ObiektyPlywajace;

import java.util.Random;

import pl.edu.pw.mini.po.lab7.akwen.Akwen;

public abstract class Ryba extends ObiektPlywajacy{

	protected short waga;
	
	protected Ryba() {
		super();
	}
	
	@Override
	public void move(Akwen akwen) {
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
			if(akwen.getObiekt(pozycja) != null) {
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
			akwen.wstawObiekt(pozycja, this);
			break;
		}
	}


	public short getWaga() {
		return waga;
	}


}
