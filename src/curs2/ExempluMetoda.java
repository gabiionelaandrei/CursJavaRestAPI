package curs2;

public class ExempluMetoda {

	public static void main(String[] args) {
		ExempluMetoda obj =  new ExempluMetoda();
		
		int latime = 5;
		int lungime = 3;
		
	//	int arieRoom =  latime * lungime;
	//	System.out.println("Arie camera:" + arieRoom);
		System.out.println("Arie camera:" + obj.calculArie(latime, lungime));
		
		int latime2 = 4;
		int lungime2 = 6;
		
		//int arieRoom2 =  latime2 * lungime2;
		//System.out.println("Arie camera2:" + arieRoom2);
		System.out.println("Arie camera2:" + obj.calculArie(latime2, lungime2));
		System.out.println("Perimetru camera2 :" + obj.perimetru);
	}
	
	
	public int calculArie(int latime, int lungime) {
		int arieRoom =  latime * lungime;
		return arieRoom;
	}
	
	int perimetru;
	
	public void calculPerimetru(int latime, int lungime) {
		perimetru = 2 * (latime + lungime);
		
	}
	
	
}