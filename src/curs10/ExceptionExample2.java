package curs10;

public class ExceptionExample2 {

	public static void main(String[] args) {

		try {
			
			String nume =  null;
			System.out.println("Lungimea numele este de " + nume.length());
			
		}catch(Exception e) {
			
			System.out.println("Exception occured");
			System.out.println(3/0);
			
		}finally {
			
			System.out.println("Finally block of code");
		}
		
		System.out.println("Code after Try-Catch");
		
		
	}

}