package pl.edu.pw.mini.po.part2collections.collections.data.model.other.citizen;
/**
 * 
 * Tutaj uzywamy (instancjonujemy) rowniez klase Citizen, dlatego nie jest ona abstrakcyjna. 
 *
 */
public class Citizen {
	
	private static int idCounter;
	protected int id;
	
	protected String name;
	protected String lastName;

	public Citizen(String name, String lastName) {
		id = idCounter++;
		this.name = name;
		this.lastName = lastName;
	}

	protected Citizen(int id, String name, String lastName) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Citizen [id=" + id + ", name=" + name + ", lastName=" + lastName + "]";
	}

}
