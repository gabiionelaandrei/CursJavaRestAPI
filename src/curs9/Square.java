package curs9;

public class Square extends Shape{

	public Square(String nume, String culoare) {
		super(nume, culoare);
	}

	String nume = "oval";
	String culoare = "verde";
	
	
	
	public void printDetails() {
		System.out.println("Numele este " + super.nume +
				" si culoarea este " + super.culoare );
		
	}
	
}