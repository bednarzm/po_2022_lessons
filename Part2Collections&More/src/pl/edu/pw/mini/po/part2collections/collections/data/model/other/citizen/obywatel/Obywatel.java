package pl.edu.pw.mini.po.part2collections.collections.data.model.other.citizen.obywatel;

public abstract class Obywatel {
	
	private static int idCounter;
	protected int id = idCounter++;
	
	protected String name;
	protected String lastName;
	
	protected Obywatel(int id, String name, String lastName) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}
	
	protected Obywatel(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}

}
