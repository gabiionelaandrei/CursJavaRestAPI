package curs11;

public class Mobile extends Product{

	private int buyPrice;
	private int tva;
	
	public Mobile(int buyPrice,int tva ) {
		this.buyPrice = buyPrice;
		this.tva = tva;
	}
	
	
	@Override
	public int caluclatePrice() {
		return buyPrice + tva;
	}

}