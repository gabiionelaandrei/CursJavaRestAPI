package curs11;

public abstract class Product {
	
	public String numeProdus;
	
	public abstract int caluclatePrice();
	

	public void productRating() {
		System.out.println("The best product");
	}
}