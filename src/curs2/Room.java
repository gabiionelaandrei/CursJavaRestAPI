package curs2;

public class Room {
	//double -- numar cu virgula
	
	//variabile
	private double lungime;
	private double latime;
	private String culoare = "ALB";
	
	//constructor cu parametri
	public Room(double lungime, double latime) {
		this.latime = latime;
		this.lungime = lungime;
	}
	
	//constructor cu 3 parametri
	
	public Room(double lungime, double latime, String culoare) {
		this.culoare = culoare;
	}
	
	//metode
	public double calculArie() {
		//double arieRoom =  latime * lungime;
		//return arieRoom;
		return latime * lungime;
	}
	

	public double calculPerimetru() {
		return 2 * (latime + lungime);
		
	}
	
	public String afiseazaCuloareDreptunghi() {
		return culoare;
		
	}
	

}