package curs8;

import java.util.Arrays;

public class TwoDimArray {

	public static void main(String[] args) {

		int[][] array = { { 1, 2, 6, 9, 0},  {5, 12, 6, 19, 10} };
		//                |       0      |   |          1     |
		//                  0  1  2  3  4     0   1   2  3   4
		//Object[] arrayOnbj = {"1", 12, true};
		
		System.out.println(array[0][3]);
		
		
		/*                     coloana 0         coloana 1        coloana 2
		 *  
		 *  textArray --> row0  brasov				iasi			cluj
		 *  
		 *  			  row1  paris	            viena           Genova
		 * 
		 */
		
		String[][] textArray = {{"Brasov" , "Iasi" , "Cluj"},  {"Paris", "Viena", "Genova"} };
		
		System.out.println(textArray[1][0]);
		
		System.out.println(textArray.length);
		System.out.println(textArray[0].length);
		
		for(int i=0; i<textArray.length; i++) {
			
			System.out.println("Row");
		
			for(int j=0; j<textArray[i].length; j++) {
				
				System.out.println("Column:  " + textArray[i][j]);
				
			}
		}
		
		System.out.println("---------------------------------------");
		
		for(String[] rand : textArray) {
			
			System.out.println("ROW : " + Arrays.toString(rand));
			
			for(String col : rand) {
				
				System.out.println(col);
				
			}
		}
		
		
		
	}

}