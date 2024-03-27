package curs4;
/*
 * verifc daca cosul este gol si printam
 * verifc daca total cos este peste 100
 * verific daca nr de produse este mai mare ca 5 si total cos este mai mare ca 120
 * 	-> numar de prouse este mare si total cos este mare
 *  -> numar de produse este mic si totalul este mic
 * 
 * 
 */


public class TernaryExample3 {

	public static void main(String[] args) {

		int totalCosCumparaturi = 120;
		int numarProduseInCos = 0;
		
		//verifc daca cosul este gol si printam
		String mesaj = (numarProduseInCos == 0)? "Cosul este gol":"Cosul nu este gol";
		System.out.println(mesaj);
		// verifc daca total cos este peste 100
		mesaj = totalCosCumparaturi >100 ? "Total cumparaturi peste 100": "Total sub 100";
		System.out.println(mesaj);
		/* verific daca nr de produse este mai mare ca 5 
		 * --> daca este verific si daca total cos este mai mare ca 120
		 				* 	-> numar de prouse este mare si total cos este mare
		 				*  -> numar de produse este mare si totalul este mic
		 * --> nr de produse este mic
		 */
		mesaj = (numarProduseInCos >5)? ((totalCosCumparaturi>120) ?
				"numar de prouse este mare si total cos este mare":
					"numar de produse este mare si totalul este mic"):
						"nr de produse este mic";
		
		System.out.println(mesaj);
		
		if(numarProduseInCos >5) {
			
			if(totalCosCumparaturi>120) {
				System.out.println("numar de prouse este mare si total cos este mare");
			}else {
				System.out.println("\"numar de produse este mare si totalul este mic\"");
			}
			
		}else {
			System.out.println("nr de produse este mic");
		}
		
		
	}

}