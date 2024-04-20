package curs10;

public class TestWIldAnimal {

	public static void main(String[] args) {

/*		
		Lion leu = new Lion();
		leu.makeSound();//metoda suprascrisa
		leu.eatMeat();//metoda proprie a lui Lion
		leu.whereItLives();//metoda mostenita din clasa parinte
		
		System.out.println("---------------------------");
		
		Deer deer = new Deer();
		deer.makeSound();//metoda suprascrisa
		deer.eatGrass();//metoda proprie a lui Deer
		deer.whereItLives();//metoda mostenita din clasa parinte
		
		*/
		
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FireFoxDriver();
		
		//Lion leu =  new WildAnimal();
		WildAnimal leu =  new Lion();
		leu.makeSound();
		((Lion) leu).eatMeat();
		leu.whereItLives();
		feedAnimal(leu);
		
		leu = new Deer();
		leu.makeSound();
		((Deer) leu).eatGrass();
		leu.whereItLives();
		feedAnimal(leu);
		
	}

	public static void feedAnimal( WildAnimal animal) {
		
		if(animal instanceof Lion) {
			System.out.println("You are getting steak!");
		}else if(animal instanceof Deer) {
			System.out.println("You are getting parsely!");
		}
	}
	
	
}