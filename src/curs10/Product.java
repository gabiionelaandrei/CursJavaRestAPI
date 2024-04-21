package curs10;

public class Product {
	protected String nume;
	protected int cantitate;
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public int getCantitate() {
		return cantitate;
	}
	public void setCantitate(int cantitate) {
		this.cantitate = cantitate;
	}
	
	public int cantitateDisponibila() {
		System.out.println("Cantitatea disponibila este " + cantitate);
		return cantitate;
	}
}
