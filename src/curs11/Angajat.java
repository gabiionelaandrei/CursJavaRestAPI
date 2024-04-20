package curs11;

public interface Angajat {

	public static final int salariu = 0;
	
	public void setName(String name);
	public String getName();
	
	public void setEmail(String email);
	public String getEmail();
	
	//public void testCeva();
	
	default void printCeva() {
		
	}
	
}