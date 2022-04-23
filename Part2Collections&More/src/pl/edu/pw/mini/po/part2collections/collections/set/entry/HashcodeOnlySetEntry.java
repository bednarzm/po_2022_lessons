package pl.edu.pw.mini.po.part2collections.collections.set.entry;

import java.util.Objects;
/**
 * 
 * Oryginalny equals bazujacy na referencji dziedziczony z Object
 *
 */
public class HashcodeOnlySetEntry extends MySetEntry {

	public HashcodeOnlySetEntry(String name) {
		super(name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	
}
