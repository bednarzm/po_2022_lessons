package pl.edu.pw.mini.po.part2collections.collections.set;

import java.util.Objects;

public class MyObject {

	private String name;
	private String lastName;
	private int call;
	private int pulse;
	
	@Override
	public int hashCode() {
		return Objects.hash(call, lastName, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyObject other = (MyObject) obj;
		return call == other.call && Objects.equals(lastName, other.lastName) && Objects.equals(name, other.name);
	}
	
}
