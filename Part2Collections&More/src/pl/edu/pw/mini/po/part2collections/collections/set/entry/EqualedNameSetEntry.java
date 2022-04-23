package pl.edu.pw.mini.po.part2collections.collections.set.entry;

import java.util.Objects;

public abstract class EqualedNameSetEntry extends MySetEntry {

	public EqualedNameSetEntry(String name) {
		super(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MySetEntry other = (MySetEntry) obj;
		return Objects.equals(name, other.name);
	}

}
