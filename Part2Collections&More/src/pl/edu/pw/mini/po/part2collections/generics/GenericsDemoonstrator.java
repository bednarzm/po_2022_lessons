package pl.edu.pw.mini.po.part2collections.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemoonstrator {

	public static void main(String[] args) {
		Postman.<Pack>doSomething(new BigPack());
		
		List<List<List<String>>> list;
		
	}

	private static void first() {
		List<? extends BigPack> list = new ArrayList<>();
		BigPack bigPack = list.get(0);
		//list.add(new BigPack());
	}

	private static void second() {
		List<? super BigPack> list = new ArrayList<>();
		list.add(new BigPack());
		list.add(new ExtremelyBigPack());
	}
	
	private static <T> void firstStatic(T t){
		//do something
	}
	
	
}
