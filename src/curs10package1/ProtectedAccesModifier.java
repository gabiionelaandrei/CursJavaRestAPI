package curs10package1;

public class ProtectedAccesModifier {
/*
 * Scopul lui protected este in acelasi pachet si sub clase din alte pachete
 * Clasele nu pot fi declarate ca protected
 * 
 * Aceasi clasa : yes
 * Alta clasa acelasi pachet : yes
 * Sub-clasa sau clasa copil acelasi pachet : yes
 * Alta clasa din alt pachet : no
 * Sub-clasa sau clasa copil din  alt pachet : yes
 * 
 */
	
	
	protected String mesaj = "Protected acces modifier";

	protected void printMesaj() {
		System.out.println(mesaj);
	}

}
