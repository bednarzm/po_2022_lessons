package pl.edu.pw.mini.zad2.merchandise;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Counterfeit extends Merchandise {
	
	private static Map<String, List<Integer>> names;
	
	private String name;
	private int value;
	
	static {
		names = new HashMap<>();
		names.put("bron", List.of(15000, 12000));
		names.put("alkohol bez banderoli", List.of(700, 750, 800));
		names.put("bursztyn", List.of(3500));
		names.put("lopatka wieprzowa", List.of(1450, 1350));
	}
	
	public Counterfeit() {
		int index = new Random().nextInt(names.keySet().size());
		this.name = (String)names.keySet().toArray()[index];
		index = new Random().nextInt(names.get(name).size());
		this.value = names.get(name).get(index);
	}
	
	public int apply(MerchandiseVisitor visitor) {
		return visitor.visit(this);
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	public static void printMe() {
		System.out.println(names);
	}
	
}
