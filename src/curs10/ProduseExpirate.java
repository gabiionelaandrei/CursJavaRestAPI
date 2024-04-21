package curs10;

public class ProduseExpirate extends Product{
	
	private int produseExpirate;
	public ProduseExpirate(String nume, int cantitate, int produseExpirate) {
		this.nume = nume;
		this.cantitate = cantitate;
		this.produseExpirate = produseExpirate;
	
	}
	
	@Override
	public int cantitateDisponibila() {
		int cantitateDisponibila = cantitate - produseExpirate;
		return cantitateDisponibila;
	}
}
