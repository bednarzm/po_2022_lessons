package pl.edu.pw.mini.po.part2collections.collections.data.model.other;

import java.util.Objects;

public class EqualsHashGenerator {

	private String name;
	private Integer id;
	private int value;
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name, value);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsHashGenerator other = (EqualsHashGenerator) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && value == other.value;
	}

	
	
}
