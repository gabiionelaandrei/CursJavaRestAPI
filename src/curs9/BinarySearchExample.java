package curs9;
/*
 * binary search
 * 
 * 0 5 6 9 10 4 7 8 12
 * 
 */

import java.util.Arrays;

public class BinarySearchExample {
	
	static int[] array = {8, 9, 3, 2, 10, 33, 45, 1, 99, 0, 67, 80, 78, 66, 5, 7};

	public static void main(String[] args) {

		System.out.println("Array initial : " + Arrays.toString(array) );
		
		Arrays.sort(array);
		
		System.out.println("---------------------------------------------");
		
		System.out.println("Array sortat : " + Arrays.toString(array) );
		
		binarySearch(array, 34);
		System.out.println(Arrays.binarySearch(array, 3));

	}

	public static void binarySearch(int[] array, int searchValue) {
		//se initializeaza indexul de start
		int first = 0;
		//se initializeaza indexul de final
		int last = array.length -1;
		//se calculeaza mijlocul array-ului
		int middle = (first+last)/2;
		
		
		
		//cat timp primul index este mai mic sau egal cu ultimul index
		while(first<=last) {
			//daca elementul cautat este mai mare decat mijlocul array-ului
			if(array[middle] < searchValue) {
				first = middle +1;
			//daca este egal am gasit elementul si opresc bucla	
			}else if(array[middle]== searchValue) {
				System.out.println("Elementul cautat se afla la index " + middle);
				break;
			}else {
				//elementul din mijloc este mai mare decat valoarea cautata
				last = middle -1;
			}
			middle = (first+last)/2;
		}
		
		if(first>last) {
			System.out.println("Elementul nu a fost gasit!");
		}
		
		
	}
	
	
}