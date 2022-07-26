package week2day2;

public class InvalidGenderException extends Exception {
	
	public InvalidGenderException(String message) {
		super("Invalid gender: " + message);
	}

}
