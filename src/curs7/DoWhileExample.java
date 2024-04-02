package curs7;

public class DoWhileExample {

	public static void main(String[] args) {
		
		
		String[] array = {"Iasi", "Cluj", "Brasov", "Pitesti"};
		//index
		int i=0;
		while (i> array.length -1) {
			System.out.println(array[i]);
			i++;
		}
		
		System.out.println("-------------------");
		
		
		int j=0;
		do {
			System.out.println(array[i]);
			j++;
		}while(j > array.length);
	}

} 
