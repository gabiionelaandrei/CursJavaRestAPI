package curs12;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		List<String> list =  new ArrayList<>();
		//ArrayList<String> list =  new ArrayList<>();
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		list.add("Oana");
		list.add("Ion");
		list.add("Maria");
		list.add("Gabriel");
		
		System.out.println("------------------------");
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		System.out.println(list);
		
		System.out.println("------------------------");
		System.out.println(list.get(0));
		
		for(String nume : list) {
			
			System.out.println(list.indexOf(nume) + " : " + nume);
		}
		
		System.out.println(list.indexOf("Maria"));
		
		System.out.println("------------------------");

		System.out.println(list);
		
		list.add("Oana");
		System.out.println(list);
		//[Oana, Ion, Maria, Gabriel, Oana]
	   //	0     1     2       3       4
		
		list.add(2, "Carmen");
		System.out.println(list);
	//	[Oana, Ion, Carmen, Maria, Gabriel, Oana]
	//    0     1     2       3        4      5
		
		
	System.out.println("------------------------");
	//	[Oana, Ion, Carmen, Maria, Gabriel, Oana]
	//    0     1     2       3        4      5
	
	System.out.println(list.size());
	list.add(6, "Ioana");
	System.out.println(list);
	//[Oana, Ion, Carmen, Maria, Gabriel, Oana, Ioana]
	// 0      1      2      3       4       5     6
	
	list.set(5, "Luca");
	System.out.println(list);
    //[Oana, Ion, Carmen, Maria, Gabriel, Luca, Ioana]
	// 0      1      2      3       4       5     6
	
	boolean isInTheList = list.contains("Oana");
	System.out.println(isInTheList);
	
	System.out.println("------------------------");

	list.remove(4);
	System.out.println(list);
   //[Oana, Ion, Carmen, Maria, Luca, Ioana]
	list.remove("Ion");
	System.out.println(list);
	
	list.clear();
	System.out.println(list);
	//list.removeAll(list);


	
	}

}