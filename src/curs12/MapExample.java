package curs12;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		/*
		 * user = test
		 */
		
		Map<String, String> map = new HashMap<>(); 
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		map.put("T", "Tester");
		map.put("D", "Developer");
		map.put("M", "Manager");
		map.put("S", "Support");
		
		System.out.println("-------------------------------");
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		System.out.println(map);
		
		System.out.println("-------------------------------");
		//get value from map 
		System.out.println(map.get("M"));
		//all keys in a map are unique
		map.put("D", "Director");
		System.out.println(map);
		//all keys are case sensitive
		map.put("d", "Developer");
		System.out.println(map);
		//values can be duplicated
		map.put("d", "Director");
		System.out.println(map);
		System.out.println("-------------------------------");

		System.out.println(map.get("X"));
		map.put("B", null);
		System.out.println(map);
		System.out.println(map.get("B"));

		System.out.println("-------------------------------");

		for(String key : map.keySet()) {
			System.out.println(key);
		}
		System.out.println("-------------------------------");

		for(String value : map.values()) {
			System.out.println(value);
		}
		System.out.println("-------------------------------");

		boolean checkKey =  map.containsKey("B");
		System.out.println(checkKey);
		
		boolean checkValue =  map.containsValue("Test");
		System.out.println(checkValue);
				
		System.out.println("-------------------------------");
		//delete pair from map
		map.remove("d");
		System.out.println(map);
		//update key-value pair
		map.replace("S", "Sales");
		System.out.println(map);
		map.replace("X", "Sales");
		System.out.println(map);
		
		//clear all values from map
		map.clear();
		
		System.out.println("-------------------------------");

		System.out.println(map.isEmpty());
		System.out.println(map.size());
		
		System.out.println("-------------------------------");
		
		Map<Integer, String> map1 =  new HashMap<>();
		map1.put(1, "Rosu");
		map1.put(2, "Alb");
		map1.put(3, "Galben");
		
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1, "Violet");
		map2.put(7, "Negru");
		map2.put(6, "Verde");

		System.out.println("Map1 " + map1);
		System.out.println("Map2 " + map2);
		map1.putAll(map2);
		System.out.println("Map1 dupa putAll" + map1);
		
		System.out.println("-------------------------------");

	

		


	}

}