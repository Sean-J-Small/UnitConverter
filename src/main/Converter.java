package main;

import java.util.Scanner;

public class Converter {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int menuSelection = 0;
		int quit = 5;
		float ounce;
		float mL;
		double cup;
		double liter;
		double gallon;
		
		
		//start the loop, request input
		
		while (menuSelection != quit)
			menuSelection = input.nextInt()
		
		
		
	
	public static void menu() {
		System.out.println("Please select an option for conversion: \n"
				+ "1 for Ounces to Millileter \n" 
				+ "2 for Cup to Ounce \n"
				+ "3 for L to mL \n"
				+ "4 for Gallon to Liter \n"
				+ "5 to exit the converter");
	}
		
//		int menuSelection = 0;
//		int quit = 5;
//		float ounce;
//		float mL;
//		double cup;
//		double liter;
//		double gallon;

	public static void ozToML(float ounce, float mL) {
		//receive input for ounce to mL conversion
		ounce = input.nextFloat();
		//computation, 1 oz = 29.5735296 ml
		mL = (float)(ounce * 29.5735296);
		System.out.println(ounce + " Ounces is equal to " + mL + " milliliters." );
	}
	
	public static void cupToOz(float ounce, double cup) {
//		receive input for cup to ounce conversion
		cup = input.nextFloat();
//		//computation, 1 oz = 0.125 cups
		ounce = (float)(cup * 0.125);
		System.out.println(cup + " Cups is equal to " + ounce + " ounces." );}
	}
	
	public static void lToML(double liter, float mL) {
		//receive input for L to mL conversion
		liter = input.nextFloat();
		//computation, 1L = 1000 mL
		mL = (float)(liter * 1000);
		System.out.println(liter + " Liters is equal to " + mL + " milliliters." );
	}
	
	public static void gallonToL(double gallon, double liter) {
		//receive input for gallon to liter conversion
		gallon = input.nextFloat();
//		//computation, 1 gallon = 3.785 Liters
		liter = (float)(gallon * 3.785);
		System.out.println(gallon + " Gallons is equal to " + liter + " Liters." );
//	
	}
	
	public static void quit() {
		System.out.println("Hope you had fun converting, Bye-Bye!");
	}
	

	
}
