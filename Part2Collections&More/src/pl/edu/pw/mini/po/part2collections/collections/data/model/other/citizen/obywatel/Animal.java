package pl.edu.pw.mini.po.part2collections.collections.data.model.other.citizen.obywatel;

import java.util.Objects;

public abstract class Animal {
	
	private static int idCounter;
	private int id = idCounter++;
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return id == other.id;
	}
	
}
