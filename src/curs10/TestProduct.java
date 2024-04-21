package curs10;

public class TestProduct {

	public static void main(String[] args) {
		int cantitateTotala=500;
		int nrProduseExpirate=58;
		int nrProduseDefecte=20;
		
		ProduseDefecte produseDefecte = new ProduseDefecte("telefon", cantitateTotala, nrProduseDefecte);
		cantitateTotala=produseDefecte.cantitateDisponibila();
		
		
		ProduseExpirate produseExpirate = new ProduseExpirate("telefon", cantitateTotala, nrProduseExpirate);
		cantitateTotala=produseExpirate.cantitateDisponibila();
		
		Product produs = new Product();
		produs.setNume("telefon");
		produs.setCantitate(cantitateTotala);
		produs.cantitateDisponibila();
	}
 
}
