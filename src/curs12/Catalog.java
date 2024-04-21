package curs12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Catalog {
		Map<String,Integer > catalog =  new HashMap<>();

		
		public Catalog() {
			catalog.put("Andrei", 10);
			catalog.put("Ion", 7);
			catalog.put("Mihai", 6);
			catalog.put("Ana", 4);
			catalog.put("Elena", 7);
			catalog.put("Maria", 6);
			catalog.put("Radu", 9);
		}	

		public void gasesteElev(String name, int nota){
			
			if(!catalog.containsKey(name)) {	
				catalog.put(name, nota);
				System.out.println("Nu aveai nota, ti-am trecut acum!");
				
			}else if(catalog.containsKey(name) && nota < catalog.get(name)) {
				System.out.println("Nu ai nevoie de alta nota!");
			}
		
			else {
				catalog.replace(name, nota);
				
			}
			System.out.println(catalog);
		}
		
	}

