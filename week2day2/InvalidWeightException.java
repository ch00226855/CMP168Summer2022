package week2day2;

public class InvalidWeightException extends Exception {
	
	public InvalidWeightException(String message) {
		
		super("Invalid weight: " + message);
		
	}

}
