package curs2;
/*
 * Conventie naming Java:
 * --numele claselor este UpperCamelCase Ex: ExempluVariabila
 * --nume metode si var este lowerCamelCase Ex: numeTester 
 * 
 * Bad practice in java : 
 * clasa exemplu_clasa  sau variabila ex: nume_tester
 * 
 */

public class Tester {
	
	//variabile
	private String numeTester;//String --valoare default null
	private int varstaTester;// numeric--valoare default 0
	

	//metoda
	public void afiseazaDetaliiTester() {
		System.out.println( "Numele testerului este: " + numeTester);
		System.out.println( "Varsta testerului este: " + varstaTester);
		System.out.println( "Lungimea numelui este: " + numeTester.length());
	}
	
	//cosntructor default
	//public Tester() {};
	
	//Tester tester1 =  new Tester("Monica", 34);
	public Tester(String numeTester, int varstaTester) {
		this.numeTester = numeTester;
		this.varstaTester = varstaTester;
	};

	
	
	public Tester(String nume) {
		numeTester = nume;

	};
}