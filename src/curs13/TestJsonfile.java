package curs13;

public class TestJsonfile {

	public static void main(String[] args) {

		JsonFileProcessor obj =  new JsonFileProcessor();
		obj.writeJsonFile();
		
		obj.readJsonFile("email");
		
		System.out.println("-------------------------------");
		
		obj.updateJsonFile("name", "Maria");
		obj.readJsonFile("name");
		
		System.out.println("-------------------------------");
		
		obj.deleteFromJsonFile("name");
		obj.readJsonFile("name");

	}

}