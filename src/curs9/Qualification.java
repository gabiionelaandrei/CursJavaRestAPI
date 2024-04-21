package curs9;

public class Qualification extends Teacher {

	public Qualification(String course, String schedule, int experienceyears) {
		this.course = course;
		this.schedule = schedule;
		this.experienceyears = experienceyears;
	}
	
	public void verify(){
		if(getExperienceyears() > 3 && course.equals("Java") && getSchedule().equals("Afternoon")) {
			System.out.println("You qualify to teach at this school!");
		}
		
		else {
			System.out.println("You do not qualify");
		}
	}
	
	
}
