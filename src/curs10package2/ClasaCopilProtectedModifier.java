package curs10package2;

import curs10package1.ProtectedAccesModifier;

public class ClasaCopilProtectedModifier extends ProtectedAccesModifier{
	// * Sub-clasa sau clasa copil din  alt pachet : yes
	public static void main(String[] args) {

		ClasaCopilProtectedModifier obj =  new ClasaCopilProtectedModifier();
		obj.printMesaj();
		
		
	}

}