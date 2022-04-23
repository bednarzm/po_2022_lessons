package pl.edu.pw.mini.po.part2collections.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Vector;

import pl.edu.pw.mini.po.part2collections.collections.data.model.human.Human;
import pl.edu.pw.mini.po.part2collections.collections.data.model.human.Man;
import pl.edu.pw.mini.po.part2collections.collections.data.model.human.StudyingWomanVisitor;
import pl.edu.pw.mini.po.part2collections.collections.data.model.human.Woman;

public class ListDemonstrator {

	public static void main(String[] args) {

		//demonstrateArrayList();
		//demonstrateLinkedList();
		//demonstrateVectorList();
		
		Woman woman = new Woman("Ala");
		List<Human> humanList = new ArrayList<Human>();
		humanList.add(woman);
		humanList.add(new Woman("Jola"));
		humanList.add(new Man("Piotrek"));
		humanList.add(new Man("Damian"));
		
		Collections.sort(humanList, new Comparator<Human>() {

			@Override
			public int compare(Human o1, Human o2) {
				return 0;
			}
			
		});
		System.out.println("Before shuffle: " + humanList);
		Collections.shuffle(humanList);
		
		Collections.reverse(humanList);
		
		System.out.println("After shuffle: " + humanList);
		List.of(new Woman("Ala"), new Woman("Ala"), new Woman("Ala"), new Woman("Ala"));
		//Arrays.asList(null)
		humanList.toArray();
		Map.of("Rafal", 87, "Stefan", 87);
		Integer [] myTab = new Integer[100];
		//zainicjalizowano
		
		List<Integer> ints = Arrays.asList(myTab);
		
		Set<String> fullOfStrings = new HashSet<>();
		
		List<String> listOfStrings = new ArrayList<String>(fullOfStrings);
		
		listOfStrings.addAll(listOfStrings);
		
		System.out.println("List toString(): " + humanList);
		
	}

	private static void demonstrateArrayList() {
		List<Human> humanList = new ArrayList<Human>();
		presentComon(humanList);
	}

	private static void demonstrateLinkedList2() {
		LinkedList<Human> humanList = new LinkedList<Human>();
		ListIterator<Human> listIterator = humanList.listIterator();

		Random random = new Random();
		while (listIterator.hasNext()) {
			listIterator.next();
			if (random.nextInt(10) == 0) {
				remove3Back(listIterator);
			}

		}

	}

	private static void remove3Back(ListIterator<Human> listIterator) {
		for (int i = 0; i < 3; i++) {
			if (listIterator.hasPrevious()) {
				listIterator.previous();
				listIterator.remove();
			} else {
				break;
			}
		}
	}

	private static void demonstrateLinkedList() {
		List<Human> humanList = new LinkedList<Human>();
		presentComon(humanList);
	}

	private static void demonstrateVectorList() {
		List<Human> humanList = new Vector<Human>();
		presentComon(humanList);
	}

	private static void presentComon(List<Human> humanList) {
		Woman woman = new Woman("Ala");
		humanList.add(woman);
		humanList.add(new Woman("Jola"));
		humanList.add(new Man("Piotrek"));
		humanList.add(new Man("Damian"));

		System.out.println("List toString(): " + humanList);

		for (int i = 0; i < humanList.size(); i++) {
			System.out.println(humanList.get(i));
		}

		for (Human human : humanList) {
			System.out.println(human);
		}

		humanList.size();

		Woman woman1 = new Woman("Zuzia");
		Woman woman2 = new Woman("Zuzia");

		System.out.println(woman1 == woman2);
		System.out.println("Woman1.equals(women2)" + woman1.equals(woman2));

		System.out.println("Contains: " + humanList.contains(new Woman("Ala")));
		System.out.println("Contains: " + humanList.contains(woman));

		humanList.add(new Woman("Jola", true));
		System.out.println("Number of woman: " + getNumberOfStudyingWomam("Jola", humanList));
		System.out.println(
				"Number of woman determined in a nice way: " + getNumberOfStudyingWomamProperWay("Jola", humanList));
		// humanList.remove(new Woman("Ala"));
		try {
			for (Human human : humanList) {
				humanList.remove(human);
			}
		} catch (ConcurrentModificationException concurrentModificationException) {
			concurrentModificationException.printStackTrace();
		}

		System.out.println("Before removing: " + humanList);

		Iterator<Human> humanInterator = humanList.iterator();
		while (humanInterator.hasNext()) {
			humanInterator.next();
			humanInterator.remove();
		}

		System.out.println("After removing: " + humanList);
	}

	private static int getNumberOfStudyingWomam(String name, List<Human> humans) {
		int result = 0;
		
		for (Human human : humans) {
			if (human instanceof Woman) {
				Woman woman = (Woman) human;
				if (name.equals(woman.getName()) && woman.isStudying()) {
					result++;
				}
			}
		}

		return result;
	}

	private static int getNumberOfStudyingWomamProperWay(String name, List<Human> humans) {
		StudyingWomanVisitor studyingWomanVisitor = new StudyingWomanVisitor(name);

		for (Human human : humans) {
			human.apply(studyingWomanVisitor);
		}

		return studyingWomanVisitor.getNumberOfStudyingWoman();
	}

}
