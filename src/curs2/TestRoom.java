package curs2;

public class TestRoom {

	public static void main(String[] args) {

		Room baie = new Room(2, 4);
		System.out.println("Arie baie:" + baie.calculArie());
		System.out.println("Perimetru baie:" + baie.calculPerimetru());

		Room dormitor = new Room(8.5, 6.0);
		System.out.println("Arie baie:" + dormitor.calculArie());
		System.out.println("Perimetru baie:" + dormitor.calculPerimetru());
		
		Room bucatarie = new Room(8.5, 6.0,"ALB");
		System.out.println("Bucataria are culoarea:" + bucatarie.afiseazaCuloareDreptunghi());
		System.out.println("Bucataria are culoarea:" + dormitor.afiseazaCuloareDreptunghi());
		
		
	}

}