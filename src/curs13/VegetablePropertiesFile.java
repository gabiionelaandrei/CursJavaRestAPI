package curs13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class VegetablePropertiesFile {
public void writePropertiesFile() {
		
		try(FileOutputStream output =  new FileOutputStream("vegetable.properties")) {
			
			Properties propFile = new Properties();
			propFile.setProperty("carrot", "58");
			propFile.setProperty("potato", "80");
			propFile.setProperty("tomato", "22");
			propFile.setProperty("cucumber", "13");
			propFile.setProperty("beet", "40");
			
			propFile.store(output, "The file was saved");
			
			//output.close();
		}catch(IOException e){	
			System.out.println("The file couldn't be written!");
			e.printStackTrace();
		}
		
	}
public String readPropertiesFile(String key) {
	
	try(FileInputStream input =  new FileInputStream("vegetable.properties")){
		
		Properties propFile =  new Properties();
		propFile.load(input);
		System.out.println(propFile.getProperty(key));
		String value = propFile.getProperty(key);
		if(value != null) {
			return "The vegetable that you entered has " + value + " calories.";
		}
		else {
			return "We don't sell this vegetable.Please pick another vegetable.";
		}
		
	}catch(IOException e) {
		System.out.println("I couldn't read the file!");
		e.printStackTrace();
		return "The file doesn't exist! ";
	}
	
	
	
}
}
