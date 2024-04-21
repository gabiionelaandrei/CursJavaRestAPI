package curs9;

public class TeacherApp {

	public static void main(String[] args) {
		Qualification qualification = new Qualification("Java","Afternoon",3);
		Qualification qualification1 = new Qualification("Java","Afternoon",4);
		qualification.verify();
		qualification1.verify();
	}

}
