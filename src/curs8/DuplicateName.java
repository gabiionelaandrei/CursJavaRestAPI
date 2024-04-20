package curs8;

import java.util.Arrays;

public class DuplicateName {

	public static void main(String[] args) {
		String[] myStringArray = {"Maria", "Bob", "Ion", "George", "Oana",
				"Bogdan", "Oana", "Ion"};
		Arrays.sort(myStringArray);
		for(int i = 0; i < myStringArray.length-1; i++) {
			
			if(myStringArray[i].equals(myStringArray[i+1])) {
				System.out.println(myStringArray[i] + " is a duplicate name.");
			}
		}
		
	}

}
