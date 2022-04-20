package pl.edu.pw.mini.po.part2collections.collections.data.model.other.citizen;

public class NameSurnameIdentifiedCitizen extends Citizen {

	public NameSurnameIdentifiedCitizen(String name, String lastName) {
		super(name, lastName);
	}

	@Override
	public boolean equals(Object object) {
		boolean result = false;
		
		if(object != null && object instanceof NameSurnameIdentifiedCitizen) {
			NameSurnameIdentifiedCitizen nameSurnameIdentifiedCitizen = (NameSurnameIdentifiedCitizen)object;
			if(name != null) {
				if(name.equals(nameSurnameIdentifiedCitizen.name)) {//tutaj nie musimy uzywac getterow bo w sumie to ta sama klasa.
					if(lastName != null) {
						result = lastName.equals(nameSurnameIdentifiedCitizen.lastName);
					} else if (nameSurnameIdentifiedCitizen.lastName == null) {
						result = true;
					}
				}
			} else if(nameSurnameIdentifiedCitizen.name == null){
				result = true;
			}
		}
		
		return result;
	}

}
