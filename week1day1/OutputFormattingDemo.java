package week1day1;

public class OutputFormattingDemo {

	public static void main(String[] args) {
		
		String account = "Prime";
		double total = 210.35234;
		int years = 5;
		
		// I want to display the following sentence:
		// The Prime account saves you 210.35 dollars
		// over 5 years.
		
		// Option 1: Use "+" to connect different parts
		System.out.println("The " + account + " account saves you $"
				+ total + " dollars over " + years + " years.");
		
		// Option 2: Use string formatting
		String output = String.format(
				"The %s account saves you $%.2f dollars over %d years.",
				account, total, years);
		System.out.println(output);
				

	}

}
