package pl.edu.pw.mini.po.part2collections.collections.list;

import java.util.LinkedList;
import java.util.List;

import pl.edu.pw.mini.po.part2collections.collections.data.model.other.citizen.Citizen;
import pl.edu.pw.mini.po.part2collections.collections.data.model.other.citizen.IdIdentifiedCitizen;
import pl.edu.pw.mini.po.part2collections.collections.data.model.other.citizen.NameSurnameIdentifiedCitizen;

public class EqualsDemonstrator {

	public static void main(String[] args) {
		demonstrateInstanceBasedEquals();
		demonstrateIdBasedEquals();
		demonstrateNameSurnameBasedEquals();
	}

	private static void demonstrateInstanceBasedEquals() {
		List<Citizen> citizens = new LinkedList<Citizen>();// Tu w zasadzie nie ma znaczenia jakiej implementacji listy
															// uzyjemy

		Citizen firstCitizen = new Citizen("Jan", "Borysewicz");
		Citizen secondCitizen = new Citizen("Doda", "Mloda");
		Citizen thirdCitizen = new Citizen("Grzegorz", "Ciechowski");

		Citizen fourthCitizen = new Citizen("Jan", "Borysewicz");

		citizens.add(firstCitizen);
		citizens.add(secondCitizen);
		citizens.add(thirdCitizen);

		System.out.println("Collection: " + citizens);

		System.out.println("Contains same instance 1?" + citizens.contains(firstCitizen));
		System.out.println("Contains same instance 2?" + citizens.contains(fourthCitizen));
		System.out.println("Contains same instance 3?" + citizens.contains(new Citizen("Kot", "Bazyli")));
		System.out.println("Contains same instance 4?" + citizens.contains(new Citizen("Jan", "Boryzewicz")));

	}

	private static void demonstrateIdBasedEquals() {
		List<Citizen> citizens = new LinkedList<Citizen>();// Tu w zasadzie nie ma znaczenia jakiej implementacji listy
															// uzyjemy

		Citizen firstCitizen = new IdIdentifiedCitizen("Jan", "Borysewicz");
		Citizen secondCitizen = new IdIdentifiedCitizen("Doda", "Mloda");
		Citizen thirdCitizen = new IdIdentifiedCitizen("Grzegorz", "Ciechowski");

		Citizen fourthCitizen = new IdIdentifiedCitizen("Jan", "Borysewicz");

		Citizen fifthCitizenDoubledWithFirst = new IdIdentifiedCitizen(0, "Jan", "Borysewicz");
		
		citizens.add(firstCitizen);
		citizens.add(secondCitizen);
		citizens.add(thirdCitizen);

		System.out.println("Collection: " + citizens);

		System.out.println("Contains same instance 1?" + citizens.contains(firstCitizen));
		System.out.println("Contains same instance 2?" + citizens.contains(fourthCitizen));
		System.out.println("Contains same instance 3?" + citizens.contains(new Citizen("Kot", "Bazyli")));
		System.out.println("Contains same instance 4?" + citizens.contains(new Citizen("Jan", "Borysewicz")));
		System.out.println("Contains same instance 5?" + citizens.contains(fifthCitizenDoubledWithFirst));
		System.out.println("Contains same instance 6?" + citizens.contains(new IdIdentifiedCitizen(1, "Doda", "Mloda")));
	}

	private static void demonstrateNameSurnameBasedEquals() {
		List<Citizen> citizens = new LinkedList<Citizen>();// Tu w zasadzie nie ma znaczenia jakiej implementacji listy
		// uzyjemy

		Citizen firstCitizen = new NameSurnameIdentifiedCitizen("Jan", "Borysewicz");
		Citizen secondCitizen = new NameSurnameIdentifiedCitizen("Doda", "Mloda");
		Citizen thirdCitizen = new NameSurnameIdentifiedCitizen("Grzegorz", "Ciechowski");

		Citizen fourthCitizen = new NameSurnameIdentifiedCitizen("Jan", "Borysewicz");

		citizens.add(firstCitizen);
		citizens.add(secondCitizen);
		citizens.add(thirdCitizen);

		System.out.println("Collection: " + citizens);

		System.out.println("Contains same instance 1?" + citizens.contains(firstCitizen));
		System.out.println("Contains same instance 2?" + citizens.contains(fourthCitizen));
		System.out.println("Contains same instance 3?" + citizens.contains(new Citizen("Kot", "Bazyli")));
		System.out.println("Contains same instance 4?" + citizens.contains(new Citizen("Jan", "Borysewicz")));
	}

}
