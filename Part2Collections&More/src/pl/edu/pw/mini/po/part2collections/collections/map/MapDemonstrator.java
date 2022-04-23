package pl.edu.pw.mini.po.part2collections.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import pl.edu.pw.mini.po.part2collections.collections.data.model.other.Car;

public class MapDemonstrator {

	public static void main(String[] args) {
		Map<String, List<Car>> carMap = new HashMap<>(); 
		
		List<Car> cars = new ArrayList<Car>();
		cars.add(new Car("Volvo", 100));
		carMap.put("Adamiak", cars);
		
		cars = new ArrayList<Car>();
		cars.add(new Car("Saab", 100));
		cars.add(new Car("Maluch", 100));
		carMap.put("Laskowiak", cars);
		
		carMap.containsKey("Laskowiak");
		carMap.containsValue(cars);
		
		List<Car> adamiakCars = carMap.get("Adamiak");
		
		System.out.println("Adamiak cars: " + adamiakCars);
		carMap.keySet();
		carMap.values();
		
		for(String key : carMap.keySet()) {
			System.out.println(key + " " + carMap.get(key));
		}
		
		Set<Entry<String, List<Car>>> entrySet = carMap.entrySet();
		for(Entry<String, List<Car>> entry : entrySet ) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		LinkedHashMap<String, String> linked;
		TreeMap<String, String> treeMap;
		
		
	}

}
