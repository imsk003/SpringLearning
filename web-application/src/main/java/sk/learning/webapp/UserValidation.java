package sk.learning.webapp;

public class UserValidation {

	public static boolean isValidUser(String name, String pass) {

		if (name.equals("SK")&&pass.equals("somepass")) {
			return true;
		}
		return false;
	}
}
