package curs4;

public class TernaryOperator {

	public static void main(String[] args) {

		
		int nr1 = 5;
		int nr2 = 8;
		
		if(nr1 > nr2) {
			System.out.println("Nr 1 este mai mare");
		}else {
			System.out.println("Nr 2 este mai mare");
		}
		//operatorul ternar --> ? :
		// conditie ? expresie true : expresie false;
		
		String result = (nr1 > nr2) ? "Nr 1 este mai mare": "Nr 2 este mai mare";
		System.out.println(result);
		
		int x = nr1>nr2 || nr2 == nr1 ? nr1 : nr2;
		
		int y = nr1>nr2 ? nr1 + nr2 : nr2 /nr1;
		
	}

}