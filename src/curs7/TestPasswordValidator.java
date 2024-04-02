package curs7;

public class TestPasswordValidator {

	public static void main(String[] args) {

		PasswordValidator obj =  new PasswordValidator();
		obj.printPasswordRules();
		obj.readUsername();
		obj.validatePassword();
		
		
	}

}