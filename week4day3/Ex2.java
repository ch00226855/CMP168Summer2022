import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex2 {

	public static void main(String[] args) {
		FileOutputStream file = null;
		PrintWriter writer = null;
		String dayOfWeek = null;
		
		try {
			 file = new FileOutputStream("August.txt", true);
			 writer = new PrintWriter(file);
			 
			 
		// Approach 1: Modulo operator
//			for (int i = 1; i <= 31; i++) {
//				
//				switch (i%7) {
//				case 1:
//					dayOfWeek = "Monday";
//					break;
//				case 2:
//					dayOfWeek = "Tuesday";
//					break;
//				case 3:
//					dayOfWeek = "Wednesday";
//					break;
//				case 4:
//					dayOfWeek = "Thursday";
//					break;
//				case 5:
//					dayOfWeek = "Friday";
//					break;
//				case 6:
//					dayOfWeek = "Saturday";
//					break;
//				case 0:
//					dayOfWeek = "Sunday";
//					break;
//				default:
//					dayOfWeek = "ERROR";
//					break;
//				}
//				
//				writer.printf("08/%02d/2022:", i);
//				writer.print(dayOfWeek);
//				writer.println();
//			}
			 
		// Approach 2: Define a DayOfWeek class
		DayOfWeek dayOfWeekCalculator = new DayOfWeek("Monday");
		for (int i = 1; i <= 31; i++) {
			writer.printf("08/%02d/2022:", i);
			writer.print(dayOfWeekCalculator.getDayOfWeek());
			dayOfWeekCalculator.goToNextDay();
			writer.println();
		}
		
		for (int i = 1; i <= 30; i++) {
			writer.printf("09/%02d/2022:", i);
			writer.print(dayOfWeekCalculator.getDayOfWeek());
			dayOfWeekCalculator.goToNextDay();
			writer.println();
		}
			
			
		} catch (IOException e) {
			System.out.println("August.txt cannot be created.");
		} finally {
			writer.close();
		}

	}
	
	private static class DayOfWeek {
		
		private String dayOfWeek;
		
		public DayOfWeek(String firstDay) {
			this.dayOfWeek = firstDay;
		}
		
		public void goToNextDay() {
			switch (dayOfWeek) {
			case "Monday":
				dayOfWeek = "Tuesday";
				break;
			case "Tuesday":
				dayOfWeek = "Wednesday";
				break;
			case "Wednesday":
				dayOfWeek = "Thursday";
				break;
			case "Thursday":
				dayOfWeek = "Friday";
				break;
			case "Friday":
				dayOfWeek = "Saturday";
				break;
			case "Saturday":
				dayOfWeek = "Sunday";
				break;
			case "Sunday":
				dayOfWeek = "Monday";
				break;
			default:
				dayOfWeek = "ERROR";
				break;
			}
		}
		
		public String getDayOfWeek() {
			return dayOfWeek;
		}
	}

}
