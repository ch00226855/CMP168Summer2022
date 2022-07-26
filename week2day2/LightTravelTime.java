package week2day2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LightTravelTime {
  public static void main(String[] args) {
     Scanner scnr = new Scanner(System.in);
     double distMiles;
     double lightTravelTimeSec;

     
     System.out.print("Enter distance in miles: ");

     try {
    	 distMiles = scnr.nextDouble();
    	 lightTravelTimeSec = distMiles / 186282.0;
    	 System.out.println(lightTravelTimeSec);
     } catch (InputMismatchException error) {
    	 System.out.println("Must enter a number!");
     }
     
     
  }
}