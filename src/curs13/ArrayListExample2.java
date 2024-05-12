package curs13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {

		
		List<String> list =  new ArrayList<>(Arrays.asList("Iasi", "Cluj", "Pitesti", "Constanta", "Ploiesti", "Arad"));
		
		System.out.println(list.size());
		
		list.add("Oradea");
		
		System.out.println(list.size());

		System.out.println(list);
		//[Iasi, Cluj, Pitesti, Constanta, Ploiesti, Arad, Oradea]
		// 0      1      2         3           4       5      6
		
		System.out.println(list.subList(0, 3));
		
		List<String> sublista = list.subList(0, 3);
		
		list.subList(0, 5).clear();
		
		
		
	}

}