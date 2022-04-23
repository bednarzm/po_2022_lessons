package pl.edu.pw.mini.po.part2collections.collections.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

import pl.edu.pw.mini.po.part2collections.collections.data.model.other.Car;
import pl.edu.pw.mini.po.part2collections.collections.data.model.other.EnginePowerComparedCar;
import pl.edu.pw.mini.po.part2collections.collections.data.model.other.NameComparedCar;
import pl.edu.pw.mini.po.part2collections.collections.set.entry.EqualsHashcodeSetEntry;
import pl.edu.pw.mini.po.part2collections.collections.set.entry.EqualsOnlySetEntry;
import pl.edu.pw.mini.po.part2collections.collections.set.entry.HashcodeOnlySetEntry;
import pl.edu.pw.mini.po.part2collections.collections.set.entry.MySetEntry;

public class SetDemonstrator {

	public static void main(String[] args) {
		//demonstrateHashSet();
		//demonstrateLinkedHashSet();
		//demonstrateTreeSet();
		//demonstrateEqualsHashcodeProblems1();
		//demonstrateEqualsHashcodeProblems2();
		//demonstrateEqualsHashcodeProblems3();
		//demonstrateEqualsHashcodeProblems4();
	}

	private static void demonstrateHashSet() {
		System.out.println("Demonstrate hashset");
		Set<Car> set = new HashSet<>();

		Car saab = new Car("Saab", 230);
		Car volvo = new Car("Volvo", 200);
		Car mercedes = new Car("Mercedes-baleron", 115);
		Car nysa = new Car("Nysa", 60);

		set.add(saab);
		set.add(nysa);
		set.add(mercedes);

		
		
		System.out.println("Add Volvo: " + set.add(volvo));
		System.out.println("Add Volvo again: " + set.add(volvo));
		System.out.println("Add Volvo again 2: " + set.add(volvo));

		System.out.println("Hashset: " + set);
		for (Car car : set) {
			System.out.println("Iterated car: " + car);
		}
		
		Set<Car> antherSet = new HashSet<>();
		antherSet.add(new Car("Maluch", 24));
		antherSet.add(new Car("Polonez", 75));

		set.addAll(antherSet);
		/* Zamiast addAll
		for (Car car : antherSet) {
			set.add(car);
		}
		*/
		System.out.println("\nHashset after addAll: " + set);

		System.out.println("\nContains?: " + set.contains(mercedes));
		System.out.println("Contains another instance?: " + set.contains(new Car("Mercedes-baleron", 115)));
		System.out.println("Contains all?: " + set.containsAll(antherSet));
		
		System.out.println("Set before removing" + set);
		
		set.remove(volvo);
		System.out.println("Volvo removed: " + set.remove(volvo));
		System.out.println("Set" + set);

		set.removeAll(antherSet);
		System.out.println("Maluch and Polonez removed: " + set.removeAll(antherSet));
		System.out.println("Set before remove" + set);
		
		
		set.removeIf(new Predicate<Car>() {

			@Override
			public boolean test(Car t) {
				return t.getEnginePower() < 100;
			}
			
		});
		
		System.out.println("Set after remove" + set);
		
	}

	/**
	 * Zachowana kolejnosc + hashset
	 */
	private static void demonstrateLinkedHashSet() {
		System.out.println("\n\nDemonstrate linkedhashset");
		Set<Car> set = new LinkedHashSet<>();
		
		
		Car saab = new Car("Saab", 230);
		Car volvo = new Car("Volvo", 200);
		Car mercedes = new Car("Mercedes-baleron", 115);
		Car nysa = new Car("Nysa", 60);

		set.add(saab);
		set.add(nysa);
		set.add(mercedes);
		set.add(volvo);

		System.out.println("Linked hashset: " + set);
	}

	private static void demonstrateTreeSet() {
		System.out.println("Demonstrate treeset");

		Set<Car> set = new TreeSet<>();

		Car saab = new Car("Saab", 230);
		Car volvo = new Car("Volvo", 200);
		Car mercedes = new Car("Mercedes-baleron", 115);
		Car nysa = new Car("Nysa", 60);
		
		try {
			set.add(saab);
			set.add(nysa);
			set.add(mercedes);
			set.add(volvo);
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		
		
		Set<NameComparedCar> nameComparedSet = new TreeSet<>();
		NameComparedCar saabComparedByName = new NameComparedCar("Saab", 230);
		NameComparedCar volvoComparedByName = new NameComparedCar("Volvo", 200);
		NameComparedCar mercedesComparedByName = new NameComparedCar("Mercedes-baleron", 115);
		NameComparedCar nysaComparedByName = new NameComparedCar("Nysa", 60);
		
		nameComparedSet.add(saabComparedByName);
		System.out.println("add1" + nameComparedSet.add(nysaComparedByName));
		nameComparedSet.add(mercedesComparedByName);
		nameComparedSet.add(volvoComparedByName);

		System.out.println("Treeset name: " + nameComparedSet);
		
		Set<EnginePowerComparedCar> enginePowerComparedSet = new TreeSet<>();
		EnginePowerComparedCar saabComparedByEnginePower = new EnginePowerComparedCar("Saab", 230);
		EnginePowerComparedCar volvoComparedByEnginePower = new EnginePowerComparedCar("Volvo", 200);
		EnginePowerComparedCar mercedesComparedByEnginePower = new EnginePowerComparedCar("Mercedes-baleron", 115);
		EnginePowerComparedCar nysaComparedByEnginePower = new EnginePowerComparedCar("Nysa", 60);

		System.out.println("Treeset (compared by name): " + nameComparedSet);
		
		enginePowerComparedSet.add(saabComparedByEnginePower);
		enginePowerComparedSet.add(nysaComparedByEnginePower);
		enginePowerComparedSet.add(mercedesComparedByEnginePower);
		enginePowerComparedSet.add(volvoComparedByEnginePower);

		System.out.println("Treeset (compared by engine power): " + enginePowerComparedSet);
		
	}

	private static void demonstrateEqualsHashcodeProblems1() {
		Set<MySetEntry> anySet = new HashSet<>();
		
		MySetEntry mySetEntryPiotr = new MySetEntry("Piotr");
		MySetEntry mySetEntryAnia = new MySetEntry("Ania");
		MySetEntry mySetEntryPiotr2 = new MySetEntry("Piotr");
		
		anySet.add(mySetEntryPiotr);
		anySet.add(mySetEntryAnia);
		anySet.add(mySetEntryPiotr2);
		
		System.out.println("Any set: " + anySet);
		System.out.println("Any set cotains: " + anySet.contains(mySetEntryPiotr));
		System.out.println("Any set cotains: " + anySet.contains(new MySetEntry("Piotr")));
		
		System.out.println("Any set cotainss: " + anySet.contains(new MySetEntry("Piotr")));
		System.out.println("Any set remove: " + anySet.remove(new MySetEntry("Piotr")));
		System.out.println("Any set remove: " + anySet.remove(mySetEntryPiotr));
		System.out.println("Any set: " + anySet);
		
		
	}
	
	private static void demonstrateEqualsHashcodeProblems2() {
		Set<MySetEntry> anySet = new HashSet<>();
		
		EqualsOnlySetEntry mySetEntryPiotr = new EqualsOnlySetEntry("Piotr");
		EqualsOnlySetEntry mySetEntryAnia = new EqualsOnlySetEntry("Ania");
		EqualsOnlySetEntry mySetEntryPiotr2 = new EqualsOnlySetEntry("Piotr");
		
		anySet.add(mySetEntryPiotr);
		anySet.add(mySetEntryAnia);
		anySet.add(mySetEntryPiotr2);
		
		System.out.println("Any set: " + anySet);
		System.out.println("Any set cotains: " + anySet.contains(mySetEntryPiotr));
		System.out.println("Any set cotains: " + anySet.contains(new MySetEntry("Piotr")));
		
		System.out.println("Any set cotainss: " + anySet.contains(new MySetEntry("Piotr")));
		System.out.println("Any set remove: " + anySet.remove(new MySetEntry("Piotr")));
		System.out.println("Any set remove: " + anySet.remove(mySetEntryPiotr));
		System.out.println("Any set: " + anySet);
		
	}
	
	private static void demonstrateEqualsHashcodeProblems3() {
		Set<MySetEntry> anySet = new HashSet<>();
		
		EqualsHashcodeSetEntry mySetEntryPiotr = new EqualsHashcodeSetEntry("Piotr");
		EqualsHashcodeSetEntry mySetEntryAnia = new EqualsHashcodeSetEntry("Ania");
		EqualsHashcodeSetEntry mySetEntryPiotr2 = new EqualsHashcodeSetEntry("Piotr");
		
		anySet.add(mySetEntryPiotr);
		anySet.add(mySetEntryAnia);
		anySet.add(mySetEntryPiotr2);
		
		System.out.println("Any set: " + anySet);
		System.out.println("Any set cotains: " + anySet.contains(mySetEntryPiotr));
		System.out.println("Any set cotains: " + anySet.contains(new MySetEntry("Piotr")));
		
		System.out.println("Any set cotainss: " + anySet.contains(new MySetEntry("Piotr")));
		System.out.println("Any set remove: " + anySet.remove(new MySetEntry("Piotr")));
		System.out.println("Any set remove: " + anySet.remove(mySetEntryPiotr));
		System.out.println("Any set: " + anySet);
		
	}
	
	private static void demonstrateEqualsHashcodeProblems4() {
		Set<MySetEntry> anySet = new HashSet<>();
		
		HashcodeOnlySetEntry mySetEntryPiotr = new HashcodeOnlySetEntry("Piotr");
		HashcodeOnlySetEntry mySetEntryAnia = new HashcodeOnlySetEntry("Ania");
		HashcodeOnlySetEntry mySetEntryPiotr2 = new HashcodeOnlySetEntry("Piotr");
		
		anySet.add(mySetEntryPiotr);
		anySet.add(mySetEntryAnia);
		anySet.add(mySetEntryPiotr2);
		
		System.out.println("Any set: " + anySet);
		System.out.println("Any set cotains: " + anySet.contains(mySetEntryPiotr));
		System.out.println("Any set cotains: " + anySet.contains(new MySetEntry("Piotr")));
		
		System.out.println("Any set cotainss: " + anySet.contains(new MySetEntry("Piotr")));
		System.out.println("Any set remove: " + anySet.remove(new MySetEntry("Piotr")));
		System.out.println("Any set remove: " + anySet.remove(mySetEntryPiotr));
		System.out.println("Any set: " + anySet);
		
	}
	
	
}
