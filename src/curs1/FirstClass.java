package curs1;
/* compilam codul
 * preluat de catre JVM
 * incarca membrii statici ai clasei (var sau metoda declarata cu cuvantul cheie static)
 * initializarea obiectului/clasei
 */
public class FirstClass {

	// single line comment
	/*
	 * multiple
	 * line
	 * comment
	 */
	String nume;
	//var nume = ceva
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstClass obiect = new FirstClass();
		obiect.greetings();
		FirstClass obiect2 = new FirstClass();
		obiect2.greetings();
	}

	
	public void greetings() {	
		System.out.println("Test");
		//sysout --> urmat de ctrl + space
	}
	
	
	
}