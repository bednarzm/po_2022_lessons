package pl.edu.pw.mini.po.part2collections.collections.data.model.other.citizen;

public class IdIdentifiedCitizen extends Citizen {

	public IdIdentifiedCitizen(String name, String lastName) {
		super(name, lastName);
	}

	public IdIdentifiedCitizen(int id, String name, String lastName) {
		super(id, name, lastName);
	}

	@Override
	public boolean equals(Object object) {
		boolean result = false;
		
		if(object != null && object instanceof Citizen) {
			Citizen identifiedCitizen = (Citizen)object;
			if(id == identifiedCitizen.id) {
				result = true;
			}
			//mozna i tak: result = (id == identifiedCitizen.id);
		}
		
		return result;
	}

}
