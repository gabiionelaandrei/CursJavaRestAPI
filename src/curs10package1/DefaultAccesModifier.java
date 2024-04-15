package curs10package1;


class DefaultAccesModifier {
	/*
	 * Default inseamna atunci cand nu specificam nimic
	 * Scopul lui este limitat la pachetul in care se afla
	 * 
	 * Same class : yes
	 * Alta clasa in acelasi pachet : yes
	 * Sub-class sau clasa copil in acelasi pachet : yes
	 * Alta clasa in alt pachet : no
	 * Sub-clasa sau clasa copil in alt pachet : no
	 * 	
	 */
	
	String mesaj = "Default acces modifier";
	
	void printMesaj() {
		System.out.println(mesaj);
	}
	
}