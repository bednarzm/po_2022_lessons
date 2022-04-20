package pl.edu.pw.mini.po.part2collections.collections.data.model.animal;

public abstract class Animal {
	
	private static int idCount;
	private int id = idCount++;
	private String name;

	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
}
