package curs2;

public class ExempluVariabila {

	//variabila de instanta
	int age = 35;//declarare si initializare variabila
	//constanta
	final int varsta = 30;

	
	
	public void mesaj() {
		//variabila locala
		String nume = "Ion";
		
		//declarare variabila
		String mesaj;
		//initializare variabila
		mesaj = "Salut";
		
		age = 45;
		//varsta = 45;
	}
	
	
	public static void main(String[] args) {
	
		//sysout
		//System.out.println(age);
		
		ExempluVariabila obj = new ExempluVariabila();
		System.out.println(obj.age);
		
	}

}