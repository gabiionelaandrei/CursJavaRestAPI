package curs9;

public class TestShape {

	public static void main(String[] args) {

		Square forma = new Square("patrat", "galben");
		
		System.out.println(forma.culoare);
		System.out.println(forma.nume);
		
		forma.printDetails();
	}

}