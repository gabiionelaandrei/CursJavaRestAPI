package curs10;

public class ExceptionExample {

	public static void main(String[] args) {

		String[] week = {"L", "Ma", "Mi", "J", "V", "S", "D"};
		//index           0     1     2    3    4    5    6      7 8 9
		
		try {
			System.out.println(week[7]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("A aparut o eroare");
			e.printStackTrace();
			
		}
	
		System.out.println("Some other code!");
		
	}

}