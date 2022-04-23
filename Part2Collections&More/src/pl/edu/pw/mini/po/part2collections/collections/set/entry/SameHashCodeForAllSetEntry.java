package pl.edu.pw.mini.po.part2collections.collections.set.entry;

public class SameHashCodeForAllSetEntry extends EqualedNameSetEntry {

	public SameHashCodeForAllSetEntry(String name) {
		super(name);
	}

	public int hashCode() {
		return 55;//Jakikolwiek ale staly dla wszytkich - TAK NIGDY NIE ROBIMY!!!
	}

}
