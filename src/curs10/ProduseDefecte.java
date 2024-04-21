package curs10;

public class ProduseDefecte extends Product{
	private int produseDefecte;
	
	public ProduseDefecte(String nume, int cantitate, int produseDefecte) {
		this.nume = nume;
		this.cantitate = cantitate;
		this.produseDefecte = produseDefecte;
	
	}

	
	@Override
	public int cantitateDisponibila() {
		int cantitateDisponibila = cantitate - produseDefecte;
		return cantitateDisponibila;
	}
}

