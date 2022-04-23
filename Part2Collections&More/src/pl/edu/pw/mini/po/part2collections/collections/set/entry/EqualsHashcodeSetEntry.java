package pl.edu.pw.mini.po.part2collections.collections.set.entry;

import java.util.Objects;
/*
 * Equals i hashcode zaimplementowany dla name`a.OKOKOK
 */
public class EqualsHashcodeSetEntry extends EqualedNameSetEntry {

	public EqualsHashcodeSetEntry(String name) {
		super(name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

}
